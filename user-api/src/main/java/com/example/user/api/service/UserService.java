package com.example.user.api.service;

import com.example.user.api.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.stereotype.Service;


@Service
public class UserService {

  private static final Logger LOGGER = LoggerFactory.getLogger(UserService.class);

  public void createOrUpdateUser(User user) {
    LOGGER.info("create user " + user.toString());
  }

}
