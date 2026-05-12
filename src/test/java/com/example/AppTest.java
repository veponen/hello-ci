package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

class AppTest {
  @Test
  void greetingIncludesName() {
    App app = new App();
    assertEquals("Hello, Students!", app.greeting("Students"));
  }
}
