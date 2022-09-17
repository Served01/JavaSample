package chapter4;

import java.util.Scanner;

 class printsungjuk3 {
	static Scanner sc = new Scanner(System.in);
	
	static int total, aver;
	
	@SuppressWarnings("unused")
	static void sungjukInput() { //클래스 메소드
		
		System.out.println("국어점수를 입력하시오.");
        @SuppressWarnings("unused")
		int kor = sc.nextInt();
        System.out.println("영어점수를 입력하시오.");
        int eng = sc.nextInt();
			
	}
	
	static void sungjukProcess(int kor, int eng) {
		total = kor + eng;
        aver= total / 2;
		
	}


	static void sungjukOutput() {
		
		System.out.println(total);
        System.out.println(aver);
		
	}
	
}

public class sungjukTotal {
	//클래스 변수: 자동 초기화...
		//(문자라면 null로 초기화됨)
		//밑의 클래스변수를 프로젝트 하면서 쓰지 않을 수가 없다. 즉, 이것을 안 쓰는 코딩은 프로젝트가 아니다.
		
		static Scanner sc = new Scanner(System.in);
		static int kor; //0 => 100 //private가 앞에 있을 경우 다른 class에서 접근이 불가능하다. 그래서 위에서 쓸수 있는 것이다.
		static int eng; //0 => 78
		static int total; //0 => 178
		static int aver; //0 => 89
		
		static void sungjukInput() { //클래스 메소드
			
			System.out.println("국어점수를 입력하시오.");
	        kor = sc.nextInt();
	        System.out.println("영어점수를 입력하시오.");
	        eng = sc.nextInt();
				
		}
		
		
		
		@SuppressWarnings("static-access")
		public static void main(String[] args) {
		//지역 변수      new: 메모리 할당 연산자	
			/*
			 * 입력: kor, eng, sungjukInput()
			 * 처리: total, aver, sungjukProcess()=>SungjukTotal() class
			 * 출력: sungjukOutput();
			 * 
			 */
			
			sungjukTotal st = new sungjukTotal();
			
	        //gs.sungjukProcess(); //데이터 처리 메소드 호출
	        st.sungjukInput();
	        
			printsungjuk3 ps3 = new printsungjuk3();
	        
	        ps3.sungjukProcess(kor, eng);
	        
	        ps3.sungjukOutput(); //데이터 출력 메소드 호출
	          
		}


}
