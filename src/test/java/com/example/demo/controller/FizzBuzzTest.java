package com.example.demo.controller;

import static org.hamcrest.MatcherAssert.assertThat;
import static sun.nio.cs.Surrogate.is;

import org.assertj.core.api.Assertions;
import org.junit.Test;

public class FizzBuzzTest {

  @Test
  public void should_return_1_when_getFizzBuzz_given_number_1() throws Exception {
    Assertions.assertThat(new FizzBuzz().getFizzBuzz(1)).isEqualTo("1");
  }

  @Test
  public void should_return_2_when_getFizzBuzz_given_number_2() throws Exception {
    Assertions.assertThat(new FizzBuzz().getFizzBuzz(2)).isEqualTo("2");
  }
}