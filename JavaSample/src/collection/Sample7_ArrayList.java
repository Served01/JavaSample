package collection;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;


	/* 이름, 국어, 영어, 수학 점수를 입력 받아서
	 * 총점, 평균, 등수를 구하고
	 * 출력하는 프로그램을 작성하라. 
	 * 
	 * List: 순서가 존재한다. 1,2,3,4,5 , 중복 데이터 허용
	 * Set: 순서가 없다. 1,3,5,2,4 , 
	 * Map: [key, value]의 쌍으로 구성, key는 중복을 허용하지 않으나 value는 중복을 허용한다.
	 * 위의 내용은 spring 할 때 중요한 요소로 작용한다.
	 * 
	 * 
	 * ArrayList
	 *  - 크기를 지정하지 않는다. 배열의 개선된 자료구조
	 *  - 여러가지 다른 데이터 타입도 저장 가능하다.
	 *  - 중복이 허용되고 순서가 있다.
	 *  
	 */

class MyStudent{ 
	
    static String str;
    static int value;
    static double d;
    
    @SuppressWarnings("static-access")
	public MyStudent(String str) {
		this.str=str;
	}
    @SuppressWarnings("static-access")
	public MyStudent(int value) {
		this.value=value;
	}
	@SuppressWarnings("static-access")
	public MyStudent(double d) {
		this.d=d;
	}



		
	
}

public class Sample7_ArrayList {
   
	
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
		
		List<MyStudent> list = new ArrayList<MyStudent>();
		
		list.add(new MyStudent("홍길동"));
		list.add(new MyStudent("차범근"));	
		list.add(new MyStudent("차두리"));
		list.add(new MyStudent("차범근"));
		list.add(new MyStudent(2500));
		list.add(new MyStudent(123.456));
	
		System.out.println(list);
        
		for(int i =0; i<list.size(); i++) {
			System.out.println(list.get(i));
		}
        
		Iterator<MyStudent> elements = list.iterator(); //Iterator가 훨씬 더 성능이 좋다.
		while(elements.hasNext()) {
			System.out.println(elements.next());
		}
		
		for(MyStudent st: list) {
			System.out.println(st.str);
		}
		
		
		System.out.println(MyStudent.value);
		System.out.println(MyStudent.d);
    }
	
}

