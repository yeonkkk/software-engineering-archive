package com.codestates.coplit; 

public class Solution { 
	public int miniCalculator(int num1, int num2, char operator) {
    // TODO:
    switch (operator) {
      case '+':
        return num1 + num2;
      case '-':
        return num1 - num2;
      case '*':
        return num1 * num2;
      case '/':
        return num1 / num2;
      case '%':
        return num1 % num2;
      default:
        return 0;
    }
	} 
}
