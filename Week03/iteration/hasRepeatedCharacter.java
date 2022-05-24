package com.codestates.coplit; 

public class Solution { 
	public boolean hasRepeatedCharacter(String str) {
    for (int reference = 0; reference < str.length()-1; reference++){
      for (int compare = reference + 1; compare < str.length()-1; compare++) {
        if (str.charAt(reference) == str.charAt(compare)) return true;
      }
    }
    return false;
	} 
}
