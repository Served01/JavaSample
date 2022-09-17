package collection;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/*
 * 국어, 영어, 수학을 입력 받아서 저장하고 총점, 평균을 구하여 출력하시오.
 * - 메인 클래스: Sample8_ArrayList2
 */

public class Sample8_ArrayList2 {
    
	static Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		List<String> subject = new ArrayList<String>();
		List<Integer> score = new ArrayList<Integer>();
		
		
		
			
		   System.out.println("국어점수를 입력하시오.");
		   subject.add("국어 점수: ");
		   score.add(sc.nextInt());
		   
		   System.out.println("영어점수를 입력하시오.");
		   subject.add("영어 점수: ");
		   score.add(sc.nextInt());
		   
		   System.out.println("수학점수를 입력하시오.");
		   subject.add("수학 점수: ");
		   score.add(sc.nextInt());
		   
		
		   int sum = 0, cnt = 0;
		   for(int i =0; i<subject.size(); i++) {
			
			sum += score.get(i);
			cnt++;
			
		   }

		   double aver = sum/cnt;
		
		   System.out.println("총점은 "+sum+"이고, 평균은 "+aver+"이다." );
		
	       }

}
