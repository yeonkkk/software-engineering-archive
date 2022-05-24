package com.codestates.coplit; 

public class Solution { 
	public String followingDay(String day) {
    // TODO:
    if (day.equals("월요일")){
      return "화요일";
    }
    else if (day.equals("화요일")){
      return "수요일";
    }
    else if (day.equals("수요일")){
      return "목요일";
    }
    else if (day.equals("목요일")){
      return "금요일";
    }
    else if (day.equals("금요일")){
      return "토요일";
    }
    else if (day.equals("토요일")){
      return "일요일";
    }
    else if (day.equals("일요일")){
      return "월요일";
    }
    else {
      return "올바른 요일이 아닙니다";
    }
	} 
}
