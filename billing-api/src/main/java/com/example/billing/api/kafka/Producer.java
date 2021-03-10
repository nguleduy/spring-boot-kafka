package com.example.billing.api.kafka;

import com.example.billing.api.model.KafkaMessage;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Component;

@Component
public class Producer {

  private static final Logger LOGGER = LoggerFactory.getLogger(Producer.class);

  @Autowired
  private KafkaTemplate<String, String> kafkaTemplate;

  public void publishMessage(KafkaMessage kafkaMessage) {
    LOGGER.info("sending payload from Producer Billing='{}' to topic='{}'", kafkaMessage.getMessage(), kafkaMessage.getTopic());
    kafkaTemplate.send(kafkaMessage.getTopic(), kafkaMessage.getMessage());
  }

}
