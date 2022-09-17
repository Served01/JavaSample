package collection;

import java.util.InputMismatchException;
import java.util.Scanner;

class GenericSample3 <T> {
	
	

	public static <T> void process(T value) {
		
		System.out.println(value.toString()+"는 "+value.getClass());
		
		
	}
		

	}
	
public class Sample4 {
	
    static Scanner sc = new Scanner(System.in);
   
	
	@SuppressWarnings({ "static-access", "rawtypes" })
	public static void main(String[] args) {
		
		try {
		GenericSample3 gs3double1 = new GenericSample3();
		System.out.println("정수형 데이터를 입력하시오.");
		int intdata = sc.nextInt();
		GenericSample3 gs3double2 = new GenericSample3();
		System.out.println("실수형 데이터를 입력하시오.");
		double doubledata = sc.nextDouble();
		GenericSample3 gs3double3 = new GenericSample3();
		System.out.println("문자열 데이터를 입력하시오.");
		String strdata = sc.next();
		
		
		gs3double1.process(intdata);
		gs3double2.process(doubledata);
		gs3double3.process(strdata);
		
		} catch(InputMismatchException e) {
		System.out.println("입력 데이터가 잘못되었습니다. 확인해 주세요.");
		}
		
    }

}




	