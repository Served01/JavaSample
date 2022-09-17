package collection;

import java.util.Enumeration;
import java.util.List;
import java.util.Scanner;
import java.util.Vector;
//강사방의 ArrayList2는 다른 문제니깐 여기다 풀어보시오.
	/* 이름, 국어, 영어, 수학 점수를 입력 받아서
	 * 총점, 평균, 등수를 구하고
	 * 출력하는 프로그램을 작성하라. 
	 * 
	 * List: 순서가 존재한다. 1,2,3,4,5 , 중복 데이터 허용
	 * Set: 순서가 없다. 1,3,5,2,4 , 
	 * Map: [key, value]의 쌍으로 구성, key는 중복을 허용하지 않으나 value는 중복을 허용한다.
	 * 위의 내용은 spring 할 때 중요한 요소로 작용한다.
	 * 
	 */

class StudentVector {
	
	
	//Vector를 이용하여 처리
	
	List<StudentVO> list = new Vector<StudentVO>(); //List<> 중복과 순서를 허락한다는 의미
	private int count;
	Vector<StudentVO> vec = (Vector <StudentVO>)list; //down casting
	
	public StudentVector(){
		
		inputData();
		
		processRank(vec); //등수 구하기
		printData(vec); //출력하기
		
	}


	private void processRank(Vector<StudentVO> vec) {
		
		int[] temp_total = new int[count];
		StudentVO stus;
		int i = 0, rank;
		
		Enumeration<StudentVO> enums = vec.elements();
		while (enums.hasMoreElements()) {
		stus = enums.nextElement();

		i++;
		stus.setRank(1); //첫번째 데이터 1등으로 설정하기
		
		}
		// vector에서는 묶음으로 관리하는 역할을 Enumeration이 하고 이것을 array 가게 되면 이 역할을 Iterator가 담당하게 된다.
		//등수 정하기
		Enumeration<StudentVO> enums2 = vec.elements();
		while (enums2.hasMoreElements()) {
		stus = enums2.nextElement();
		rank = stus.getRank();	
		
		for(i=0; i< temp_total.length; i++) {
			if(stus.getTotal() < temp_total[i])
				rank++;
		}
		stus.setRank(rank);
		
	}
		
}
	private void printData(Vector<StudentVO> vec) {
		System.out.println("--------------------------------------------------------------------------------------------");
		System.out.println("이름\t국어\t영어\t수학\t총점\t평균\t석차");//열거형으로 해야지 편함
		System.out.println("--------------------------------------------------------------------------------------------");
		
		Enumeration<StudentVO> enums3 = vec.elements();
		
		while(enums3.hasMoreElements()) {
			 StudentVO stus = enums3.nextElement();
			 System.out.println(stus.getName() + "\t" + stus.getKor() + "\t" + stus.getEng() + "\t" + stus.getMat()+
			 "\t"+stus.getTotal()+"\t"+stus.getAver()+"\t"+stus.getRank());
		}
		
		
	}


	public void inputData() {
		Scanner sc = new Scanner(System.in);
		System.out.println("처리할 데이터 갯수를 입력해 주세요.");
		int count = sc.nextInt();
		int cnt=0;
		do {
			System.out.println("처리할 데이터를 입력해 주세요.");
			System.out.println("이름");
			String name= sc.next();
			System.out.println("국어점수");
			int kor = sc.nextInt();
			System.out.println("영어점수");
			int eng = sc.nextInt();
			System.out.println("수학점수");
			int mat = sc.nextInt();
			cnt++;
			list.add(new StudentVO(name, kor, eng, mat));
			sc.close();
			
		} while(cnt<count);
	}
	
	
}
public class Sample6_sungjuckVector {
   
	
	
	public static void main(String[] args) {
		
		new StudentVector();
	
    }
}






	