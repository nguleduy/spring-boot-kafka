package com.example.bi.api.service;

import com.example.bi.api.model.Bill;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

@Service
public class BiService {

  private static final Logger LOGGER = LoggerFactory.getLogger(BiService.class);

  public void processBilling(Bill bill) {
    LOGGER.info("Getting billing to be showing in BI System : " + bill.toString());
  }
}
