package com.example.user.api.api;

import com.example.user.api.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import org.springframework.http.ResponseEntity;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

@Api(value = "user" )
public interface UserApi {

  @ApiOperation(value = "get a  user", nickname = "getUser", notes = "create a new user", response = User.class, tags = {})
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "valid user", response = User.class),
          @ApiResponse(code = 400, message = "invalid input" )})
  @GetMapping(value = "/user/{id}", produces = {"application/json"}, consumes = {"application/json"})
  ResponseEntity<User> getUser(@ApiParam(value = "", required = true) @PathVariable("id" ) String id);


  @ApiOperation(value = "create a new user", nickname = "newUser", notes = "create a new user", tags = {})
  @ApiResponses(value = {
          @ApiResponse(code = 200, message = "bill created" ),
          @ApiResponse(code = 400, message = "invalid input, object invalid" )})
  @PostMapping(value = "/user", produces = {"application/json"}, consumes = {"application/json"})
  ResponseEntity<Void> newUser(@ApiParam(value = "" ) @Validated @RequestBody User billing);

}
