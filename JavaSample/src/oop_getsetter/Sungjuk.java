package oop_getsetter;

import java.util.Scanner;

class Sungjuk {
	 //class variable: auto initial
	int bunho;
	static String name;
	static int Java;
	static int JSP;
	static int Spring;
	//int total;
	//double aver;
	//char grade;
	int getBunho() {
		return bunho;		
	}
		
	private void setBunho(int bunho) {
		this.bunho = bunho;		
	}
	
	 int getSpring() {		
		return Spring;
	}
	
   @SuppressWarnings("static-access")
private void setSpring(int spring) {		
		this.Spring = spring;
	}

   int getJSP() {		
		return JSP;
	}
   
	@SuppressWarnings("static-access")
	private void setJSP(int jSP) {		
		this.JSP = jSP;
	}

	 int getJava() {		
		return Java;
	}
	
	@SuppressWarnings("static-access")
	private void setJava(int java) {		
		this.Java = java;
	}

	 String getName() {		
		return name;
	}
	
	@SuppressWarnings("static-access")
	private void setName(String name) {		
		this.name = name;
	}
		
	void sungjukInput() {	
		
		Scanner sc = new Scanner(System.in);
		bunho = sc.nextInt();//001
		name = sc.next();//홍길동
		Java = sc.nextInt();//100
		JSP = sc.nextInt();//100
		Spring = sc.nextInt();//1000
		sc.close();
		
		 
		setBunho(bunho); 
		setName(name);
		setJava(Java);
		setJSP(JSP);
		setSpring(Spring); 
	}

}
