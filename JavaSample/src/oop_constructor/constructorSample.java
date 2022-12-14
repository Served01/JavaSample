package oop_constructor;

import java.util.Scanner;

/* constructor?
 * 1. 생성자 메소드라고 부릅니다.
 * 2. 클래스 변수의 초기화에 이용
 * 3. 클래스의 전달인자 값으로 생성자 메소드에 매개변수에 전달하여 클래스 변수에 초기화를 합니다.
 * 4. default 생성자: 클래스명과 동일한 이름을 사용합니다. (내가 아니라 컴퓨터가 사용한다는 의미)
 * 5. 생성자는 절대로 상속이 안됩니다.
 * 6. 반환 타입이 존재하지 않습니다. return문이 필요 없습니다.
 * 7. 생성자는 오버로딩이 가능합니다.
 * 8. default 생성자는 JVM이 알아서 자동으로 삽입하여 줍니다.
 */

public class constructorSample {

static Scanner sc = new Scanner(System.in);
private int value; // 0=>100=>90=>80=>70=>60
public constructorSample(int value){
	
	this.value = value;	
	
}
	public void process() {
	
     
	    String grade = (value >= 90)? "A": (value >= 80)? "B": 
			(value >= 70)? "C": (value >= 60)? "D": "F"; 
		System.out.println(grade);}
		
    
	
	public static void main(String[] args) {
		
		int value = 0;
		value = sc.nextInt();
		constructorSample css = new constructorSample(value);
		css.process();
		value = sc.nextInt();
		constructorSample css2 = new constructorSample(value);
		css2.process();
		value = sc.nextInt();
		constructorSample css3 = new constructorSample(value);
		css3.process();
		value = sc.nextInt();
		constructorSample css4 = new constructorSample(value);
		css4.process();
		value = sc.nextInt();
		constructorSample css5 = new constructorSample(value);
		css5.process();

	}

}
