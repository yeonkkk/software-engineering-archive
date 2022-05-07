package com.codestates.coplit; 

public class Solution { 
  public String convertScoreToGradeWithPlusAndMinus(int score) {
    String grade;
    if (score > 100 || score < 0) {
      return "INVALID SCORE";
    }
    if (score == 100) {
      return "A+";
    }
    if (score >= 90) {
      grade = "A";
    } else if (score >= 80) {
      grade = "B";
    } else if (score >= 70) {
      grade = "C";
    } else if (score >= 60) {
      grade = "D";
    } else {
      grade = "F";
    }

    if (!grade.equals("F")) {
      int extra = score % 10;
      if (extra <= 2) {
        grade = grade + "-";
      } else if (extra >= 8) {
        grade = grade + "+";
      }
    }

    return grade;
  } 
}
