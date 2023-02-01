package com.codestates.coplit; 

public class Solution { 
	public int makeMultiplesOfDigit2(int num1, int num2) {
    int count = 0;
    if (num1==num2 && num1 % 2 == 0 && num1 != 0){
      count=1;
    }
    else if (num1 > num2){
      for (int i=num2;i<=num1;i++){
        if (i % 2 == 0 && i != 0) {
          count ++;
        }
      }
    }
    else if (num2 > num1) {
      for (int i=num1;i<=num2;i++){
        if (i % 2 == 0 && i != 0) {
          count ++;
        }
      }
    }
    return count;
	} 
}
