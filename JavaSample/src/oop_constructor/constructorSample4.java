package oop_constructor;

import java.util.Scanner;

/* 문제> 국어, 영어, 수학 점수를 입력받아서
 * 총점과 평균을 구하고 출력합니다.
 * 단, 생성자 메소드를 이용 (main 메소드와 동급의 메소드를 만들어 하라는 것)
 * 
 */
public class constructorSample4 {

static Scanner sc = new Scanner(System.in);

private int kor; 
private int eng;
private int mat;

public constructorSample4(int kor, int eng, int mat){
	
	this.kor = kor;	
	this.eng = eng;
	this.mat = mat;
	
}
	public void process() {
	
		int sum = kor + eng + mat;
		int aver = sum/3;
		System.out.println("합계: "+sum);
		System.out.println("평균: "+aver);
		
	}
    
	
	public static void main(String[] args) {
		
		boolean run = true;
		
		while(run){
			
			int kor = 0;
			int eng = 0;
			int mat = 0;
		
		System.out.println("국어점수를 입력하시오.");
		kor = sc.nextInt();
		System.out.println("영어점수를 입력하시오.");
		eng = sc.nextInt();
		System.out.println("수학점수를 입력하시오.");
		mat = sc.nextInt();
		
		constructorSample4 css = new constructorSample4(kor,eng,mat);
		css.process();	
		
		System.out.println("데이터를 계속 찾으시겠습니까?(y/n)");
    	String contious = sc.next();
		if(run) {
        	
        	if (contious.equals("y")) {
        		continue;
        	} else {
        		System.out.println("프로그램을 종료합니다.");
        		run=false;
        		break;
        
        	}
		}

	}

	}
}