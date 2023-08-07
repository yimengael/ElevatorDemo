package com.demo.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.junit.jupiter.MockitoExtension;

@ExtendWith(MockitoExtension.class)
public class GreetingControllerTest {

  @InjectMocks
  GreetingController greetingController;

  @Test
  public void test_greeting() {
    //given
    String name = "bal_test";
    String nameExpected = String.format("Hello, %s!", name);

    //when
    Greeting result = greetingController.greeting(name);

    //then
    Assertions.assertEquals(result.getContent(), nameExpected);
  }
}
