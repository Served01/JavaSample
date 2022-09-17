import java.util.Scanner;
// 이번 페이지는 전의 것을 업그레이드 하는 페이지이다.


public class Information7 {
	static Scanner sc = new Scanner(System.in);
        // void는 반환이 없다는 뜻이다. 즉 반환값이 존재한다면 쓰면 안됨
	private int infoPrint1(int kor, int mat) {
		// 문제1> 국어점수 98점이고, 수학점수 100점인 경우의 합계를 구하세요.
		
		int intSum = kor + mat;
		
		return intSum; //return은 반환값으로 다시 돌릴때 씀. 여기서는 main메소드로 결과값을 다시 돌려보내기 위해서 씀.
					
	}
	                         //값을 주는 형식과 값을 받는 형식을 일치시켜주는 개념으로 아래와 같이 한 것이다.
	                         //왠만해서는 형식을 일치시켜주는 것이 좋지만 상황에 따라서는 일치하지 않는 경우도 있다. 근데 그러면 좀 많이 복잡해짐.
	private double infoPrint2(double eng, double mat2) {
		// 문제2> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계를 구하세요.
		
		double doubleSum = eng + mat2;
		
		return doubleSum;
		//순서를 왠만해서는 고려해가면서 코딩을 해야한다. 순서가 뒤바뀌면 아예 결과물 자체가 달라지기도 한다.
				
	}
	
	private int infoPrint3(double eng2, double mat3) {
		// 문제3> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계는 정수형으로 구하시오.
		
		int intSum2 = (int)(eng2 + mat3);

        return intSum2;
	
	}
	
	private double infoPrint4(double eng3, int mat4) {
		// 문제 4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하시오.
		
		double doubleSum2 = eng3 + mat4;
		
		return doubleSum2;
		
	}
	
	
	public static void main(String[] args) {
		
		Information7 im1 = new Information7();
		
		System.out.println("국어점수를 입력하시오.");		
		int kor= sc.nextInt(); //100
		
		System.out.println("수학점수를 입력하시오.");
		int mat= sc.nextInt(); //100
		
        int intSum = im1. infoPrint1(kor,mat);
		System.out.println("정수형 합계: " + intSum);
		       // 전달인자값 2개가 있다.
		
		
		Information7 im2 = new Information7();
		
		System.out.println("영어점수를 입력하시오.");		
		double eng= sc.nextDouble();
		
		System.out.println("수학점수를 입력하시오.");
		double mat2= sc.nextDouble();
		
		double doubleSum = im2.infoPrint2(eng, mat2);
		System.out.println("실수형 합계: " + doubleSum);
	           // 전달인자값 2개가 있다.	
		
		
		Information7 im3 = new Information7();
		
		System.out.println("영어점수를 입력하시오.");		
		double eng2= sc.nextDouble();
		
		System.out.println("수학점수를 입력하시오.");
		double mat3= sc.nextDouble();
		
		int intSum2 = im3.infoPrint3(eng2, mat3);
		System.out.println("정수형 합계: " + intSum2);
               // 전달인자값 2개가 있다.
		
		
		Information7 im4 = new Information7();
		
		System.out.println("영어점수를 입력하시오.");		
		double eng3= sc.nextDouble();
		
		System.out.println("수학점수를 입력하시오.");
		int mat4= sc.nextInt();
		
		double doubleSum2 = im4.infoPrint4(eng3, mat4);
		System.out.println("실수형 합계: " + doubleSum2);
               // 전달인자값 2개가 있다.
        }
}

/*
 * 
 * method의 4가지 종류
 * --------------------------
 *      반환값       전달인자값
 * --------------------------
 * 1)    X            X      
 * 2)    X            O      
 * 3)    O            X      
 * 4)    O            O      => Information7_method4
 * --------------------------
 * 여기 중에서 가장 적절한 것을 판단하여 코딩을 해야한다.
 * 
 * 반환값 (Return value): String, int, double, float, <Student>, long ... (받는다)
 * 
 * 전달인자값 (argument): String, int, double, float, <Student>, long ... (준다)
 * 
 */
