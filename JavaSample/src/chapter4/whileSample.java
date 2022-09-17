package chapter4;

public class whileSample {

	public static void main(String[] args) {
		//while: 많이 사용된다.
		//조건식
		
		int i = 0, sum = 0, sum2 = 0, sum3 = 0;
		//1~100사이의 합을 구하시오.
		while(i<=100) { //0<=100, 1<=100, 2<=100
			
			sum+=i; //sum = sum + i
			i+=1;   //i = i + 1
			
		}
		System.out.println(sum);//5050
		
		int i2 = 1;
		
		while(i2<=99) { //1<=99, 3<=99, 5<=99
			
			sum2+=i2; //0+1, 1+3, 4+5
			i2+=2;    //3, 5, 7
			
		}
		System.out.println(sum2);//2500, 홀수의 합
		
		int i3 = 0;
		
		while(i3<=100) { // 0<=100, 2<=100, 4<=100
			
			sum3+=i3; //sum3의 증가값은 i3이다. 0+0, 0+2, 2+4
			i3+=2;    //i3의 증가값은 2이다. 2, 4, 6 알고리즘의 결과물을 3~4번 정도 보고서는 예측대로 잘 나오면 정상적으로 굴러간다는 얘기
			// 3~4번까지 우연히 결과물이 나오는 알고리즘은 없음, 본인이 잘못 이해했을 가능성이 높음
			
		}
		System.out.println(sum3);//
	}

}
