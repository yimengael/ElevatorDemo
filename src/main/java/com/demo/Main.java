package com.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Main {

  public static void main(String[] args) {
    System.out.println("... EncodeDecode Application Startup ...");
    SpringApplication.run(Main.class, args);
  }
}