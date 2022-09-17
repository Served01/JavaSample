package chapter3;

import java.util.Scanner;

public class arithmeticSample2 {

 static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {	
		
		System.out.println("a(숫자)를 입력하시오.");
		int a = sc.nextInt();
		System.out.println("b(숫자)를 입력하시오.");
		int b = sc.nextInt();
		
		int sum6 = a+b;
		int sum7 = a-b;
		int sum8 = a*b;
		int sum9 = a/b;
		int sum10 = a%b;
		
		System.out.println("덧셈: " + sum6); 
		System.out.println("뺄셈: " + sum7);
		System.out.println("곱셈: " + sum8);
		System.out.println("나눗셈(몫): " + sum9);
		System.out.println("나눗셈(나머지): " + sum10);
	}

}
