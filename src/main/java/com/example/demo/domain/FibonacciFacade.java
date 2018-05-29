package com.example.demo.domain;

public class FibonacciFacade {

  public static int getFibonacci(int number) {
    if (number <= 2) {
      return 1;
    } else {
      return getFibonacci(number - 1) + getFibonacci(number - 2);
    }
  }

}
