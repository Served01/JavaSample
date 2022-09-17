package oop_inheritance;

import java.util.Scanner;

// 자식 클래스 역할
public class inheritanceSample5 extends addParentClass {
	
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

	/* 코딩에서 더티하다 라는건 높은 확률로 성능이 떨어진다는 얘기
	 *   
	 * 1) public class A extends B {.....}: 클래스들끼리의 상속
	 * 2) public class A extends B {.....}: 추상 클래스가 일반 클래스에게 상속
	 * 3) public class A implements B, (C, D, E...) {.....}: 인터페이스들끼리의 상속
	 * 4) public class A extends B implements C, D, E... {.....}: 다중 상속의 효과 (java는 기본적으로 단일 상속만 된다는게 기본 원칙 그래서 효과라고 말하는 듯)
	 *   
	 * 추상 클래스는 하나이상의 추상 메소드와 문자열 상수 값으로 구성이 됩니다.
	 * 추상 클래스는 객체를 생성하지 못한다.[단점]
	 * 
	 * 문제> 두 수를 입력받아서 상속을 이용하여 가감승제산을 하시오.
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
		
		inheritanceSample5 is5 = new inheritanceSample5();
		
		
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


