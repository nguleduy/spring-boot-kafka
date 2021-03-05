package com.example.billing.api.api;

import com.example.billing.api.model.Bill;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import javax.validation.Valid;

@Api(value = "billing" )
public interface BillingApi {

  @ApiOperation(value = "create a new billing", nickname = "newBill", notes = "create a new billing", tags = {})
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "bill created" ),
          @ApiResponse(code = 400, message = "invalid input, object invalid" )})
  @PostMapping(value = "/billing", produces = {"application/json"}, consumes = {"application/json"})
  ResponseEntity<Bill> newBill(@ApiParam(value = "" ) @Valid @RequestBody Bill billing);

  @ApiOperation(value = "searches place", notes = "get places", response = String.class, responseContainer = "List", tags = {})
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "all places", response = String.class),
          @ApiResponse(code = 400, message = "bad input parameter", response = String.class)})
  @GetMapping(value = "/billing/{id}", produces = {"application/json"})
  ResponseEntity<String> getBilling(@PathVariable(value = "id" ) String id);


}
