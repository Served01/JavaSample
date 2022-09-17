import java.util.Scanner;

public class Information4_method2 {
	static Scanner sc = new Scanner(System.in);
	
	private void infoPrint3(double eng2, double mat3) {
		// 문제3> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계는 정수형으로 구하시오.

		int intSum = (int)(eng2 + mat3);
		System.out.println("정수형 합계: " + intSum);
	}
	
	private void infoPrint4(double eng3, int mat4) {
		// 문제 4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하시오.
		
		double doublesum = eng3 + mat4;
		System.out.println("실수형 합계: " + doublesum);
		
			
	}
	
	
	public static void main(String[] args) {
		
		
		Information4_method2 im1 = new Information4_method2();
		
		double eng, mat3;
		//double eng2, mat3, eng3; //eng 하나로 해도 가능함
		int mat4;
		
		
		System.out.println("영어점수(실수)를 입력하시오.");		
		eng= sc.nextDouble();
		
		System.out.println("수학점수(실수)를 입력하시오.");
		mat3= sc.nextDouble();

		im1.infoPrint3(eng, mat3);
		
		
		System.out.println("영어점수(실수)를 입력하시오.");		
		eng= sc.nextDouble();
		
		System.out.println("수학점수(정수)를 입력하시오.");
		mat4= sc.nextInt();
		
		im1.infoPrint4(eng, mat4);
		
		System.out.println(eng);
		
     }
}