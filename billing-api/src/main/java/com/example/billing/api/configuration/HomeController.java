package com.example.billing.api.configuration;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

  @GetMapping("/" )
  public String index() {
    System.out.println("swagger-ui.html" );
    return "redirect:swagger-ui.html";
  }
}
