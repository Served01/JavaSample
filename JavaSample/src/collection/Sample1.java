package collection;

/* 
 * Generic: 5.x이전에 소스파일과 그 이후에 파일의 차이를 말한다.
 * - 잘못된 타입이 사용되는 것을 방지하기 위해서 
 * - 타입 파라미터를 이용하여 코드 작성시에 구체적인 타입으로 코드를 작성하도록 한다.
 * - 데이터 처리 능력을 향상시키기 위하여 만들어진 틀
 * - 장점> 하나의 코드를 여러 타입에 대하여 사용할 수 있는 기술이다.
 * - 클래스에 사용할 타입을 클래스 디자인시에 지정하는 것이 아니라
 *   클래스를 사용하는 시점에서 지정한 후에 사용하는 기술이다.
 * - 컴파일시에 강한 타입 체크를 한다. => 사전에 오류 방지
 * - 제네릭은 클래스형이 아니라, 캐스팅을 위한 표시이다.
 * 
 *  Vector v = new Vector();
 *  Vector<String> v = new Vector<String>();
 *  Vector<Integer> v = new Vector<Integer>();
 *  Vector<Integer> v = new Vector();
 *  
 */

public class Sample1 {
	
	/*private static void printArray(Integer[] intArray) {
		
		//가변 for문: 기존에 배우던 for문이 아닌 현장에서 자주 쓰이는 형태의 for문
		//밑의 두가지 형태 중 면접관 입장에서는 generic을 쓴 사람을 뽑게 될 수 밖에 없다.
		
    for(Integer element : intArray) {
			System.out.println("intArray: " + element);
		}
		
	for(int i = 0; i<5; i++) {
			
		System.out.println("intArray: "+ intArray[i]);
		
	    }
	}
	
	private static void printArray(Double[] doubleArray) {
		for(Double element: doubleArray) {
			System.out.println("doubleArray: "+element);
		}
		
	}
	
	private static void printArray(String[] strArray) {
		for(String element: strArray) {
			System.out.println("strArray: "+element);
		}
		
	}
	*/
	
	//Object Type
	//이것의 단점은 변수를 받아들일때 전부 문자형으로 받기 때문에 이 결과물을 다시 쓰려면 형변환을 해주어야 쓸 수 있다.
	/*
	@SuppressWarnings("unused")
	private static void printArray(Object[] oArray) {
		//가변 for문
		for(Object element: oArray) {
			System.out.println("oArray: "+ element);
		}
		
	}
	*/
	
	//generic을 적용: 이거 T타입은 위의 object와 달리 들어오는 형태대로 받아들인다.
	//프로그램의 처리 속도가 아주 좋아진다. 코딩중에 T형태가 나오면 generic 했다고 생각하면 됨.
	//generic은 공간도 절약되고 처리속도도 빨라진다. 즉, 성능 향상을 위해 사용된다고 생각하면 됨.
	private static <T> void printArray(T[] TArray) {
		
		for(T element : TArray) {
			System.out.println("TArray: "+ element);
		}
	}
	
	public static void main(String[] args) {
		//제네릭의 경우
		Integer[] intArray = {10, 20, 30, 40, 50};
		printArray(intArray);
		
		Double[] doubleArray = {10.1, 20.2, 30.3, 40.4, 50.5};
		printArray(doubleArray);
		
		String[] strArray = {"white", "blue","red", "black", "green"};
		printArray(strArray);

		//지금 형태는 메소드 오버로딩 형태이다.
    }

}


	