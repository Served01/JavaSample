package oop_interface;

import java.util.Scanner;

public class sample2 implements ininterface {
	
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

	public static void main(String[] args) {
		
		int x,y;
		
		sample2 s2 = new sample2();
		System.out.println("x를 입력하시오.");
		x= sc.nextInt();
		System.out.println("y를 입력하시오.");
		y= sc.nextInt();
		
		s2.add(x, y);
		s2.sub(x, y);
		s2.mul(x, y);
		s2.divi(x, y);
		s2.divi2(x, y);

	}

}
