package chapter4;

import java.util.Scanner;

public class ifSample {
	
    static Scanner sc = new Scanner(System.in);
    
	public static void main(String[] args) {
		
		//1. 단순 if 테스트
		
		
        int number = sc.nextInt();
		
		if(number%2 == 0) {
			System.out.println("짝수");
		}
			
		if(!(number%2 == 0)) {
			System.out.println("홀수");
		}
		// if((number%2 != 0))
		
		
	}

}
