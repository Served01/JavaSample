package oop_constructor;

import java.util.Scanner;

public class constructorSample3 {

static Scanner sc = new Scanner(System.in);

private int number; 
public constructorSample3(int number){
	
	this.number = number;	
	
}
	public void process() {
	
		
		if(number == 1) {
			System.out.println("남자");
		} else if(number == 3) {
			System.out.println("남자");
		} else if(number == 2) {
			System.out.println("여자");
		} else if(number == 4) {
			System.out.println("여자");
		} else {
			System.out.println("잘못된 데이터입니다.");
		}
		System.out.println();
	}
    
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run){
			
		int number = 0;
		System.out.println("숫자(성별구분)를 입력하시오.");
		number = sc.nextInt();
		
		constructorSample3 css = new constructorSample3(number);
		css.process();	
		
		System.out.println("데이터를 계속 찾으시겠습니까?(y/n)");
    	String contious = sc.next();
		if(run) {
        	
        	if (contious.equals("y")) {
        		continue;
        	} else {
        		System.out.println("프로그램을 종료합니다.");
        		break;
        
        	}
		}

	}

	}
}