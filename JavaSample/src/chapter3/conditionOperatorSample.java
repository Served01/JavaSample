package chapter3;

import java.util.Scanner;

public class conditionOperatorSample {
	
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		// 3항 연산자 = 조건 연산자
		// x = (조건식) ? 참(조건식, 수식, 변숙(값)): 거짓(조건식, 수식, 변수(값));
		
		for(int i=0; i<10; i++) { //i<=10으로 하게 되면 총 11번 반복하게 된다.
		int value = sc.nextInt();
		
		String grade = (value >= 90)? "A": (value >= 80)? "B": 
			(value >= 70)? "C": (value >= 60)? "D": "F"; 
		System.out.println(grade);
		}
	}
}

