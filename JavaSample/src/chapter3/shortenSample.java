package chapter3;

public class shortenSample {

	public static void main(String[] args) {
		// 단축대입 연산: +, -, *, /, % 적용 가능
		// a=10, b=40; c=a+b
		// d=20, +25, d=d+25 => d+=25
		int x = 10;
		x+=5; //x=x+5;
		System.out.println(x);//15
		
		//증가(+1), 감소(-1) 연산자 
		/*
		 * 대입후 연산: A++, 변수가 먼저 등장
		 * 연산후 대입: ++A, 연산자가 먼저 등장하면 
		 */
		int y = 10, z = 20;
		
		//           11  + 20(19) 기억
		int result = ++y + z--;
		System.out.println(result);//  31
		System.out.println(z);
		// 11 => 12
		//y++;
		System.out.println(y);// ?,  11
		int c = y++;//11, 12 기억
		System.out.println(c);// ?,  11
		
		System.out.println(z);// 19
		
		z--;
		System.out.println(z);// 18
		
	}

}
