package oop_inheritance2;

import java.util.Scanner;

public class AA{
	
	static int value;

	public void input() {
		
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("점수를 입력하시오.");
	    value = sc.nextInt(); 
		
   }
}
