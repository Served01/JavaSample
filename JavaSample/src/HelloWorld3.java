
public class HelloWorld3 { // 번지: 1000 이라고 가정, 서울시
//field area: 공용 영역, 클래스(전역)메소드, 클래스(전역)변수
	
	private void helloPrint() { // 번지: 2000 이라고 가정, 신림동
		System.out.println("안녕하세요?????");
		System.out.println("Helloworld~~~");
		
	}
		
	public static void main(String[] args) {  //번지: 3000 이라고 가정, 구로구

		HelloWorld3 helloworld3 = new HelloWorld3();
		
		helloworld3.helloPrint(); //신림동 호출, 객체명,메소드명 공식에 의하여 
	
	} //main method 영역
	
}
// memory: RAM => 16GB

// 접근제한자
/* 개발자가 프로그래밍 할 때 접근제한자를 결정해야한다.
 * 접근 제한자                적용 대상                      접근 가능 대상                       접근 불가 대상
  public             클래스, 필드, 생성자, 메소드               모든 대상                             없음
  protected             필드, 생성자, 메소드           같은 패키지 또는 자식 클래스       자식 클래스가 아닌 다른 패키지에 소속된 클래스
  default(생략)    클래스, 필드, 생성자, 메소드             같은 패키지에 소속된 클래스              다른 패키지에 소속된 클래스
  private              필드, 생성자, 메소드                  클래스 내부                           클래스 외부
 * 
 */
// main method는 깨끗하게 하는 것이 가장 좋은 프로그래밍 방식이다.
// 공용 영역에다가 개인 메소드를 만들어 놓는 것이 활용성이 높아진다.