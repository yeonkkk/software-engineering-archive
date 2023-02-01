package com.codestates.coplit; 

public class Solution { 
	public String addOneSecond(int hour, int minute, int second) {
    second++;
    if (second >= 60) {
      second = 0;
      minute++;
      if (minute >= 60) {
        minute = 0;
        hour++;
        if (hour == 24) {
          hour = 0;
        } 
      }
    }
    return String.format("1초 뒤에 %d시 %d분 %d초 입니다", hour, minute, second);
	} 
}
