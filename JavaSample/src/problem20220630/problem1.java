package problem20220630;

import java.util.Scanner;

interface radius{
	
	
    public abstract void input();
	

}

public class problem1 implements radius {
	
	static Scanner sc = new Scanner(System.in);
	
	@Override
	public void input() {
		
		try (Scanner sc = new Scanner(System.in)) {
			System.out.println("반지름 값을 입력하시오.");
			double re= sc.nextDouble();
			double large = (re*re)*(3.14);
			System.out.println(large);
		}

	}
	
	

	public static void main(String[] args) {
		
		
		
		problem1 p1 = new problem1();
	
		
		p1.input();
		
	}

	

	
	

	
}
