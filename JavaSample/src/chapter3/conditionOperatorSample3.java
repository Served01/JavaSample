package chapter3;

import java.util.Scanner;

public class conditionOperatorSample3 {
 
	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		//문제> 데이터가 입력되는데, 홀수인지 짝수인지를 판별하여 출력하세요.
		/* 홀수: 1, 3, 5, 7, 9 ...
		 * 짝수: 2, 4, 6, 8, 10 ...
		 * 구분
		 * -----------------
		 * 100/2 의 경우 몫과 나머지로 처리 되는데
		 * 이 때, 나머지가 0이면 짝수이고, 1이면 홀수....
		 * 
		 */
		
		int number = sc.nextInt();
		
		String number2 = (number%2 == 1)? "홀수" : (number%2 == 0)? "짝수" : "잘못된 데이터입니다.";
		// 언제나 말하지만 네이밍 잘 하는것도 코딩 실력이다.
		
		System.out.println(number2);
				
	}

}
