package chapter4;

import java.util.Scanner;

// filename = className
public class whileSample2 {

	static Scanner sc = new Scanner(System.in);
	public static void main(String[] args) {
				
		        int i=0;
		        while(i<5) {
			    int value = sc.nextInt();
			    
			    String grade = (value >= 90)? "A": (value >= 80)? "B": 
					(value >= 70)? "C": (value >= 60)? "D": "F"; 
			    
				System.out.println(grade);
				i++;//증감식
	}
	}

}
