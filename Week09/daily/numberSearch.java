import java.util.*;

public class Solution { 
	public int numberSearch(String str) {
    if (str.length() == 0) return 0;
    
    double sum = 0.0;
    int strLen = 0; 
    char cur;

    for (int i=0; i<str.length(); i++){
      cur = str.charAt(i);
      if (Character.isDigit(cur)) sum += cur - '0';
      else if (str.charAt(i) != ' ') strLen++;
    }
    return (int) Math.round(sum / strLen);
	} 
}
