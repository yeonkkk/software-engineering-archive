package com.codestates.coplit; 

public class Solution { 
	public String type() {
    int num;
    char thing;

    thing = 'A';
    num = 3;
    return goCheck(num, thing);
  }

  public String goCheck(int num, char thing) {
    return String.format("코딩아, 공구함에 있는 건전지말야. %c가 %d개 들어있는게 맞니?", thing, num);
  }
}
