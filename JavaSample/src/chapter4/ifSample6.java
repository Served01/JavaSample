package chapter4;

import java.util.Scanner;

public class ifSample6 {
	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
		
		//switch ~ case: if문을 단순, 간결하게 유지하기 위하여 사용합니다.
		//유지보수가 더욱 용이하다.
		
		System.out.println("성적(학점)을 입력하시오.");
		
		int jumsu = sc.nextInt();
		
		switch(jumsu/10) {
		case 10:
		case 9:
			System.out.println("A");
			break;
		case 8:
			System.out.println("B");
		    break;
		case 7:
			System.out.println("C");
			break;
		case 6:
			System.out.println("D");
			break;
	    default:
	    	System.out.println("F");
	    	break;
		}
		
    }
}