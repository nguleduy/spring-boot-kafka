package com.example.billing.api.api;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@Getter
@Setter
public class ApiResponseMessage {

  public static final int ERROR = 1;
  public static final int WARNING = 2;
  public static final int INFO = 3;
  public static final int OK = 4;
  public static final int TOO_BUSY = 5;

  int code;
  String type;
  String message;

  public ApiResponseMessage(int code, String message) {
    this.code = code;
    switch (code) {
      case ERROR:
        setType("error" );
        break;
      case WARNING:
        setType("warning" );
        break;
      case INFO:
        setType("info" );
        break;
      case OK:
        setType("ok" );
        break;
      case TOO_BUSY:
        setType("too busy" );
        break;
      default:
        setType("unknown" );
        break;
    }
    this.message = message;
  }

}
