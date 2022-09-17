package oop_method;

import java.util.Scanner;

public class method_dowhileSample4 {
	
	static Scanner sc = new Scanner(System.in);
	
	public void ifgradeProcess() {
      
		int i = 0;
		do {
		
		int value = sc.nextInt();
		
		if(value>=90)
			{System.out.println("A학점");} //단문이라서 중괄호를 쓰지 않지만 print하는게 여러줄의 중/복문이면 중괄호를 써야한다. 근데 굳이 안써도 할수는 있긴함
		else if(value>=80)
			{System.out.println("B학점");}
		else if(value>=70)
			{System.out.println("C학점");}
		else if(value>=60)
			{System.out.println("D학점");}
		else if(value<60)
			{System.out.println("F학점");}
        i++;
    } while(i<5);
	}

	public static void main(String[] args) {
		
	
		method_dowhileSample4 mds4 = new method_dowhileSample4();
		mds4.ifgradeProcess();
		//소문자로 쓰다가 단어가 바뀌는 순간 대문자로 바꾸는게 method 네이밍 할때 관습이다. 왠만해서는 이렇게 하는게 좋음.
		//후에 스프링 같은걸 할때 변수를  method로 쓰는 경우도 있음 그래서 헷갈리지 않도록 일부러 이렇게 네이밍 하여 구분한다.
		
	}			
}
// do~while을 if, for 같은걸로 전부 변환시킬줄 알아야한다.