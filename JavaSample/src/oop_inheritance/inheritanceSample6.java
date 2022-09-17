package oop_inheritance;

import java.util.Scanner;

// 자식 클래스 역할
public class inheritanceSample6 extends addParentClass2 {
	
	static Scanner sc = new Scanner(System.in);
	
	@Override
	public void add (int x, int y) {
		
		int addSum = x+y;
		System.out.println("덧셈: "+ addSum);
	}
	
	@Override
	public void sub(int x, int y) {
		int subSum = x-y;
		System.out.println("뺄셈: "+ subSum);
	}


	@Override
	public void mul(int x, int y) {
		int mulSum = x*y;
		System.out.println("곱셈: "+ mulSum);
	}


	@Override
	public void divi(int x, int y) {
		int diviSum = x/y;
		System.out.println("나눗셈: "+ diviSum);
	}
	
	@Override
	public void divi2(int x, int y) {
		int divi2Sum = x%y;
		System.out.println("나머지: "+divi2Sum);
		
	}
	

	/*
	 * 문제> 두 수를 입력받아서 상속을 이용하여 가감승제산을 하시오.
	 * 상속을 서로 연결하여 프로그램 작성 => 단 결과는 성능이 떨어진다.
	 * 덧셈: Add(), 뺄셈: Subtract(), 곱셈: Multiply(), 나눗셈: Divide()
	 * 기본 클래스: 자식 클래스, inheritanceSample5 = is5
	 * 상속 클래스: 부모 클래스, addParentClass, subParentClass, mulParentClass, diviParentClass
	 * 알고리즘을 구현할 때 크게 하나의 클래스에서 할거냐 
	 * 아니면 여러개의 클래스로 분할하여 코딩 할 것이냐? 여러개로
	 * input 변수: x, y 
	 * process: add(+), sub(-), mul(*), divi(/)
	 * output변수: addSum, subSum, mulSum, diviSum
	 */
	

	public static void main(String[] args)  {
		
		inheritanceSample6 is5 = new inheritanceSample6();
		
		int x,y;
		System.out.println("x값을 입력하시오.");
		x=sc.nextInt();
		System.out.println("y값을 입력하시오.");
		y=sc.nextInt();
		is5.add(x,y);
		is5.sub(x,y);
		is5.mul(x,y);
		is5.divi(x, y);
		is5.divi2(x, y);
		
		
	   
	   
	}

	

		
	}


