package chapter3;

import java.util.Scanner;// ctrl + shift + o: n개의 임포트 가능

public class relationSample {

 static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		// 관계 연산자 (<, <=, >, >=, ==(같냐),!=(다르냐)): 이건 true, false 형식으로 결과값이 나온다.
		
		
		System.out.println("두 수를 입력해 주세요");
		float firstScore = sc.nextFloat();
		float secondScore = sc.nextFloat();
		
		
		System.out.println("less then: "+(firstScore<secondScore)); 
		System.out.println("less then equal: "+(firstScore<=secondScore)); 
		System.out.println("great then: "+(firstScore>secondScore)); 
		System.out.println("great then equal: "+(firstScore>=secondScore)); 
		System.out.println("equal: "+(firstScore==secondScore)); 
		System.out.println("not equal: "+(firstScore!=secondScore)); 
	}

}
