package chapter4;

import java.util.Scanner;

public class ifSample4 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//문제> 임의의 숫자를 입력 받아서 그 숫자가 0 인지, 홀수인지 짝수인지를 판별하여 출력합니다.
		
		System.out.println("숫자를 입력하시오.");
		int number = sc.nextInt();
		
		if (number==0) {
		 System.out.println("0");
		} else if (number%2==0) {
			System.out.println("짝수");
		} else if (number%2==1) {
			System.out.println("홀수");
		} else {
			System.out.println("잘못된 입력값입니다.");
		}

    }
}