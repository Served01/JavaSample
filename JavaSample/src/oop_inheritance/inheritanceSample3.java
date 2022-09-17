package oop_inheritance;

class B{
	
	
	public String field2 ;
	
	public int number2;   //0 =>

	public int number3;

	public void cal() {
		int sum = number2 + number3;
		System.out.println("200 + 300 = "+sum);
		
	}
	
	
}

public class inheritanceSample3 {
	/*
	 *  Inheritance란? 상속
	 * public class A extends B {.....}: 클래스들끼리의 상속
	 * public class A extends B {.....}: 추상 클래스가 일반 클래스에게 상속
	 * public class A implements B {.....}: 인터페이스들끼리의 상속
	 * public class A extends B implements c, d, e {.....}: 다중 상속의 효과 (java는 기본적으로 단일 상속만 된다는게 기본 원칙 그래서 효과라고 말하는 듯)
	 *   
	 */
	

	   static String field1; //null => 홍길동 저장,
	   static int number1;   //0 => 100
	   
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		inheritanceSample3 is = new inheritanceSample3();
		is.field1 = "홍길동";
	    is.number1 = 100;
		
	    System.out.println(is.field1);
	    System.out.println(is.number1);
	    
	    //객체를 이용하여 다른 클래스의 속성이나 기능을 가져올 수 있다.
	    B is3 = new B();
	    is3.field2 = "홍길동2";
	    is3.number2 = 200;
	    is3.number3 = 300;
	    is3.cal();
	    
	    
	    System.out.println(is3.field2);
	    System.out.println(is3.number2);
	   
	}

}
