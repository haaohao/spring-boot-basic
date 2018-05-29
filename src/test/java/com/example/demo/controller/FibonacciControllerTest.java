package com.example.demo.controller;

import org.junit.Assert;
import org.junit.Test;

public class FibonacciControllerTest {

  @Test
  public void should_return_1_when_get_fibonacci_given_number_1() throws Exception {
    Assert.assertEquals((int) new FibonacciController().getFibonacci(1), 2);
  }

}