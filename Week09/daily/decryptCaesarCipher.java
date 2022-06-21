import java.util.*;

public class Solution { 
	public String decryptCaesarCipher(String str, int secret) {
    if (str.length() == 0 || secret == 0) return str;
		String result = "";
		int n;

		for (int i=0; i < str.length(); i++) {
			if (str.charAt(i) == ' ') result += ' ';
			else {
				n = (int) str.charAt(i) - secret;
				if (n < 97) n = n + 26;
				result += String.valueOf((char) n); 
			}
		}
		return result;
	} 
}
