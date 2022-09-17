class AAA { //main 메소드가 있는 class만 public이 사용 가능

	//objectName.class variable
	static int kor;
	
	
	
}

// static 키워드는 전역적 개념으로 main 메소드 안에서 사용할 변수의 값을 초기화 하거나
// 외부의 다른 클래스에서 사용하도록 혀용할 때 쓰입니다.
public class HelloWorld4 extends AAA { // 번지: 1000 이라고 가정, 서울시 / extends는 상속 개념으로 지금은 몰라도 됨
//field area: 공용 영역, 클래스(전역)메소드, 클래스(전역)변수
	
	static int kor = 100 ; //class variable (전역 변수)
	//위의 static 덕분에 kor 값을 다른 곳에서도 공유 가능
	//int kor = 100;
	
	static void helloPrint() { // 번지: 2000 이라고 가정, 신림동
		System.out.println("안녕하세요?????");
		System.out.println("Helloworld~~~");
		
	}
		
	public static void main(String[] args) {  //번지: 3000 이라고 가정, 구로구

		int kor = 89; //위의 static 없어서 이 값이 결과값으로 나옴, local variable (지역 변수) (전역변수랑 지역변수가 있을때는 지역변수가 먼저지만 없을 경우 그냥 전역변수가 적용됨)
		
		HelloWorld4.helloPrint();  
		
		System.out.println(kor);
		System.out.println(HelloWorld4.kor);
		
	
	} //main method 영역
	
}
// memory: RAM => 16GB

