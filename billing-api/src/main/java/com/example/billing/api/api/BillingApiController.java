package com.example.billing.api.api;

import com.example.billing.api.model.Bill;
import com.example.billing.api.service.BillingService;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
public class BillingApiController implements BillingApi {

  private static final Logger LOGGER = LoggerFactory.getLogger(BillingApiController.class);

  @Autowired
  private BillingService billingService;

  @Override
  public ResponseEntity<Bill> newBill(@ApiParam() @Valid @RequestBody Bill bill) {
    return new ResponseEntity<>(billingService.createBill(bill), HttpStatus.CREATED);
  }

  @Override
  public ResponseEntity<String> getBilling(@PathVariable(value = "id" ) String id) {
    return new ResponseEntity<>(id + "hello", HttpStatus.OK);
  }
}
