package oop_method;
/*
 * 문제> 난수를 발생하여 사용자 입력한 숫자와 비교하는
 * 가위, 바위, 보 게임을 합니다.
 * 단> method 이용
 * 랜덤 클래스: Random ra = new Random()
 */

import java.util.Random;
import java.util.Scanner;

public class method_Randomsuu {
	
	static Scanner sc = new Scanner(System.in);
	static Random ra = new Random();
	
	public static void main(String[] args) {
		
		int cpu = ra.nextInt(3);// 0: 가위, 1: 바위, 2:보, 정수형 난수 발생
		int user = sc.nextInt();// 
		
		if(user ==0 ) {
			switch(cpu) {
			case 0: System.out.println("비김"); break;
			case 1: System.out.println("졌음"); break;
			case 2: System.out.println("이김"); break;
			}
		}
		
		if(user ==1 ) {
			switch(cpu) {
			case 0: System.out.println("이김"); break;
			case 1: System.out.println("비김"); break;
			case 2: System.out.println("졌음"); break;
			}
		}
		
		if(user ==2 ) {
			switch(cpu) {
			case 0: System.out.println("졌음"); break;
			case 1: System.out.println("이김"); break;
			case 2: System.out.println("비김"); break;
			}
		}
		System.out.println("컴퓨터가 발생시킨 난수: "+cpu);
		
	}

}
