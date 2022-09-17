package oop_method;

/* method overloading (이와 별개로 생성자 overloading도 있음.)
 * 메소드가 같은 이름을 가지고 다른 역할을 하는 기능을 구현하는 것을 말한다.
 * - 자료형이나 갯수가 다르면 오버로딩이 가능합니다.
 */

public class method_overloadingSample {

	    
		public int hap (int startNumber,int endNumber) {
			
			int sum = 0;
		    do {
				sum+=startNumber; 
				startNumber+=1;   
				
			} while(startNumber<=endNumber);
		    
		    return sum; 
			}
		
		
		public int hap() {
			
	        int sum2 = 0;
	        
	        int startNumber=1;
	        int endNumber=100;
	        
			do { 
				
				sum2+=startNumber; 
				startNumber+=2;   
				
			} while(startNumber<=endNumber);
		    return sum2;
		}
		
		public int hap(int endNumber) {
			
			int sum3 = 0;
		    int startNumber=0;
			
			   do { 
					sum3+=startNumber; 
					startNumber+=2;    
					
				} while(startNumber<=endNumber);
			    return sum3;
		 }
		
		public static void main(String[] args) {  
			
			method_overloadingSample mds = new method_overloadingSample ();
			
			int startNumber = 1;
			int endNumber = 100;
			
		
			int sum = mds.hap(startNumber, endNumber);
			System.out.println("시작값~마지막값: "+ sum);
			System.out.println("======================짝수합==============================");
			
			
			int sum2 = mds.hap();
			System.out.println(sum2);
		    System.out.println("======================홀수합==============================");
			
		   
			int sum3 = mds.hap(endNumber);
			System.out.println(sum3);
		}
}
 
