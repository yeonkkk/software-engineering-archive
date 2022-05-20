package com.codestates.coplit; 
import java.util.*;

public class Solution { 
  public boolean isMember(HashMap<String, String> member, String username, String password) {
    if (member.containsKey(username)) {
      return member.get(username).equals(password);
    }
    return false;
  }
}
