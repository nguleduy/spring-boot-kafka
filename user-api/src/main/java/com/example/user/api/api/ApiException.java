package com.example.user.api.api;

public class ApiException extends Exception {

  private Integer code;

  public ApiException(Integer code, String msg) {
    super(msg);
    this.code = code;
  }

}
