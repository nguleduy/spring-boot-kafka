package com.example.user.api.api;

import com.example.user.api.model.User;
import com.example.user.api.service.UserService;
import com.fasterxml.jackson.databind.ObjectMapper;
import io.swagger.annotations.ApiParam;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController implements UserApi {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserApiController.class);

  @Autowired
  private ObjectMapper objectMapper;

  @Autowired
  private UserService userService;

  @Override
  public ResponseEntity<User> getUser(@ApiParam(value = "", required = true) @PathVariable("id") String id) {
    return new ResponseEntity<User>(userService.getUser(id), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Void> newUser(User billing) {
    return new ResponseEntity<Void>(HttpStatus.NOT_IMPLEMENTED);
  }
}
