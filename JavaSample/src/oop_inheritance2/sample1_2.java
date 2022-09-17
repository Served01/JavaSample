package oop_inheritance2;

public class sample1_2 {
	
//상속을 이용한 학점 구하기
	
	public static void main(String[] args) {
		
		/* 
		 * input: value, class A
		 * process: process(), class B
		 * output: grade, class C
		 * 1. public class A extends B {...}: 일반 클래스 (지금 sample이 이것을 적용한 사례)
		 * 2. public class A extends B {...}: 추상 클래스 
		 * 
		 */
		
		// 상속에는 크게 두가지 방법 상속을 여러개 시켜놓은 것들을 가져다 쓸것이냐 아니면 상속을 한 페이지 안에 다 할 것이냐가 있고 흔히 전자가 많이 쓰임
		// 인터페이스도 이런식으로 씀 둘 다 전자를 많이 사용하므로 명심해 두기
		// 상속은 한줄로 상속하는 형식이고 인터페이스는 여러가지 방향으로 상속하는 방식이라 생각하면 편하다.
	  
		AA a = new AA();
		a.input();
	    
		BB b = new BB();
		b.process();
		
		CC c = new CC();
	    c.output();
		
		}
		
	}

	


