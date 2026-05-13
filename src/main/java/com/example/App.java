package com.example;

public class App {
  public String greeting(String name) {
    return "Hello, " + name + "!";
  }

  public static void main(String[] args) {
    App app = new App();
    System.out.println(app.greeting("CI class"));
  }
}
