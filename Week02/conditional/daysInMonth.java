package com.codestates.coplit; 

public class Solution { 
	public int daysInMonth(int month) {
    // TODO:
    switch (month) {
      case 4:
      case 6:
      case 9:
      case 11:
        return 30;
      case 2:
        return 28;
      default:
        return 31;
    }
	} 
}
