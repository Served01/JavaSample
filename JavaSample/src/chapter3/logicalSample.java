package chapter3;

public class logicalSample {

	public static void main(String[] args) {
		// 논리 연산자: and, or, not, exor, nor, nand
		// 이항연산자: a, b
		// 단항연산자: not(!), <<(*2), >>(/2), >>>, ~(부호변환)
		// exor(둘다 참이거나 둘다 거짓이면 거짓, 둘이 서로 다른 결과이면 참)
		/*  A  B and or not exor nor nand
		 * ---------------------------------
		 * 0  0 ㅣ 0  0 0=>1  0   1    1
		 * 0  1 ㅣ 0  1 1=>0  1   0    1
		 * 1  0 ㅣ 0  1       1   0    1
		 * 1  1 ㅣ 1  1       0   0    0
		 * 
		 * 위의 것들을 설계도에서는 논리기호로 표현한다.
		 */
		int x=20, y=30;
		int result=x&y;
		System.out.println(result);//
		//* bitwise 연산: and, or, not ...
        /* and
         * x=20: 00010100 (8bit라서 8개)
         * y=30: 00011110
         * --------------------------------
         *       00010100 => 20
         */
		int x2=20, y2=30;
		int result2=x2|y2;
		System.out.println(result2);//
		/* or
         * x=20: 00010100 (8bit라서 8개)
         * y=30: 00011110
         * --------------------------------
         *       00011110 => 30
         */
		//not의 예시
		int x3 = 100;
		System.out.println(~(x3)); //-101
		System.out.println(~(-101)); //100
		
		int x4 = x^y; //(^:exor)
		System.out.println(x4); 
		/* exor
         * x=20: 00010100 (8bit라서 8개)
         * y=30: 00011110
         * --------------------------------
         *       00001010 => 10
         */
		
		int x5 = y<<3; //3번 이동하면서 값을 증가시킵니다. *2형태로
		// 30*2=60, 60*2=120, 120*2=240
		System.out.println(x5); 
		
		int x6 = y>>3; //3번 이동하면서 값을 증가시킵니다. /2형태로
		// 30/2=15, 15/2=7, 7/2=3
		System.out.println(x6); 
		
		boolean b1 = true;
		boolean b2 = false;
		//boolean stop = true;
		boolean b3;
		
		//b3 = b1 + b2;//불가능한 연산, 산술 연산은 불가능
		b3 = 100 < 200;//관계연산은 가능
		System.out.println(b3);//
		
		boolean b4 = b1 && b2; //true && false => false
		boolean b5 = b3 && b4; //false
		System.out.println(b5);
		
		boolean stop = false;
		//if에 true값이 오면 실행된다.
		//boolean 안 쓸수가 없는 메소드다. 기억해두시오.
		if(stop) {
		   System.out.println("자동차를 정지합니다.");
		   
		} else {
			System.out.println("자동차를 출발시킵니다.");
		}
		
		// !(부정 연산자)
		boolean result3 = !(x>y); //false=>true
		System.out.println(result3);
		
		//문제> x값이 -1이하이거나 20이상이고, 3과 20 사이에 존재하는 값인데, 8이 아닌값은?
		//(x<=-1 || x>=20)&&(x>3 && x<20)&&(x!=8)
		//&와 &&의 차이점은 &은 두가지 조건을 그냥 무조건 검사하는 것이고, &&는 첫번째가 참이어야지 두번째것을 검사한다.
		//그러므로 성능상으로 생각한다면 &&가 더 좋을 것임
		x=18;
		boolean result4 = (x<=-1 || x>=18)&&(x>3 && x<20)&&(x!=8);
		System.out.println(result4);
		
		//문제1> 10과 20의 데이터를 가지고 논리 연산을 수행해 봅니다.
		System.out.println(10.0<20);//True
		System.out.println(10.0<=20L);//True
		System.out.println(10.0f==20L);//False
		System.out.println(10.0f!=20L);//True
		System.out.println(10L>=20.0);//False
				
	}
}
	

