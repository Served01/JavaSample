package oop_method;

import java.util.Scanner;

/* 문제> 번호, 이름, Java, JSP, Spring 점수를 입력 받아서 총점, 평균, 학점을 구하여 출력하시오.
 * 단, method()를 반드시 사용하시오.
 * 입력은 위에 기술한 대로 하시고, 출력형태는 마음대로
 * 전달 인자값과 반환값은 저번에 배운 4가지 중에 고르시오.
 */
public class method_sungjukSample {
	
	int number;
	String name;
	int java;
	int jsp;
	int spring;
	int total;
	double average;
	String grade;
	
	static Scanner sc = new Scanner(System.in);
	
	private void sungjukInput() {
		
		System.out.println("번호를 입력하시오.");
		number = sc.nextInt();
		System.out.println("이름을 입력하시오.");
	    name = sc.next();
		System.out.println("Java점수를 입력하시오.");
		java = sc.nextInt();
		System.out.println("JSP점수를 입력하시오.");
		jsp = sc.nextInt();
		System.out.println("Spring점수를 입력하시오.");
		spring = sc.nextInt();
		
	}
	
	public void sungjukProcess() {
		
	   total = java+jsp+spring;
	   average = total / 3;
	   
	   
	}

	public void totalValue() {
		if(average>=90) {
		grade = "A";
		} else if (total>=80) {
			grade = "B"	;
		} else if (total>=70) {
			grade = "C";
		} else if (total>=60) {
			grade = "D";
		} else if (total<60) {
			grade = "F";
		} else {grade = "잘못된 값을 입력하였습니다.";
	    }
	}
	
	public void sungjukOutput() {
		System.out.println("----------------------------------------------------------------------");
		System.out.println("번호     이름    Java   JSP   Spring    총합    평균    학점");
		System.out.println("----------------------------------------------------------------------");
		System.out.println(number + "\t" + name + "\t"+ java + "\t" + jsp + "\t" + spring + "\t" + total + "\t" + average + "\t" + grade);
		System.out.println("----------------------------------------------------------------------");
		
	}
	
	
	public static void main(String[] args) {
		
		method_sungjukSample msj1 = new method_sungjukSample();
		msj1.sungjukInput();
	    msj1.sungjukProcess();
	    msj1.totalValue();
	    msj1.sungjukOutput();
	    
	}

}
