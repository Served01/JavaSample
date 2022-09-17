package chapter3;

import java.util.Scanner;

public class conditionOperatorSample2 {
 
	static Scanner sc = new Scanner(System.in);
 
	public static void main(String[] args) {
		//문제> 데이터가 입력되는데, 남자인지 여자인지를 판별하여 출력하세요.
		/* 1900년대 사람이냐?
		 * 남자: 1, 여자: 2
		 * 2000년대 사람이냐?
		 * 남자: 3, 여자: 4
		 * 
		 */
		int number = sc.nextInt();
		
		String gender = (number == 1)? "남자" : (number == 3)? "여자" :
			(number == 2)? "여자" : (number == 4)? "여자" : "잘못된 데이터입니다.";
		
		System.out.println(gender);
				
	}

}
