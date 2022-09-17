package collection;

import java.util.ArrayList;
import java.util.List;

/*
 * 국어, 영어, 수학을 입력 받아서 저장하고 총점, 평균을 구하여 출력하시오.
 * - 메인 클래스: Sample8_ArrayList3
 * - 서브 클래스: ScoreClass
 * 
 */

class ScoreClass {

	private double score;

	public ScoreClass(double score) {
		this.score = score;
		
	}

	public double getScore() { //보통은 setter, getter 둘 다 쓰이지만, 필요에 따라서 하나만 골라야 하는 경우도 있다.
		return score;
	}
	
}


public class Sample8_ArrayList {

	public static void main(String[] args) {
		
		List<ScoreClass> scores = new ArrayList<ScoreClass>();
		
		scores.add(new ScoreClass(100.0));
		scores.add(new ScoreClass(90.5));
		scores.add(new ScoreClass(80.3));
		
		double sum = 0, cnt = 0;
		for(ScoreClass sc : scores) {
			sum += sc.getScore();
			cnt++;
		}

		double aver = sum/cnt;
		
		System.out.println("총점은 "+sum+"이고, 평균은 "+aver+"이다." );
		
	}

}
