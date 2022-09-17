package oop_method;

import java.util.Scanner;

// filename = className
public class method_dowhileSample2 {
	
	static Scanner sc = new Scanner(System.in);
	
	public void gradeprocess() {
	 int i=0;
     do{ int value = sc.nextInt();
	    String grade = (value >= 90)? "A": (value >= 80)? "B": 
			(value >= 70)? "C": (value >= 60)? "D": "F"; 
		System.out.println(grade);
		i++;//증감식
     }while(i<5);
	}
     
	public static void main(String[] args) {
		
		method_dowhileSample2 mds2 = new method_dowhileSample2();	
		
		//전달인자값 X, 반환값 X
		mds2.gradeprocess();
		        
	}
}
