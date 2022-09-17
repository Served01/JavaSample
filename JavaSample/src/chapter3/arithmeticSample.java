package chapter3;

import java.util.Scanner;// ctrl + shift + o: n개의 임포트 가능

public class arithmeticSample {
//field: global variable = class variable = static class variable (용도의 차이는 약간 있으나 개념적으로 같다.)
	static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		// 산술 연산자 (+, -, *, /, %)
		
		int x=20, y=30; //x,y는 지역변수다 (local variable)
		int sum = x + y; 
		int sum2 = x - y;
		int sum3 = x * y;
		int sum4 = x / y;
		int sum5 = x % y;
		
		System.out.println("덧셈: " + sum); //50
		System.out.println("뺄셈: " + sum2);//-10
		System.out.println("곱셈: " + sum3);//600
		System.out.println("나눗셈(몫): " + sum4);
		System.out.println("나눗셈(나머지): " + sum5);
		
	}

}
