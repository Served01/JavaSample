package collection;

import java.util.Scanner;

//문제> 정수형 데이터 3개를 입력하여 출력하는 프로그램 작성

class GenericSample<T> {
	private T[] value;// 0 => 10
	private int index;
	//                        10
	@SuppressWarnings("unchecked")
	public GenericSample(int value) {
		this.value = (T[]) new Object[value];
		index=0;
	}
	
	public void data(@SuppressWarnings("unchecked") T...args) { //가변 배열 타입 선언
		for(T element: args) {
			value[index++] = element;//x1, x2, x3 input
		}
		
		
	}

	public void dataprint() {
		for(T element: value) {
			System.out.println("T type의 값: "+element);
		}
		
	}
}
public class Sample2 {
	
    static Scanner sc = new Scanner(System.in);
   
	
	@SuppressWarnings("unchecked")
	public static void main(String[] args) {
		
		/*GenericSample<Integer> gsint = new GenericSample<Integer>(10); // 여기의 10이 넣을 수 있는 입력값의 갯수
		System.out.println("정수형 데이터 3개를 입력하시오.");
		int x1 = sc.nextInt();
	    int x2 = sc.nextInt();
	    int x3 = sc.nextInt();
		gsint.data(x1,x2,x3);
		gsint.dataprint();
		
		GenericSample<Double> gsdouble = new GenericSample<Double>(10);
		System.out.println("실수형 데이터 3개를 입력하시오.");
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double y3 = sc.nextDouble();
		gsdouble.data(y1,y2,y3);
		gsdouble.dataprint();
		
		GenericSample<String> gsstr = new GenericSample<String>(10);
		System.out.println("문자형 데이터 3개를 입력하시오.");
		String z1 = sc.next();
		String z2 = sc.next();
		String z3 = sc.next();
		gsstr.data(z1,z2,z3);
		gsstr.dataprint();
		*/
		@SuppressWarnings("rawtypes")
		GenericSample gst = new GenericSample(10); // 여기의 10이 넣을 수 있는 입력값의 갯수
		System.out.println("정수형 데이터 3개를 입력하시오.");
		int x1 = sc.nextInt();
	    int x2 = sc.nextInt();
	    int x3 = sc.nextInt();
	    gst.data(x1,x2,x3);
	    gst.dataprint();
		
		
		System.out.println("실수형 데이터 3개를 입력하시오.");
		double y1 = sc.nextDouble();
		double y2 = sc.nextDouble();
		double y3 = sc.nextDouble();
		gst.data(y1,y2,y3);
		gst.dataprint();
		
		
		System.out.println("문자형 데이터 3개를 입력하시오.");
		String z1 = sc.next();
		String z2 = sc.next();
		String z3 = sc.next();
		gst.data(z1,z2,z3);
		gst.dataprint();
		
		//이 예제를 토대로 array의 경우에는 왠만해서는 한개의 object로 끝내는 것이 좋다.
		
    }


}


	