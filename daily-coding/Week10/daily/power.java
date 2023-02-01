import java.util.*;

public class Solution { 

	// 1. while 문
	public long power(int base, int exponent) {
		int answer = 1;
		int count = 0;

		while (count < exponent) {
			answer = (answer * base) % 94906249;
			count++;
		}

		return answer;
	} 

		// 2. 재귀함수
		public long power(int base, int exponent) {

    // exponent변수가 0이 될때까지 재귀
    if(exponent == 0) return 1;
    int half = exponent / 2;
    long sub = power(base, half);

		// 나머지 연산 계산
    long result = (sub * sub) % 94906249;

    // 결과값을 사용하여 홀수일 경우 다시 연산
    if(exponent % 2 == 1) return (base * result) % 94906249;
    else return result;
  }
}
