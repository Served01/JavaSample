package chapter4;

public class dowhileSample {

	public static void main(String[] args) {
		
		//do ~ while: while은 조건이 맞아야지 실행하는데 do~while은 먼저 실행하고 조건식을 체크한다.
		//즉, while은 선결제, do~while은 후결제로 생각하면됨
		
		int i = 0, sum = 0;
		//1~100사이의 합을 구하시오.
	    do {
			sum+=i; //sum = sum + i
			i+=1;   //i = i + 1
			
		} while(i<=100);
	    
		System.out.println(sum);//5050
		
		int i2 = 1, sum2 = 0;
		
		do { //1<=99, 3<=99, 5<=99
			
			sum2+=i2; //0+1, 1+3, 4+5
			i2+=2;    //3, 5, 7
			
		} while(i2<=99);
			
		System.out.println(sum2);//2500, 홀수의 합
		
		int i3 = 0, sum3 = 0;
		
	   do { // 0<=100, 2<=100, 4<=100
			
			sum3+=i3; //sum3의 증가값은 i3이다. 0+0, 0+2, 2+4
			i3+=2;    //i3의 증가값은 2이다. 2, 4, 6 알고리즘의 결과물을 3~4번 정도 보고서는 예측대로 잘 나오면 정상적으로 굴러간다는 얘기
			// 3~4번까지 우연히 결과물이 나오는 알고리즘은 없음, 본인이 잘못 이해했을 가능성이 높음
			
		} while(i3<=100);
	
		System.out.println(sum3);//2550
	}

}
