package com.github.davidbolet.fibonacciApi.service;

import java.math.BigInteger;

//Fibonacci Series using Optimized Method
//This code is taken from https://www.geeksforgeeks.org/program-for-nth-fibonacci-number/
public class Fibonacci
{
  /* function that returns nth Fibonacci number */
  public static BigInteger fib(int n)
  {
    BigInteger F[][] = new BigInteger[][]{{BigInteger.ONE,BigInteger.ONE},{BigInteger.ONE,BigInteger.ZERO}};
    if (n==0)
      return BigInteger.ZERO;
    power(F, n-1);

    return F[0][0];
  }

  private static void multiply(BigInteger F[][], BigInteger M[][])
  {
    BigInteger x = F[0][0].multiply(M[0][0]).add(F[0][1].multiply(M[1][0]));
    BigInteger y = F[0][0].multiply(M[0][1]).add(F[0][1].multiply(M[1][1]));
    BigInteger z = F[1][0].multiply(M[0][0]).add(F[1][1].multiply(M[1][0]));
    BigInteger w = F[1][0].multiply(M[0][1]).add(F[1][1].multiply(M[1][1]));

    F[0][0] = x;
    F[0][1] = y;
    F[1][0] = z;
    F[1][1] = w;
  }

  /* Optimized version of power() in method 4 */
  private static void power(BigInteger F[][], int n)
  {
    if( n == 0 || n == 1)
      return;
    BigInteger M[][] = new BigInteger[][]{{BigInteger.ONE,BigInteger.ONE},{BigInteger.ONE,BigInteger.ZERO}};

    power(F, n/2);
    multiply(F, F);

    if (n%2 != 0)
      multiply(F, M);
  }

}



