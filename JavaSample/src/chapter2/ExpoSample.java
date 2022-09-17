package chapter2;
// package 이름을 설정하자 나타남

public class ExpoSample {
    //field area
	//필드영역에서는  system.out. ...을 못 쓴다.
	//int x = 100;
	
	public static void main(String[] args) {
		//main area
		/*
		 * 지수승: 실수형, 가장 큰 값(+)이나 가장 작은 값(-)을 표현 (되게 자세하게 표현하다 보니 이상한 오차가 발생하기도 함)
		 * 오차발생: 보완해서 사용
		 * 정밀도가 아주 높음
		 * 과학기술계산용
		 */
		 
		int x = 100;
		System.out.println(x);
		
	    //나중에 시간나면 A4용지에다가 코딩을 해본다. 좋은 연습이 됨.
		
		double y = 100.123e-3;
		double y2 = 100.123e+3;
		System.out.println(y);
		System.out.println(y2);
		
		
	}
	
	
}
