package oop_inheritance;

public class inheritanceSample {
	/* Inheritance란? 상속
	 * - 기존에 존재하는 클래스로부터 속성과 기능을 물려 받아 새로운 기능을 구현하거나, 추가하는 것을 말한다.
	 * - 부모 클래스 / 자식 클래스
	 * - 생성자는 상속이 안됩니다.
	 * - 기능적으로 볼 때, @Overriding: 추상 클래스 오버라이딩 => 추상 클래스, 인터페이스
	 *   부모의 A기능을 자식의 B라고 구현 가능
	 */

	   String field1; //null => 홍길동 저장,
	   int number1;   //0 => 100
	   
	public static void main(String[] args) {
		
		inheritanceSample is = new inheritanceSample();
		is.field1 = "홍길동";
	    is.number1 = 100;
		
	    System.out.println(is.field1);
	    System.out.println(is.number1);
	    
	   
	}

}
