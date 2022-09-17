package oop_interface;

interface Ainter{ // 부모 클래스 역할
	
	public static String field2 = "이순신 장군" ;
	
	public static int number2 = 200;   

	public static int number3= 300;

	public abstract void cal() ; 
	//public abstract 생략 가능
		
	
}


// 자식 클래스 역할
public class sample1 implements Ainter {


	@Override
	public void cal() {
		
		int sum = number2 * number3;
		System.out.println(sum);
		System.out.println(field2);
	}
	   
	public static void main(String[] args) {
		
		sample1 is = new sample1();
		is.cal();
	   
	}

}

//interface나 abstract는 이미 존재하는 class를 사용하려고 할때 쓰이는 기능이다.
//interface랑 abstract는 둘다 object를 만들지 못한다.
//클래스의 인스턴스를 object라고 한다.`
	
