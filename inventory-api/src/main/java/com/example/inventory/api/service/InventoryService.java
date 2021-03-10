package com.example.inventory.api.service;

import com.example.inventory.api.model.ItemOrder;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InventoryService {

  private static final Logger LOGGER = LoggerFactory.getLogger(InventoryService.class);

  public void processOrder(List<ItemOrder> order) {
    order.stream().forEach(this::manageInventory);
  }

  private void manageInventory(ItemOrder itemOrder) {
    LOGGER.info("Processing " + itemOrder.toString());
  }
}
