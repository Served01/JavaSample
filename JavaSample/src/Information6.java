import java.util.Scanner;
// 이번 페이지는 전의 것을 업그레이드 하는 페이지이다.

public class Information6 {
        // void는 반환이 없다는 뜻이다.
	static Scanner sc = new Scanner(System.in); 
	private int infoPrint1() {
		// 문제1> 국어점수 98점이고, 수학점수 100점인 경우의 합계를 구하세요.
		
		//각각의 코딩마다 Scanner가 있으면 경고문구가 뜸 그러나 동작에는 이상이 없음, 좀더 깨끗하게 코딩을 만들꺼면 static을 이용한다.
		
		System.out.println("국어점수를 입력하시오.");		
		int kor= sc.nextInt(); //100
		
		System.out.println("수학점수를 입력하시오.");
		int mat= sc.nextInt(); //100
		
		int intSum = kor + mat;
		
		return intSum;
						
	}
	   
	private double infoPrint2() {
		// 문제2> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계를 구하세요.
		
		System.out.println("영어점수를 입력하시오.");		
		double eng= sc.nextDouble();
		
		System.out.println("수학점수를 입력하시오.");
		double mat2= sc.nextDouble();
		
		double doubleSum = eng + mat2;
		
		return doubleSum;
				
	}
	
	private int infoPrint3() {
		// 문제3> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계는 정수형으로 구하시오.
		
		System.out.println("영어점수를 입력하시오.");		
		double eng2= sc.nextDouble();
		
		System.out.println("수학점수를 입력하시오.");
		double mat3= sc.nextDouble();
		
		int intSum2 = (int)(eng2 + mat3);
		
		return intSum2;
		
	}
	
	private double infoPrint4() {
		// 문제 4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하시오.
		
		System.out.println("영어점수를 입력하시오.");		
		double eng3= sc.nextDouble();
		
		System.out.println("수학점수를 입력하시오.");
		int mat4= sc.nextInt();
		
		double doubleSum2 = eng3 + mat4;
		
		return doubleSum2;
		
			
	}
	
	
	public static void main(String[] args) {
		
		//double eng, mat2
		Information6 im1 = new Information6();
		int intSum = im1.infoPrint1();
		System.out.println("정수형 합계: " + intSum);
		       // 전달인자값 0개가 있다.
		
		
		Information6 im2 = new Information6();
		double doubleSum = im2.infoPrint2();
		System.out.println("실수형 합계: " + doubleSum);
	           // 전달인자값 0개가 있다.	
		
		
        Information6 im3 = new Information6();
        int intSum2 = im3.infoPrint3();
        System.out.println("정수형 합계: " + intSum2);

		
		Information6 im4 = new Information6();
		double doubleSum2 = im4.infoPrint4();
		System.out.println("실수형 합계: " + doubleSum2);
		
    }
}

/*
 * method의 4가지 종류
 * --------------------------
 *      반환값       전달인자값
 * --------------------------
 * 1)    X            X      
 * 2)    X            O      
 * 3)    O            X      => Information6_method3
 * 4)    O            O
 * --------------------------
 * 여기 중에서 가장 적절한 것을 판단하여 코딩을 해야한다.
 * 
 * 반환값 (Return value): String, int, double, float, <Student>, long ... 
 * 
 * 전달인자값 (argument): String, int, double, float, <Student>, long ... 
 */
