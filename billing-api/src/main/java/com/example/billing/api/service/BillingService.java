package com.example.billing.api.service;

import com.example.billing.api.kafka.Producer;
import com.example.billing.api.model.Bill;
import com.example.billing.api.model.KafkaMessage;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class BillingService {

  private static final Logger log = LoggerFactory.getLogger(BillingService.class);

  @Autowired
  private Producer producer;

  @Autowired
  ObjectMapper mapper = new ObjectMapper();

  @Value("${kafka.topic.billing}")
  private String createUserTopic;

  public Bill createBill(Bill bill) {
    try {
      bill.setId(UUID.randomUUID().toString());
      producer.sendBilling(new KafkaMessage(createUserTopic, mapper.writeValueAsString(bill)));
      return bill;
    } catch (Exception e) {
      log.error(e.toString());
      return bill;
    }
  }

}
