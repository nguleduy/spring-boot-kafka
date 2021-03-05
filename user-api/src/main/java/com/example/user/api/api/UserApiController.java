package com.example.user.api.api;

import com.example.user.api.model.User;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;

@RestController
public class UserApiController implements UserApi {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserApiController.class);

  @Autowired
  private ObjectMapper objectMapper;

  @Override
  public ResponseEntity<User> getUser(String id) {
    try {
      return new ResponseEntity<>(objectMapper.readValue("{  \"address\" : \"address\",  \"name\" : \"name\",  \"id\" : \"id\",  \"email\" : \"email\"}", User.class), HttpStatus.NOT_IMPLEMENTED);
    } catch (IOException e) {
      LOGGER.error("Couldn't serialize response for content type application/json", e);
      return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @Override
  public ResponseEntity<Void> newUser(User billing) {
    return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
  }
}
