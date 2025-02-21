package com.sms.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringApp {

  public static void main(String[] args) {
    System.out.println("Launching API..");
    SpringApplication.run(SpringApp.class, args);
  }

}