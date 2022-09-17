package Exception;


/*
 * NullPointerException => 데이터 값이 null
 */

public class Sample4 {
		
	
	public static void main(String[] args) {				
				
		try {
			int[] arr = new int[3];//[0], [1], [2]
			
			arr[0] = 100;
			arr[1] = 200;
			arr[2] = 300;
			arr[3] = 500;
			
			int sum = arr[0] + arr[1] + arr[2] + arr[3];
			System.out.println(sum);//600
			
		}catch(Exception e) {
			e.printStackTrace();
			
			//System.out.println("배열의 범위를 초과하였습니다."); 
			//System.out.println("데이터 갯수나 범위를 확인해 주세요.");
		}
		//catch(InputMismatchException e) {
			//System.out.println("데이터 타입이 맞지 않습니다."); 
			//System.out.println("데이터를 확인하시고 입력해 주세요.");
		//}
	}

		
	
}
