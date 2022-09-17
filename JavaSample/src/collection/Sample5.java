package collection;

import java.util.Scanner;
import java.util.Vector;

	
public class Sample5 {
	
    static Scanner sc = new Scanner(System.in);
   
	
	@SuppressWarnings({ "static-access", "rawtypes", "unchecked" })
	public static void main(String[] args) {
		//Vector 클래스, n개 증가, 기본이 10개
		Vector vec = new Vector(4,3); //4개하고 그 이상이되면 3개씩 증가
		
		for(int i = 0; i<5; i++) {
			
			vec.add(i*10);// 0*10 =[0], 1*10=[1], 2*10=[2], 3*10=[3], 4*10=[4]
			/* i를 사용하지 않고 나타내는 경우
			 * vec.add(0*10);
			 * vec.add(1*10);
			 * vec.add(2*10);
			 * 이런식으로 일일히 집어넣는 형식이 되어야함.
			 * 
			 */
			
		}
		for(int i = 0; i<vec.size(); i++) {
			System.out.println(" "+vec.get(i));
		}
		System.out.println("벡터의 크기는: "+vec.size()); //크기가 0이라는 것은 쓰이지 않았다는 의미이다.
		System.out.println("벡터의 용량은: "+vec.capacity());
		System.out.println("첫번째 구성요소는 "+vec.firstElement());//
		System.out.println("중간에 있는 구성요소는 "+vec.get(2));// 0이면 첫번째이다.
		System.out.println("마지막 구성요소는 "+vec.lastElement());
		
		//문제> 사과, 수박, 한라봉, 수박, 참외 등의 과일을 입력하고, 출력하세요
		
		Vector<String> vec2 = new Vector<String>();
		
		vec2.add("사과");
		vec2.add("수박");
		vec2.add("한라봉");
		vec2.add("수박");
		vec2.add("참외");
		for(int i = 0; i<vec2.size(); i++) { //수박을 보고 알 수 있는 거는 vector는 중복을 허용한다.
			System.out.println(" "+vec2.get(i));
		}
		System.out.println("벡터의 크기는: "+vec2.size()); //크기가 0이라는 것은 쓰이지 않았다는 의미이다.
		System.out.println("벡터의 용량은: "+vec2.capacity());
		System.out.println("첫번째 구성요소는 "+vec2.firstElement());//
		System.out.println("중간에 있는 구성요소는 "+vec2.get(2));// 0이면 첫번째이다.
		System.out.println("마지막 구성요소는 "+vec2.lastElement());
		
		//문제> n개의 정수형 데이터를 입력하고 출력하시오.
		Vector<Integer> vec3 = new Vector<Integer>();
		
		System.out.println("n값을 입력하시오.");
		int n = sc.nextInt();
        for(int i = 0; i<n; i++) {
        	
            System.out.println((i+1)+"번째 값을 입력하시오.");
			int aa = sc.nextInt();
			vec3.add(aa);
			
        }
        for(int i = 0; i<vec3.size(); i++) { //수박을 보고 알 수 있는 거는 vector는 중복을 허용한다.
		    System.out.println(" "+vec3.get(i));
		}
        System.out.println("벡터의 크기는: "+vec3.size()); //크기가 0이라는 것은 쓰이지 않았다는 의미이다.
		System.out.println("벡터의 용량은: "+vec3.capacity());
		System.out.println("첫번째 구성요소는 "+vec3.firstElement());//
		System.out.println("두번째 구성요소는 "+vec3.get(2));// 0이면 첫번째이다.
		System.out.println("마지막 구성요소는 "+vec3.lastElement());
        
        Vector<Integer> vec4 = new Vector<Integer>();
		
		
        for(int i = 0; i<vec4.capacity(); i++) {
        	
            System.out.println((i+1)+"번째 값을 입력하시오.");
			int bb = sc.nextInt();
			vec4.add(bb);
			
        }
        for(int i = 0; i<vec4.capacity(); i++) { //수박을 보고 알 수 있는 거는 vector는 중복을 허용한다.
		    System.out.println(" "+vec4.get(i));
		}
        System.out.println("벡터의 크기는: "+vec4.size()); //크기가 0이라는 것은 쓰이지 않았다는 의미이다.
		System.out.println("벡터의 용량은: "+vec4.capacity());
		System.out.println("첫번째 구성요소는 "+vec4.firstElement());//
		System.out.println("두번째 구성요소는 "+vec4.get(2));// 0이면 첫번째이다.
		System.out.println("마지막 구성요소는 "+vec4.lastElement());
	
	}
	
}






	