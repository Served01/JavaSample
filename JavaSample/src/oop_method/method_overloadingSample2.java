package oop_method;

import java.util.Scanner;

public class method_overloadingSample2 { 
	
	//scanner는 숫자형 문자형 나누어서 했는데 buffered를 쓰면 구분 없이 쓰는게 가능

	    static Scanner sc = new Scanner(System.in);	
	
		public void su() {
			
	        int sum = 0;
	        int s = 1;
	        
	        for(int i=1; i<=10; i++) {
	        	
	        	s*=i;
	        	sum+=s;
	        	
	        }
	        System.out.println("1~100: "+ sum);
		 }
		
            public void su (int su) { //매개변수1개
            	
	        int sum = 0;
		    for(int i =0; i<=su; i++) {
		    	sum+=i;
		    }
		    System.out.println("1~100: "+ sum);
		 }
		
            public void su (int su1, int su2) { //매개변수2개
    			
    			int sum = 0;
    		    do {
    				sum+=su1;
    				su1+=1;
    				
    			} while(su1<=su2);
    		   System.out.println("100~300: "+ sum);
    		    
    			}
             public void su (int su1, double su2) { //매개변수2개
    			
    			double sum = 0;
    		    sum=su1+su2;
    			
    		   System.out.println("100~300.123: "+ sum);
    		    
    			}
             
             
             public void su (double su1, int su2) { //매개변수2개
     			
     			int sum = 0;
     		    sum=(int)(su1+su2);
     			
     		   System.out.println("123.123~500: "+ sum);
     		    
     			}
             
             
             private void su(String str) {
     			
            	 System.out.println(str);
     			
     		}
             
             private void su(String str1, String str2) {
      			
            	 System.out.println(str1+" "+str2);
     			
     		}
             
             private void su(int su1, String str2) {
       			
            	 System.out.println(su1+" "+str2);
     			
     		}
             
             
          
    		
		public static void main(String[] args) {  //메인은 무조건 이 상태여야 한다.
			
			method_overloadingSample2 mds = new method_overloadingSample2 ();
			method_overloadingSample2 mds2 = new method_overloadingSample2 ();
			mds.su();
			mds2.su(100);
			mds.su(100, 300);
			mds.su(100, 300.123); 
	        mds.su(123.123, 500);
			mds.su("Hello~"); //왠만해서는 의미있는 값들이 나오도록 코딩을 짜야 좋은 코딩이다.
			mds.su("Hello~", "임우성");
			mds.su(2, "Hello~");
			
			
			int number = sc.nextInt();
			String str2 = sc.next();
			mds.su(number, str2);
		}
		
        // 값이 오버플로우 되면 음수로 되는데 지금은 long이 있어서 전환시키면된다. 정수형으로 오버플로우 되는 범위는 42억 근처이다.
}
		 