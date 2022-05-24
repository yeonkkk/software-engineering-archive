package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public long computeCountOfFemaleMember(List<Member> members) {
    //구현된 Member 클래스의 getName(), getGender() 메소드로 해당 Member 클래스의 name, gender를 확인할 수 있습니다.
    return members.stream()
            .filter(n -> n.getGender() == "Female")
            .count();
  }

	// 아래 코드는 변경하지 마세요.
	static class Member {
    String name;
    String gender;

		public Member(String name, String gender) {
			this.name = name;
			this.gender = gender;
		}
		
    public String getName() {
      return name;
    }

    public String getGender() {
      return gender;
    }
  }
}
