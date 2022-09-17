package oop_method;

import java.util.Scanner;

/* method: function = 함수 = 기능 (행위,동작)
 * object: 객체, 사물이 곧 객체
 * Object Oriented Programming (OOP): 객체지향형 프로그래밍
 * 
 * 자동차 객체
 * - 속성(attribute): 대부분 필드 영역에서 클래스 변수 = static, 전역, 지역변수 (지역변수는 main method 영역에서 쓰임.)
 *   색상, 가격, 성능, ...
 * - 기능(method): 대부분 필드 영역에서 클래스 메소드, 지역메소드 (지역메소드는 main method 영역에서 쓰임.)
 *   동작(출발, 정지, 후진)
 * 클래스안에서 객체를 생성합니다.
 * 호출은 객체명. 메소드명();
 * 
 * call by value: int i = 300;
 * call by reference: car.start();
 * 
 */
// static을 넣는다는거 자체가 객체지향적으로 코딩 안했을때 쓰게 되는 것이므로 이것을 최대한 안쓰면서 프로그래밍 하는게 객체지향적인것이다.

public class method_dowhileSample { //1000
	
    static Scanner sc = new Scanner(System.in);
    
	public int hap1(int startNumber,int endNumber) {
		//1~100사이의 합을 구하시오.
		
		int sum = 0;
	    do {
			sum+=startNumber; 
			startNumber+=1;   
			
		} while(startNumber<=endNumber);
	    
	    return sum; //설계상 반환하라고 설계되었다면 그렇게 해야함.
		
		}
	
	
	 public void hap2(int startNumber,int endNumber) {
		//홀수의 합
		//이런걸 객체형식으로 다른데에서도 계속 쓰고 싶다면 필드영역에다 만들고 메인 메소드에서는 그것을 객체형식으로 실행시키는 방식으로 하면 좋음
		
        int sum2 = 0;
		do { 
			
			sum2+=startNumber; 
			startNumber+=2;   
			
		} while(startNumber<=endNumber);
			
		System.out.println(sum2);
	  }
	
	  public void hap3(int startNumber,int endNumber) {
		//짝수의 합
		int sum3 = 0;
	    int startNumber2=startNumber+1;
		
		   do { 
				sum3+=startNumber2; 
				startNumber2+=2;    
				
			} while(startNumber2<=endNumber);
		
			System.out.println(sum3);//2550
	    }
	
	   public static void main(String[] args) {  //1200 address
		// mds = 1000 address
		System.out.println("시작값을 입력하시오.");
		int startNumber = sc.nextInt();
		System.out.println("마지막값을 입력하시오.");
		int endNumber = sc.nextInt();
		
		//int startNumber = 1;
		//int endNumber = 100; 이런식으로 값을 지정해도 됨.
		
		method_dowhileSample mds = new method_dowhileSample();
		// 요구사항: 전달인자 2개, 반환하시오.
		//object = reference variable = pointer = address
		int sum = mds.hap1(startNumber,endNumber); //1~100사이의 합을 구하시오. 반환할값을 여기다가 적어놓고 반환시키시오.
		//ins sum 이라고 지정한 것 자체가 이 값은 반환해서 받는다라는 의미이다.
		System.out.println("시작값~마지막값: "+ sum);
		System.out.println("======================짝수합==============================");
		
		method_dowhileSample mds2 = new method_dowhileSample();
		method_dowhileSample mds3 = new method_dowhileSample();
		
	    if(startNumber%2==0) {mds2.hap2(startNumber, endNumber);
	    // 아마 이렇게 object를 일일히 나눈다면 당연 코딩 성능은 좋아질거임 그러나 그만큼 RAM을 많이 잡아먹게 될거임.
	    } else if(startNumber%2==1) {mds3.hap3(startNumber, endNumber);
	    } else {System.out.println("잘못된 데이터값이 입력되었습니다.");}
	    
		System.out.println("======================홀수합==============================");
		//설계상 요구사항에 맞게 코딩을 해야한다.
		
		if(startNumber%2==1) {mds2.hap2(startNumber, endNumber);
		} else if(startNumber%2==0) {mds3.hap3(startNumber, endNumber);
		} else {System.out.println("잘못된 데이터값이 입력되었습니다.");
			   }
	    }
	}


