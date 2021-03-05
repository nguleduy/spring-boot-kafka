package com.example.billing.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class BillingApiApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(BillingApiApplication.class, args);
  }

  @Override
  public void run(String... args) {
    if (args.length > 0 && args[0].equals("exitcode" )) {
      throw new ExitException();
    }
  }

  class ExitException extends RuntimeException implements ExitCodeGenerator {

    @Override
    public int getExitCode() {
      return 10;
    }
  }
}
