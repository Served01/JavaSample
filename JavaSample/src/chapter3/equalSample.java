package chapter3;

public class equalSample {

	public static void main(String[] args) {
		//equal: ==, equals(): 주소값을 비교 즉, 객체끼리 비교
		//method: x(); 이건 x라는 메소드라는 뜻
		//x == 100 : 내용을 비교한다. 반드시 기본 자료형일 경우에만 가능함
		int su1 = 100; //여기서 정한 int들은 기본자료형들이다.
		int su2 = 100;
		int su3 = 300;
		
		System.out.println(su1 == su2); //True
		//                 100 == 100
		System.out.println(su1 == su3); //False

		su3 = su1; // 100 = 100 (대입연산자의 기준은 항상 오른쪽이다., copy)
		
		System.out.println(su1 == su2); //true
		System.out.println(su1 == su3); //true
		//System.out.println(su1.equals(su3)); error가 날 수 밖에 없음, equals는 object끼리 비교하는 것이다.
		
		String str1 = new String("문자열"); //1000번지 여기서 정한 str들은 object이다.
		String str2 = new String("문자열"); //1000번지 왜 같은 번지냐면 내용이 같은 object끼리는 서로 같은 번지수를 공유한다.
		String str3 = new String("숫자");  //3000번지
		
		System.out.println(str1.equals(str2)); //true, 1000==1000
		System.out.println(str1.equals(str3)); //false 1000==3000
		System.out.println(str1 == str3);
		
		str1 = str3; //address value copy
		System.out.println(str1.equals(str3)); //true 이것을 통하여 코딩의 순서가 얼마나 큰 영향을 미치는지 알 수 있다.
		System.out.println(str1 == str3); //이건 되기는 하는데 현장에서 안씀. 위의 줄로 현장에서는 쓰임.
		/* 
		 * equals()는 메소드이고 ==는 비교를 위한 연산자이다.
		 * equals는 대상의 내용을 비교하고 ==는 대상의 주소값을 서로 비교한다.
		 * 즉 내용만 같으면 equals에서는 true값이지만 새로운 object에 같은 내용이 있다면 ==에서는 false이다.
		 * 
		 */
	}

}
