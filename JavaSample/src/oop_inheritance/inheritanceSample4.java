package oop_inheritance;

abstract class C{ // 부모 클래스 역할
	
	
	public static String field2 = "이순신 장군" ;
	
	public static int number2 = 200;   //0 =>

	public static int number3= 300;

	public abstract void cal() ; //추상 메소드는 바디가 존재하지 않는것 (근데 왜 추상이라는 단어가 붙는가?)
		
	
	
}


// 자식 클래스 역할
public class inheritanceSample4 extends C {
	
	/* 
	 * 1) public class A extends B {.....}: 클래스들끼리의 상속
	 * 2) public abstract class A extends B {.....}: 추상 클래스가 일반 클래스에게 상속
	 * 3) public class A implements B {.....}: 인터페이스들끼리의 상속
	 * 4) public class A extends B implements c, d, e {.....}: 다중 상속의 효과 (java는 기본적으로 단일 상속만 된다는게 기본 원칙 그래서 효과라고 말하는 듯)
	 *   
	 * 추상 클래스는 하나이상의 추상 메소드와 문자열 상수 값으로 구성이 됩니다.
	 * 
	 * 문제> 두 수를 입력받아서 상속을 이용하여 가감승제산을 하시오.
	 * 
	 */
	

	   static String field1; //null => 홍길동 저장,
	   static int number1;   //0 => 100
	   static int sum;
	   
	   @Override // 추상 메소드 오버라이딩
		public void cal() {
		   
			sum = number2 + number3;
			
			System.out.println(sum);}
	   
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		inheritanceSample4 is = new inheritanceSample4();
		is.field1 = "홍길동";
	    is.number1 = 100;
		
	    System.out.println(is.field1);
	    System.out.println(is.number1);
	    
	    //객체를 이용하여 다른 클래스의 속성이나 기능을 가져올 수 있다.
	    
	    
	    is.cal(); //     클래스명.클래스변수
	    System.out.println(is.field2);
	    System.out.println(is.number2);
	    System.out.println(is.sum);
	    
	   
	}

	
		
	}


