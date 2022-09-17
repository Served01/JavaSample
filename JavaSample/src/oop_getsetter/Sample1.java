package oop_getsetter;

import java.util.Scanner;

/* 데이터베이스 연동시에 반드시 사용
 * getter: 저장된 데이터를 조회하는 메소드 기능
 * setter: 데이터베이스에 저장하는 메소드 기능
 * 
 * 자동차 사물 
 * 속성: 제조사, 색상, 드렁크, 핸들, 썬루프, 크기, 가격......
 * 기능: 달린다, 일시정지, 가속, 변속, 감속, 주차......
 * 
 * 색상: 흰색, 가격: 10억, 제조사: 포르쉐(주), 이름: 포르쉐7 
 * 달린다, 일시정지, 주차...
 */
class DriveCar {

	private String color;
	private int price;
	private String manufacturing_company;
	private String carname;
	
	//setter	
	public void setColor(String color) {
		this.color = color;
	}

	public void setPrice(int price) {
		this.price = price;		
	}

	public void setManufacturing_company(String manufacturing_company) {
		this.manufacturing_company = manufacturing_company;
	}

	public void setCarName(String carname) {
		this.carname = carname;		
	}

	public String getColor() {
		return color;	 			
	}

	public int getPrice() {
		return price;			
	}

	public String getManufacturing_company() {
		return manufacturing_company;	 		
	}

	public String getCarName() {
		return carname; 				
	}	
	
}


public class Sample1 {

	public static void main(String[] args) {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("자동차 색상을 입력해 주세요.");
		String color = sc.next();// nextLine() 
		System.out.println("자동차 가격을 입력해 주세요.");
		int price = sc.nextInt();
		System.out.println("자동차 제조사명을 입력해 주세요.");
		String manufacturing_company = sc.next();
		System.out.println("자동차 이름을 입력해 주세요.");
		String carname = sc.next();
		
		DriveCar dc = new DriveCar();
		//data storage
		dc.setColor(color);
		dc.setPrice(price);
		dc.setManufacturing_company(manufacturing_company);
		dc.setCarName(carname); 
		
		//data query
		System.out.println("자동차 색상: " + dc.getColor());
		int price2 = dc.getPrice();
		System.out.println("자동차 가격: " + price2); 
		System.out.println("자동차 제조사: " + dc.getManufacturing_company());
		System.out.println("자동차 이름: " + dc.getCarName()); 
	}

}
