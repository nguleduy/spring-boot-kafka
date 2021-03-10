package com.example.user.api.kafka;

import com.example.user.api.model.Bill;
import com.example.user.api.model.KafkaMessage;
import com.example.user.api.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {

  private static final Logger LOGGER = LoggerFactory.getLogger(Consumer.class);

  @Autowired
  private UserService userService;

  @Autowired
  private ObjectMapper objectMapper;

  @Autowired
  private Producer producer;

  @Value("${kafka.topic.billing-user-created}")
  private String userCreatedTopic;

  @KafkaListener(topics = "${kafka.topic.billing}")
  public void consumeBilling(ConsumerRecord<?, ?> consumerRecord) {
    LOGGER.info("received payload from Consumer User='{}'", consumerRecord.value().toString());
    Bill bill = getBill(consumerRecord.value().toString());
    userService.createOrUpdateUser(bill.getUser());
    producer.publishMessage(new KafkaMessage(userCreatedTopic, consumerRecord.value().toString()));
  }

  private Bill getBill(String jsonBill) {
    try {
      return objectMapper.readValue(jsonBill, Bill.class);
    } catch (Exception e) {
      LOGGER.error(e.toString());
      return null;
    }
  }

}
