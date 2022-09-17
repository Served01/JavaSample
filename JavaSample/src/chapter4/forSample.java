package chapter4;

public class forSample {

	public static void main(String[] args) {
		
		//for: 가장 많이 사용된다.
		//초기값, 조건식, 증감식
		
		int sum = 0, sum2 = 0, sum3 = 0;
		
		for(int i = 0; i<=100; i++) {
			sum+=i;
		}
		System.out.println(sum);//5050
		
		for(int i=0; i<=99; i+=2) {
			sum2+=i;
		}
		System.out.println(sum2);//
		
		for(int i = 0; i<=100; i+=2) {
			sum3+=i;
		}
		System.out.println(sum3);
	}

}
