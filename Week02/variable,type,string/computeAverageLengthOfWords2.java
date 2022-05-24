package com.codestates.coplit; 

public class Solution { 
	public int computeAverageLengthOfWords2(String word1, String word2) {
    int result = (int) (word1.length() + word2.length()) / 2;
    return result;
	} 
}
