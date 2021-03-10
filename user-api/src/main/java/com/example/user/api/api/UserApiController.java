package com.example.user.api.api;

import com.example.user.api.model.User;
import com.example.user.api.service.UserService;
import io.swagger.annotations.ApiParam;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserApiController implements UserApi {

  @Autowired
  private UserService userService;

  @Override
  public ResponseEntity<User> getUser(@ApiParam(value = "", required = true) @PathVariable("id") String id) {
    return new ResponseEntity<>(userService.getUser(id), HttpStatus.OK);
  }

  @Override
  public ResponseEntity<Void> newUser(User billing) {
    return new ResponseEntity<>(HttpStatus.NOT_IMPLEMENTED);
  }
}
