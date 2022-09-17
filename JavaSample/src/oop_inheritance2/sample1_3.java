package oop_inheritance2;

import java.util.Scanner;

public class sample1_3 extends AAA {
	/* 
	 * input: value, class A
	 * process: process(), class B
	 * output: grade, class C
	 * 1. public class A extends B {...}: 일반 클래스 (지금 sample이 이것을 적용한 사례)
	 * 2. public class A extends B {...}: 추상 클래스 
	 * 
	 */
//상속을 이용한 학점 구하기
	static int value;
	static String grade;
	static Scanner sc = new Scanner(System.in);
	
	@Override
	public void input() {
			
			System.out.println("점수를 입력하시오.");
		    value = sc.nextInt(); 
		
	}

	@Override
	public void process() {
		grade = (value >= 90)? "A": (value >= 80)? "B": 
			(value >= 70)? "C": (value >= 60)? "D": "F"; 
		
	}

	@Override
	public void output() {
		System.out.println("학점: "+grade);
		
	}
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run) {
		sample1_3 s13 = new sample1_3();
		
		s13.input();
		s13.process();
		s13.output();
				
		System.out.println("계속하시겠습니까? y/n");
		String contious = sc.next();
	  if (contious.equals("y")) {
		  continue;
	  } else {
		  System.out.println("프로그램을 종료합니다.");
		  run = false;
		  break;
	  }
		}
		
		
		}

	
}

/* 폴리머피즘 = 다형성 
 * 폴리머피즘은 기본적으로 의미는 하나지만 여러가지 형태로 나타낼 수 있다는 걸 의미
 * java에서 그 대표적인 예가 바로 오버로딩과 오버라이딩이다.
 */

	


