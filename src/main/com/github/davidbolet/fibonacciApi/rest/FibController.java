package com.github.davidbolet.fibonacciApi.rest;

import com.github.davidbolet.fibonacciApi.domain.FibonacciResult;
import com.github.davidbolet.fibonacciApi.service.Fibonacci;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FibController {

  @GetMapping("/")
  public FibonacciResult GetFibonacciValue(@RequestParam(value = "value", defaultValue = "1") Integer value) {
    FibonacciResult result = new FibonacciResult();
    result.setResult(Fibonacci.fib(value));
    return result;
  }
}
