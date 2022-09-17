package oop_inheritance2;

import java.util.Scanner;

public class sample1 extends hakjum1 {
	
//상속을 이용한 학점 구하기
	static Scanner sc = new Scanner(System.in);
	
	@Override
	public void hakjum(int value) {
		
		
		
		String grade = (value >= 90)? "A": (value >= 80)? "B": 
			(value >= 70)? "C": (value >= 60)? "D": "F"; 
		System.out.println(grade);
	   
	}
	
	
	public static void main(String[] args) {
		
		/* 
		 * input: value, class A
		 * process: process(), class B
		 * output: grade, class C
		 * 
		 */
		int value;
	    sample1 sp1 = new sample1();
	    
	    System.out.println("점수를 입력하시오.");
	    value = sc.nextInt();
	    sp1.hakjum(value);
		
		}
		
	}

	


