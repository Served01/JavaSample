package collection;

import java.util.Scanner;

//문제> 자바, 제이에스피, 스프링의 각각의 점수를 입력 받아서 총점과 평균을 구하여 출력하시오.
//단, 제네릭을 적용하여 코딩하시오.

class GenericSample2 <T> {
	
	private T data;
	private double total, aver;
	                      
	
	public void setData(T value) {
	    
		this.data = value;
		
	}
	
	public T getData() {
		
		return data;
	}
	
	

	public void process(double java2, double jsp2, double spring2) {
		
		total = java2 + jsp2 + spring2;
		aver = total/3.0;
		
	}
		
	public void dataprint() {
		System.out.println("총점: "+total);
		System.out.println("평균: "+aver);		
	}

	}
	
public class Sample3 {
	
    static Scanner sc = new Scanner(System.in);
   
	
	public static void main(String[] args) {
		
		
		GenericSample2<Double> gs2double1 = new GenericSample2<Double>();
		System.out.println("자바 점수를 입력하시오.");
		double java = sc.nextDouble();
		GenericSample2<Double> gs2double2 = new GenericSample2<Double>();
		System.out.println("제이에스피 점수를 입력하시오.");
		double jsp = sc.nextDouble();
		GenericSample2<Double> gs2double3 = new GenericSample2<Double>();
		System.out.println("스프링 점수를 입력하시오.");
		double spring = sc.nextDouble();
		
		gs2double1.setData(java);
		gs2double2.setData(jsp);
		gs2double3.setData(spring);
		
		double java2 = gs2double1.getData();
		double jsp2 = gs2double2.getData();
		double spring2 = gs2double3.getData();
		
		
		gs2double1.process(java2, jsp2, spring2);
		gs2double1.dataprint();
		
		
		
    }


}




	