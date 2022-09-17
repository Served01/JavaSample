package oop_method;

import java.util.Scanner;

/* 문제> 번호, 이름, Java, JSP, Spring 점수를 입력 받아서 총점, 평균, 학점을 구하여 출력하시오.
 * 단, method() 반드시 사용하세요.
 * 입력은 위에 기술한 대로 하시고,
 * 출력은 마음대로
 * 전달인자값과 반환값은 4가지중에서 고르세요.
 * hint> OO, OX, XO, XX
 * ------------------------------------------------------------------
 *  number   name  Java   JSP   Spring   total   average    grade
 * ------------------------------------------------------------------
 *   1      홍길동   100   100    100      300      100.0        A
 *   2      임걱정    99   100    100      299       99.9        A 
 *   3      이순신   100    50     50      200       66.6        D
 * -------------------------------------------------------------------
 * - input : sungjukInput()
 * - process : sungjukProcess() => total, average, grade
 * - output : sungjukOutput()
 * 
 */
public class method_sungjukSample33 {
   //class variable: auto initial
	int bunho;// 0 => 001
	String name;// null => 홍길동
	int Java;// 0 => 100
	int JSP;// 0 => 100
	int Spring;// 0 => 100
	int total;// 0 => 300
	double aver;// 0.0 => 100.0
	char grade;// null => A
	static Scanner sc = new Scanner(System.in);
	
	private void sungjukInput() {	
		
		bunho = sc.nextInt();//001
		name = sc.next();//홍길동
		 Java = sc.nextInt();//100
		 JSP = sc.nextInt();//100
		 Spring = sc.nextInt();//1000
	}

	private void sungjukProcess() {
		//  300    100    100   100
	 total = Java + JSP + Spring;
	 aver = total / 3.0; // 100.0
		
	 switch((int)(aver / 10)) {
	 case 10:
	 case 9:
		 grade = 'A';
		 break; 
	 case 8:
		 grade = 'B';
		 break; 
	 case 7:
		 grade = 'C';
		 break; 
	 case 6:
		 grade = 'D';
		 break; 
	 default:
		 grade = 'F';
		 break;
	 }	 
	}
	
	private void sungjukOutput() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println(" number   name  Java   JSP   Spring   total   average  grade");
		System.out.println("--------------------------------------------------------------");
		System.out.println(bunho + "\t" + name + "\t"+ Java + "\t" + JSP + "\t" + Spring + "\t" + total + "\t" + aver + "\t" + grade);
		System.out.println("----------------------------------------------------------------------");
		
	}
	
	public static void main(String[] args) {
		method_sungjukSample33 mss = new method_sungjukSample33();
		
		for(int i=0; i<5; i++) {
			mss.sungjukInput();
			mss.sungjukProcess();
			mss.sungjukOutput();
		}
		 
	}

}
