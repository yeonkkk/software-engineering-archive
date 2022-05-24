package com.codestates.coplit; 

public class Solution { 
	public String fizzBuzz(int num) {
    // TODO:
    if (num % 3 == 0 && num % 5 == 0) {
      return "FizzBuzz";
    }
    else if (num % 3 == 0) {
      return "Fizz";
    }
    else if (num % 5 == 0) {
      return "Buzz";
    }
    else {
      return "No FizzBuzz";
    }
	} 
}
