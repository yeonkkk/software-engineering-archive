package com.codestates.coplit; 

public class Solution { 
    public int computeSumOfAllElements(int[] arr) {
        int sum = 0;
    if(arr.length == 0) return 0;

        for(int i : arr){
            sum+=i;
        }

        return sum;

    } 
}
