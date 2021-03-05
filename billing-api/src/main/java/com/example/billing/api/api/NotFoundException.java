package com.example.billing.api.api;

public class NotFoundException extends ApiException {

  private Integer code;

  public NotFoundException(Integer code, String msg) {
    super(code, msg);
    this.code = code;
  }
}
