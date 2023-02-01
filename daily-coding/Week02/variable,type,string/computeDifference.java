package com.codestates.coplit; 

public class Solution { 
	public String computeDifference(int num1, int num2) {
    int output = Math.abs(num1-num2);
    return String.format("%d, %d의 차이는 %d입니다.", num1, num2, output);
	} 
}
