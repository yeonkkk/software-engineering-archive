public class Solution { 
  public int sumTo(int num){
    if (num <= 1) return num;
    return num + sumTo(num-1);
  }
}
