package oop_inheritance;

class A{
	
	
	String field2 = inheritanceSample2.field1;
	
	int number2 = inheritanceSample2.number1;   //0 =>
	
	
}

public class inheritanceSample2 {

	   static String field1; //null => 홍길동 저장,
	   static int number1;   //0 => 100
	   
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		inheritanceSample2 is = new inheritanceSample2();
		is.field1 = "홍길동";
	    is.number1 = 100;
		
	    System.out.println(is.field1);
	    System.out.println(is.number1);
	    
	    //객체를 이용하여 다른 클래스의 속성이나 기능을 가져올 수 있다.
	    A is2 = new A();
	    System.out.println(is2.field2);
	    System.out.println(is2.number2);
	   
	}

}
