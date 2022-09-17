package Exception;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Sample2 {
		
	private String name;// null == "" == " " => hyun
	private int age;// 0 => 34
	
	//constructor method overloading
	public Sample2(String name) {
		this.name = name;
	}

	public Sample2(int age) {
		this.age = age;
	}

	private void namePrint() {
		System.out.println(name); 		
	}

	private void agePrint() {
		System.out.println(age); 
	}
	
	public static void main(String[] args) {
		/* 1.data input : Scannner sc(name, age)
		 * 2.data output : process(name, age)
		 * 3. object create : constructorSample5 css5 = new constructorSample5();
		 */
				
		try {
		
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		int age = sc.nextInt();
		sc.close();
		
		Sample2 css5 = new Sample2(name);		
			css5.namePrint();
		
		Sample2 css6 = new Sample2(age);
			css6.agePrint();	
		}catch(InputMismatchException e) {
			System.out.println("숫자가 아니거나 정수형이 아닙니다.");
		}
	}	
	
}
