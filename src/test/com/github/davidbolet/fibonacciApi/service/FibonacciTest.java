package com.github.davidbolet.fibonacciApi.service;


import org.junit.Test;
import java.math.BigInteger;

import static org.hamcrest.Matchers.is;
import static org.junit.Assert.assertThat;

public class FibonacciTest {

  /**
   * Test basic cases
   */
  @Test
  public void testAssertBasicCases() {
    assertThat(Fibonacci.fib(0),is(BigInteger.ZERO));
    assertThat(Fibonacci.fib(1),is(BigInteger.ONE));
  }

  /**
   * Test some known results
   */
  @Test
  public void testFourCases() {
    assertThat(Fibonacci.fib(10),is(BigInteger.valueOf(55)));
    assertThat(Fibonacci.fib(15),is(BigInteger.valueOf(610)));
  }
}