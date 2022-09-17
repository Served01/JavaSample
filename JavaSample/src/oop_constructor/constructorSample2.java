package oop_constructor;

import java.util.Scanner;

public class constructorSample2 {

static Scanner sc = new Scanner(System.in);
private int value; // 0=>100=>90=>80=>70=>60
public constructorSample2(int value){ // 이 class를 일부러 object를 만들기 위해 만들었음
	//만약 이런식으로 생성자를 만들지 않으면 main에서의 value값을 줄 수가 없게 된다.
	
	this.value = value;	
	
}
	public void process() {
	
     
	    String grade = (value >= 90)? "A": (value >= 80)? "B": 
			(value >= 70)? "C": (value >= 60)? "D": "F"; 
		System.out.println(grade);}
		
    
	
	public static void main(String[] args) {
		
		boolean run = true;
		while(run){
			
		int value = 0;
		System.out.println("성적을 입력해 주세요: ");
		value = sc.nextInt();
		
		constructorSample2 css = new constructorSample2(value);
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