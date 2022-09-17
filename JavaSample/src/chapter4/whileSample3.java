package chapter4;

import java.util.Scanner;

public class whileSample3 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		/*
		 *  while (조건식)
		 *  변수 선언
		 *  조건식
		 *  증감식
		 */
		int i = 0;
		while(i<3) {
			
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
			System.out.println();
			// System.out.println(); 이것만 나오면 줄바꾸기 명령어이다.
			i++;
			}
		    //i++가 여기에 있으면 계속 반복됨 왜냐하면 i가 증가하는 판정이 안되므로
	}
}
