import java.util.Scanner;

public class Information3 {

	static Scanner sc = new Scanner(System.in);
	private void infoPrint1() {
		// 문제1> 국어점수 98점이고, 수학점수 100점인 경우의 합계를 구하세요.
				// 1. 정수형 데이터
				// 2. 합계를 구하라
		//Fix project setup은 java의 버전이 다르게 할 필요가 있을 때 사용함. 실질적으로 java는 거의 안 사용하고 스프링 같이 나중에 자주 씀.
		
		
		System.out.println("국어점수를 입력하시오.");		
		int kor= sc.nextInt();
		System.out.println("수학점수를 입력하시오.");
		int mat= sc.nextInt();
		int sum = kor + mat;
		System.out.println("정수형 합계: " + sum);
				
	}
	
	private void infoPrint2() {
		// 문제2> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계를 구하세요.
		// 1. 실수형 데이터
		// 2. 합계를 구하라
		System.out.println("영어점수를 입력하시오.");		
		double eng= sc.nextDouble();
		System.out.println("수학점수를 입력하시오.");
		double mat= sc.nextDouble();
		double sum = eng + mat;
		System.out.println("실수형 합계: " + sum);
				
	}
	
	private void infoPrint3() {
		// 문제3> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계는 정수형으로 구하시오.
		// 1. 실수형 데이터
		// 2. 합계를 구하라
		// 3. cast: 형 변환 (묵시적, 강제적 형변환)
		System.out.println("영어점수를 입력하시오.");		
		double eng= sc.nextDouble();
		System.out.println("수학점수를 입력하시오.");
		double mat= sc.nextDouble();
		int sum = (int)(eng + mat);
		System.out.println("정수형 합계: " + sum);
	
	}
	
	private void infoPrint4() {
		// 문제 4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하시오.
		// 1.실수형 데이터, 정수형 데이터
		// 2.합계 구하라
		// 3.묵시적 형변화
		System.out.println("영어점수를 입력하시오.");		
		double eng= sc.nextDouble();
		System.out.println("수학점수를 입력하시오.");
		int mat= sc.nextInt();
		double sum = eng + mat;
		System.out.println("실수형 합계: " + sum);
		
			
	}
	
	public static void main(String[] args) {
		Information3 im1 = new Information3();
		im1.infoPrint1();
		
		Information3 im2 = new Information3();
		im2.infoPrint2();

		Information3 im3 = new Information3();
		im3.infoPrint3();

		Information3 im4 = new Information3();
		im4.infoPrint4();
		
	}

}

/*
 * 이게 더 효율적임 그러나 상황에 따라서 이게 더 안 좋을수도 있음
 * public static void main(String[] args) {
		Information2 im1 = new Information2();
		im1.infoPrint1();
		im1.infoPrint2();
		im1.infoPrint3();
		im1.infoPrint4();
*/
