package chapter4;

import java.util.Scanner;

public class whileSample6 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		while(sc.hasNextInt()) { //hasNextInt는 정수형이 들어오면 계속해서 입력되는것, 정수형말고 다른것이 오면 끝 (바로 중단하려면 ctrl+z 해도됨)
		System.out.println("성적(학점)을 입력하시오.");
		
		int value = sc.nextInt();
		
		if(value>=90)
			{System.out.println("A학점");} 
		else if(value>=80)
			{System.out.println("B학점");}
		else if(value>=70)
			{System.out.println("C학점");}
		else if(value>=60)
			{System.out.println("D학점");}
		else if(value<60)
			{System.out.println("F학점");}

        }
    }
}