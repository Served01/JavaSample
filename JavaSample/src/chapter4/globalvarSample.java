package chapter4;

import java.util.Scanner;

public class globalvarSample {
	/*
	  - 밑의 클래스변수를 프로젝트 하면서 쓰지 않을 수가 없다. 즉, 이것을 안 쓰는 코딩은 프로젝트가 아니다.
	  - * 자바에서의 초기화란 객체를 선언하고 값을 최초로 할당하는 것을 말하는 것이다.
	  - * 클래스 영역에서는 변수가 숫자는 0, 문자는 null로 초기화값을 자동으로 잡아주는데 메소드 내부에서는 
	      초기화값을 잡아주지 않기 때문에 메소드 내부에 따로 초기화를 시키거나 아니면 클래스에 미리 시켜놓아야 한다.
	      그래서 개인적으로 초기화 과정을 변수값의 방을 잡는 행위라고 정의하고 있다.
	      어떠한 값이 오기 위해서는 들어갈 수 있는 공간이 필요한데 초기화를 통해서 그 공간을 확보해 놓는 것이다.
	*/
	static Scanner sc = new Scanner(System.in);
	
	static int kor; //0 => 100 //private가 앞에 있을 경우 다른 class에서 접근이 불가능하다. 그래서 위에서 쓸수 있는 것이다.
	private static int eng; //0 => 78
	private static int total; //0 => 178
	static int aver; //0 => 89
	
	static void sungjukInput() { //클래스 메소드
		
		
		System.out.println("국어점수를 입력하시오.");
        kor = sc.nextInt();
        System.out.println("영어점수를 입력하시오.");
        eng = sc.nextInt();
			
	}
	
	static void sungjukProcess() {
		
		total = kor + eng;
        aver= total / 2;
		
	}
	
	static void sungjukOutput() {
		
		System.out.println(total);
        System.out.println(aver);
		
	}
	
	@SuppressWarnings("static-access")
	public static void main(String[] args) {
	//지역 변수      new: 메모리 할당 연산자	
		/*
		 * 입력: kor, eng, sungjukInput()
		 * 처리: total, aver, sungjukProcess()
		 * 출력: sungjukOutput();
		 * 
		 */
		
        globalvarSample gs = new globalvarSample();
        
        gs.sungjukInput(); //데이터 입력 메소드 호출
        
        gs.sungjukProcess(); //데이터 처리 메소드 호출
        
        gs.sungjukOutput(); //데이터 출력 메소드 호출
          
	}

}
