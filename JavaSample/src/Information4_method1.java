import java.util.Scanner;
// 이번 페이지는 전의 것을 업그레이드 하는 페이지이다.

public class Information4_method1 {
	static Scanner sc = new Scanner(System.in);
                           //   100      100
	private void infoPrint1(int kor, int mat) {
		// 문제1> 국어점수 98점이고, 수학점수 100점인 경우의 합계를 구하세요.
		
		int sum = kor + mat;
		System.out.println("정수형 합계: " + sum);
				
	}
	                      // parameter variable (매개변수)
	private void infoPrint2(double eng, double mat2) {
		// 문제2> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계를 구하세요.
		
		double sum = eng + mat2;
		System.out.println("실수형 합계: " + sum);
				
	}
	
	private void infoPrint3(double eng2, double mat3) {
		// 문제3> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계는 정수형으로 구하시오.
		
		int sum = (int)(eng2 + mat3);
		System.out.println("정수형 합계: " + sum);
	
	}
	
	private void infoPrint4(double eng3, int mat4) {
		// 문제 4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하시오.
		
		double sum = eng3 + mat4;
		System.out.println("실수형 합계: " + sum);
		
			
	}
	
	
	public static void main(String[] args) {
		
		System.out.println("국어점수를 입력하시오.");		
		int kor= sc.nextInt(); //100
		System.out.println("수학점수를 입력하시오.");
		int mat= sc.nextInt(); //100
		
		Information4_method1 im1 = new Information4_method1();
		im1.infoPrint1(kor, mat); // kor, mat라는 변수를 이용하여 전달인자값을 전송합니다.
		       // 전달인자값 2개가 있다.
		
		
		System.out.println("영어점수를 입력하시오.");		
		double eng= sc.nextDouble();
		System.out.println("수학점수를 입력하시오.");
		double mat2= sc.nextDouble();
		
		Information4_method1 im2 = new Information4_method1();
		im2.infoPrint2(eng, mat2);
	       // 전달인자값 2개가 있다.		             
		
		
		System.out.println("영어점수를 입력하시오.");		
		double eng2= sc.nextDouble();
		System.out.println("수학점수를 입력하시오.");
		double mat3= sc.nextDouble();

		Information4_method1 im3 = new Information4_method1();
		im3.infoPrint3(eng2, mat3);

		
		System.out.println("영어점수를 입력하시오.");		
		double eng3= sc.nextDouble();
		System.out.println("수학점수를 입력하시오.");
		int mat4= sc.nextInt();
		
		Information4_method1 im4 = new Information4_method1();
		im4.infoPrint4(eng3, mat4);
		
}
}

/* method의 역할 (개념, 정의): 동양 사회 (형용사의 발달)
 * 주어진 문제를 해결하는 방법을 제시합니다. => algorithm
 * 
 * Object (객체): 속성과 기능으로 구분합니다.
 *  - 속성: 클래스(전역)변수, 지역변수
 *  - 기능: 클래스(전역)메소드, 생성자 메소드(변수를 초기화 시켜주는 메소드), 일반 메소드
 * 
 * method의 4가지 종류
 * --------------------------
 *      반환값       전달인자값
 * --------------------------
 * 1)    X            X
 * 2)    X            O      => Information4
 * 3)    O            X
 * 4)    O            O
 * --------------------------
 * 여기 중에서 가장 적절한 것을 판단하여 코딩을 해야한다.
 * 
 */
