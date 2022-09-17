import java.util.Scanner;
// 이번 페이지는 전의 것을 업그레이드 하는 페이지이다.

public class Information5_method3 {
	static Scanner sc = new Scanner(System.in); 
	// 왠만해서는 Scanner의 경우 최대한 공통 범위에다가 위치시켜서 중복을 피하도록 하자.
        // void는 반환이 없다는 뜻이다.
	private void infoPrint1() {
		// 문제1> 국어점수 98점이고, 수학점수 100점인 경우의 합계를 구하세요.
		
		System.out.println("국어점수를 입력하시오.");		
		int kor= sc.nextInt(); //100
		
		System.out.println("수학점수를 입력하시오.");
		int mat= sc.nextInt(); //100
		
		int sum = kor + mat;
		System.out.println("정수형 합계: " + sum);
				
	}
	   
	private void infoPrint2() {
		// 문제2> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계를 구하세요.
		
		System.out.println("영어점수를 입력하시오.");		
		double eng= sc.nextDouble();
		
		System.out.println("수학점수를 입력하시오.");
		double mat2= sc.nextDouble();
		
		double sum = eng + mat2;
		System.out.println("실수형 합계: " + sum);
				
	}
	
	private void infoPrint3() {
		// 문제3> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계는 정수형으로 구하시오.
		
		System.out.println("영어점수를 입력하시오.");		
		double eng2= sc.nextDouble();
		
		System.out.println("수학점수를 입력하시오.");
		double mat3= sc.nextDouble();
		
		int sum = (int)(eng2 + mat3);
		System.out.println("정수형 합계: " + sum);
	
	}
	
	private void infoPrint4() {
		// 문제 4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하시오.
		
		System.out.println("영어점수를 입력하시오.");		
		double eng3= sc.nextDouble();
		
		System.out.println("수학점수를 입력하시오.");
		int mat4= sc.nextInt();
		
		double sum = eng3 + mat4;
		System.out.println("실수형 합계: " + sum);
		
			
	}
	
	
	public static void main(String[] args) {
		
		
		Information5_method3 im1 = new Information5_method3();
		im1.infoPrint1();
		       // 전달인자값 0개가 있다.
		
		
		Information5_method3 im2 = new Information5_method3();
		im2.infoPrint2();
	           // 전달인자값 0개가 있다.		             
		

		Information5_method3 im3 = new Information5_method3();
		im3.infoPrint3();

		
		Information5_method3 im4 = new Information5_method3();
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
 * 1)    X            X      => Information5_method2
 * 2)    X            O      
 * 3)    O            X
 * 4)    O            O
 * --------------------------
 * 여기 중에서 가장 적절한 것을 판단하여 코딩을 해야한다.
 * 
 * 반환값 (Return value): String, int, double, float, <Student>, long ... (받는다)
 * 
 * 전달인자값 (argument): String, int, double, float, <Student>, long ... (준다)
 */
