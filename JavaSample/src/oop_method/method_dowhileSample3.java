package oop_method;

import java.util.Scanner;

public class method_dowhileSample3 {
	static Scanner sc = new Scanner(System.in);
	
	public void genderselect() {
		boolean genders = true;
		
		do {
			//int i = 0
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
			//i++
			} while(genders);
		    //i++가 여기에 있으면 계속 반복됨 왜냐하면 i가 증가하는 판정이 안되므로
	}
	
	public static void main(String[] args) {
		
		method_dowhileSample3 mds3 = new method_dowhileSample3();
		mds3.genderselect();
		
	}
}
/* 요구사항 파악: 1,3남자로 2,4여자로 판별하여 출력하시오.
 * 
 * method 사용 결정
 * 1) 클래스로 오브젝트를 생성합니다.
 * 2) 참조변수형(객체명), 메소드명으로 호출 (전달인자 유무 파악)
 * 3) 해당 메소드에서 알고리즘으로 내용을 처리한다.
 * 4) 반환값 유무 처리
 * 5) 결과를 저장
 * 6) 출력
 * 
 * 
 */