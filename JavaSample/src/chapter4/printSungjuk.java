package chapter4;

public class printSungjuk {
	
	static int kor;
	static int aver;
	
	@SuppressWarnings("static-access")
	//@는 annotation이라는 건데 주로 spring에서 사용하게 되는 것이다.
	
	public static void main(String[] args) {
		
	globalvarSample gs2 = new globalvarSample();
	
	gs2.sungjukInput(); //데이터 입력 메소드 호출
    gs2.sungjukProcess(); //데이터 처리 메소드 호출
    
	System.out.println("국어점수: " + gs2.kor);
	System.out.println("평균점수: " + gs2.aver);
	
	
    }
	
}

// 가급적 project를 하는데 있어서 java파일을 나누어서 하는것이 좋다. 이게 수정 및 관리가 쉽다.
// 협업할 때는 왠만해서는 여러개로 나누어서 작업뒤에 합치는 형식으로 하는것이 좋다. 이유는 여러 사람이 쓰기 편한 형태로 되도록 하기 위해서이다.

/*
 * Static 이란? data share = 클래스 변수 공유, method 공유
 * 
 * 공유한다는 의미 
 * 1번 클래스의 내용을 접근하고자 할 때,
 * 2번 클래스에서 데이터 처리를 하는 부분에 대하여 공유합니다. (입력, 처리, 출력)
 * 
 * => 소프트웨어의 재사용성, 모듈의 재사용성, 코드의 재사용성과 일맥상통
 */