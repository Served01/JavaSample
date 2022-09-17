package chapter4;

import java.util.Scanner;

public class ifSample2 {
    
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//2. if ~ else 테스트
		
        int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println("짝수");
			} else {
				System.out.println("홀수");
			}
		
		
	}

}
