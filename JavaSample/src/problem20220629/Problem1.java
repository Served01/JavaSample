package problem20220629;

import java.util.Scanner;

public class Problem1 {
	
	static Scanner sc = new Scanner(System.in);
	
    
    public void inputData2(String name,int age) {
    	
    	System.out.println("이름: "+name+" "+"나이: "+age);
    }
 public void inputData2(int age) {
    	
    	System.out.println("이름: 아무거나"+" "+"나이: "+age);
    }
    
    
	public static void main(String[] args) {
		
		String name = sc.next();
    	int age = sc.nextInt();
    	
		Problem1 p1 = new Problem1();
		p1.inputData2(name,age);
		p1.inputData2(age);
	}

}
