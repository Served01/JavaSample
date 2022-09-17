package chapter4;

import java.util.Scanner;

public class dowhileSample4 {
    static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		// if (만일~라면, 조건식, 수식, 값)
		/* 1. 단순 if
		 * 2. if ~ else
		 * 3. if ~ else if ~ (이게 주로 쓰인다.)
		 * 4. if if if ~ else else else... (이건 거의 쓸 일이 없음.)
		 */
		
		
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
}