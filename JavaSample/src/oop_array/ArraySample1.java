package oop_array;

import java.util.Scanner;

/* Array(배열): 데이터가 많은 경우에 사용합니다. => 자료구조(LinkedList, Vector, ArrayList...) (수업 중에 배우지는 않지만 따로 공부해야만함.)
 * memory(이게 바로 RAM) = address부여 = Array = pointer = index
 * - 데이터 50개
 * index(address)
 * 1차원 배열: 점, s[5] = s[0],s[1],s[2],s[3],s[4],... 표현 /항상 0부터 시작한다 (2진수의 영향)
 * 2차원 배열: 선, 행(x좌표)렬(y좌표): 
 * s[3][2] = [2][1]: 
 * 
 * s[0][0], s[0][1], 
 * s[1][0], s[1][1], 
 * s[2][0], s[2][1]
 * 
 * 3차원 배열: 면(공간), s[3][2][4]: 3면, 2행, 4열
 * 
 * s[0][0][0], s[0][0][1], s[0][0][2], s[0][0][3], 
 * s[0][1][0], s[0][1][1], s[0][1][2], s[0][1][3], 
 * 
 * s[1][0][0], s[1][0][1], s[1][0][2], s[1][0][3], 
 * s[1][1][0], s[1][1][1], s[1][1][2], s[1][1][3], 
 * 
 * s[2][0][0], s[2][0][1], s[2][0][2], s[2][0][3], 
 * s[2][1][0], s[2][1][1], s[2][1][2], s[2][1][3] 
 * 
 * s[3][3][4]: 3면, 3행, 4열
 * 
 * s[0][0][0], s[0][0][1], s[0][0][2], s[0][0][3], 
 * s[0][1][0], s[0][1][1], s[0][1][2], s[0][1][3], 
 * s[0][2][0], s[0][2][1], s[0][2][2], s[0][2][3],
 * 
 * s[1][0][0], s[1][0][1], s[1][0][2], s[1][0][3], 
 * s[1][1][0], s[1][1][1], s[1][1][2], s[1][1][3], 
 * s[1][2][0], s[1][2][1], s[1][2][2], s[1][2][3],
 * 
 * s[2][0][0], s[2][0][1], s[2][0][2], s[2][0][3], 
 * s[2][1][0], s[2][1][1], s[2][1][2], s[2][1][3],
 * s[2][2][0], s[2][2][1], s[2][2][2], s[2][2][3]
 * 
 * N차원 배열: 시, 공간 //수학적으로 말하는 차원과 약간 다르게 이해해야함. 근본적으로는 같음
 * 대부분의 언어는 행 우선이 기준: 왼쪽에서 오른쪽으로 데이터 저장
 * Java나 이런거는 행 우선인데 Python은 열 우선이다. 대부분은 행 우선임.
 * 
 * 공학과 과학을 하는 사람들이 쉽게 빠지는 오류가 본인이 정답이라고 생각하는 것. 시간이 지남에 따라 그 답이 달라질 수도 있다는 것을 이해하고 인지해야 한다.
 * 물론 생명공학에서 원인 과정 결과 모두 오류일 가능성이 있어서 컴퓨터로 온 것이지만 컴퓨터 역시 그럴수 있다.
 * 그러나 컴퓨터는 그 비중이 다르다. 생명공학은 3개 모두 비슷비슷하게 33, 33, 33퍼라고 생각한다면 컴퓨터는 50, 49, 1 이런식으로 실질적으로 결과는 제외하고 나머지에서 오류를 찾을 수 있다.
 * 이 차이가 굉장히 크다. 그리고 그 스트레스는 나에게 있어서는 말도 못한다.
 * 
 * index에서 쓰이는 차원과 실제 차원의 의미가 다른건지 아니면 오류인건지 질문하기
 */

public class ArraySample1 {
	        // 1차원 배열
			/*
			 * 임의의 숫자를 입력받아서, 저장하고, 찾고자 하는 데이터가 어디있는지를 판별하여 출력하세요.
			 * 1. int InputData[] = new int[n] : 7
			 * InputData[i] => i는 배열에 사용할 인덱스
			 * 2. 데이터 갯수: 7개
			 * 3. for, while, do~while 선택
			 * 4. 입력변수: inDatasu
			 * 5. 출력변수: outData
			 * 
			 * java는 데이터를 입력할 때 기본적으로 문자열로 입력이 됩니다.
			 * 입력받은 숫자인 경우에는 parseInput()를 호출하여 숫자형태의 데이터로 변환하고 사용해야 한다. 
			 */
	
	static 	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		
		//boolean dataa = true;
	
		System.out.println("배열에 저장할 갯수를 입력하시오.");
		String inDatasu = sc.next(); //"7" ""는 더블 코테이션이라고 한다. 우리는 더블 옥퍼스트로피라고 하는것
		int n = Integer.parseInt(inDatasu); //7
		
		int InputData[] = new int[n]; // 배열선언, InputData[0], [1], [2], [3], [4], [5], [6] = 7
		  //배열 객체를 선언한 것임
		
        System.out.println("저장할 임의의 데이터를 입력하시오.");
		for(int i=0; i<n; i++) { //0, 0<5, 1<5, 2<5, 3<5, 4<5, 5<5[x]
			
			InputData[i] = sc.nextInt();
			/* InputData[0] = 50
			 * InputData[1] = 75
			 * InputData[2] = 750
			 * InputData[3] = 7500
			 * InputData[4] = 75000
			 * 
			 */
			
		}
		System.out.println();
		
		for(int i=0; i<n; i++) {
			
		
			System.out.println("["+i+"]"+ "는 " + InputData[i]);
		}
		
		boolean run = true;
		while(run){
			System.out.println("찾을 데이터를 입력하시오.");
	        int seDatasu = sc.nextInt(); // 저장된 데이터 중에서 찾을 값을 입력
		
	        for(int i=0; i<n; i++) {
	    	
	    	if (InputData[i] == seDatasu) {
	    		
	    		System.out.println(InputData[i]+"는 "+"["+i+"]");
	    		System.out.println();
	    	    } else {
	    	    	System.out.println(InputData[i] +"는 찾는 데이터가 아닙니다.");
	    	    	System.out.println();
	    	    	
	    	    }
	    	  }
	        System.out.println();
	        if(run) {
	        	System.out.println("데이터를 계속 찾으시겠습니까?(y/n)");
	        	String contious = sc.next();
	        	
	        	if (contious.equals("y")) {
	        		continue;
	        	} else {
	        		System.out.println("프로그램을 종료합니다.");
	        		break;
	        
	        	}
	        	
	        }
	        }
		
	    	
	    	}
 }
	
		
		
	

		
	
