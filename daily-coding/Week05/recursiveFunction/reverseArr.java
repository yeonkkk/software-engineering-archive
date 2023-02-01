import java.util.*;

public class Solution { 
    public int[] reverseArr(int[] arr){
    int n = arr.length;
    
    if (n<=1) return arr;
    
    int[] Arr1 = new int[n];
    Arr1[0] = arr[n-1];

    int[] Arr2 = Arrays.copyOfRange(arr, 0, n-1);
    System.arraycopy(reverseArr(Arr2),0,Arr1,1, n-1);
    return Arr1;
    } 
}
