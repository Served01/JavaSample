package chapter4;

import java.util.Scanner;

public class ifSample3 {

	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//2. if ~ else 테스트
		//문제> 데이터가 입력되는데, 남자인지 여자인지를 판별하여 출력하세요.
				/* 1900년대 사람이냐?
				 * 남자: 1, 여자: 2
				 * 2000년대 사람이냐?
				 * 남자: 3, 여자: 4
				 * 
				 */
				
			    System.out.println("숫자(성별구분)를 입력하시오.");
				
		        int number = sc.nextInt();
				
				if(number == 1) {
					System.out.println("남자");
				} else if(number == 3) {
					System.out.println("남자");
				} else if(number == 2) {
					System.out.println("여자");
				} else if(number == 4) {
					System.out.println("여자");
				} else {
					System.out.println("잘못된 데이터입니다.");
				}
				
				// System.out.println(); 이것만 나오면 줄바꾸기 명령어이다.
		       
	}

}
