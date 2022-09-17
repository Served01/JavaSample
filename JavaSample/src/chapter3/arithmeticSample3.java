package chapter3;

import java.util.Scanner;

public class arithmeticSample3 {
/*문제> 국어, 영어 수학 점수를 입력하여 총점과 평균을 구하여 출력하세요.
  * 요구사항 처리조건
  1. 국어, 영어, 수학 점수를 입력 받는다.
  2. 총점 구하기
  3. 평균 구하기
  4. 결과 출력
  
  * 요구사항 분석> 생략
  * 요구사항 설계> 
  * - 입력 변수: 실수형 (float, double) => 회의를 거쳐 float으로 결정
  * 국어변수: korScore, 영어변수: engScore, 수학: matScore
  * - 총점: totalSum
  * - 평균: average
  * 프로젝트 할 때 위처럼 구체적으로 전부 설정을 해야함.
  * 
  * 애플리케이션 구현
  */
 static Scanner sc = new Scanner (System.in);
	
	public static void main(String[] args) {
		// 산술 연산자 (+, -, *, /, %)
		
		System.out.println("------성적처리------");
		
		System.out.println("국어 점수를 입력하시오.");
		float korScore = sc.nextFloat();
		System.out.println("영어 점수를 입력하시오.");
		float engScore = sc.nextFloat();
		System.out.println("수학 점수를 입력하시오.");
		float matScore = sc.nextFloat();
		
		
		float totalSum = korScore+engScore+matScore;
		float average = (float) (totalSum / 3.0);
		
		
		System.out.printf("총점: %6.3f \n",totalSum); //여기서 쓴 형식이 c언어에서 쓰는 형식
		System.out.println("총점: "+ totalSum);
		System.out.println("평균: %6.3f \n" + average);
		// Java에서 실수형은 오차가 발생하는 경우가 빈번하므로 그것을 조정하는게 또 필요함
		
	}

}
