package com.example.user.api;

import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.ExitCodeGenerator;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@SpringBootApplication
@EnableSwagger2
public class UserApiApplication implements CommandLineRunner {

  public static void main(String[] args) {
    SpringApplication.run(UserApiApplication.class, args);
  }

  @Override
  public void run(String... args) {
    if (args.length > 0 && args[0].equals("exitcode" )) {
      throw new ExitException();
    }
  }

  class ExitException extends RuntimeException implements ExitCodeGenerator {
    private static final long serialVersionUID = 1L;

    @Override
    public int getExitCode() {
      return 10;
    }
  }

}
