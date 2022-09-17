package oop_JDBC;

import java.util.Scanner;

public class totalStudent {

	static Scanner sc = new Scanner(System.in);
	
	static int input;
	static String input2;
	static int i;
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	boolean run = true;
	
    while(run) {
	    System.out.println("원하시는 작업의 번호를 입력해주세요.");
		System.out.println("1: 조회, 2: 입력, 3: 수정, 4: 삭제");
		input= sc.nextInt();
		
		if(input==1) {
		Select_student ss = new Select_student();
		ss.main(args);} else if(input==2) {
		
		Insert_student is = new Insert_student();
		is.main(args);} else if(input==3) {
		
		Update_student us = new Update_student();
		us.main(args);} else if(input==4) {
		
		Delete_student ds = new Delete_student();
		ds.main(args);} else {
			System.out.println("잘못된 입력값입니다.");
			System.out.println("다시 확인해주십시오.");}
			
			System.out.println("다른 작업을 진행하시겠습니까? yes/no");
			
	    if(run) {
	    	String sis = sc.next();
	    	if(sis.equals("yes")) {
	    		continue;
	    	} else if (sis.equals("no")) {
	    		System.out.println("프로그램을 종료합니다.");
	    		break;
	    	} else {
	    		System.out.println("잘못된 값을 입력하셨습니다. 프로그램을 종료합니다.");
	    		break;
	    	}
	    }
	}
		
} }


		
		
	
