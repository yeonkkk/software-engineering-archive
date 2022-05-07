package com.codestates.coplit; 

public class Solution { 
	public boolean isPythagorean(int side1, int side2, int side3) {
    // TODO:
    int temp, maxSide;
    temp = (side1 > side2) ? side1:side2;
    maxSide = (temp > side3) ? temp:side3;  
  
    if (2 * Math.pow(maxSide,2) == Math.pow(side1,2) + Math.pow(side2,2) + Math.pow(side3,2)){
      return true;
    }
    else {
      return false;
    }
  }
}
