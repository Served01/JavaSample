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

public class Array2Sample {
	        // 1차원 배열
			/*
			 * Kosmo hotel을 증축합니다.
			 * 5층이고, 각 층은 7개 호실로 구성됩니다. [5][7]
			 * 이 때, 투숙객의 데이터가 다음과 같이 주어진다면,
			 * 전체 인원수와 각 층의 평균 인원수를 계산하여 출력하세요
			 * <데이터>
			 * 1층: 1, 2, 3, 4, 5, 6, 7
			 * 2층: 11, 22, 33, 44, 55, 66, 77
			 * 3층: 3, 6, 5, 2, 1, 3, 6
			 * 4층: 10, 9, 8, 7, 6, 5, 0
			 * 5층: 10, 15, 20, 25, 30, 35, 40
			 * 
			 */
	
	   static 	Scanner sc = new Scanner(System.in);
	
	public static void main(String[] args) {
		//boolean run = true;
	
		System.out.println("Kosmo hotel 배열에 저장할 갯수를 입력하시오.");
		int inRow = sc.nextInt();//5
		int incolumn = sc.nextInt();//7
		int i, j ;
		int kosmo[][] = new int [inRow][incolumn]; // 배열선언, InputData[0], [1], [2], [3], [4], [5], [6] = 7
		  //배열 객체를 선언한 것임
		
        System.out.println("각층과 호수의 인원수를 입력해 주세요.");
		
        for(i=0; i<inRow; i++) { //층
        	
			for(j=0; j<incolumn; j++) { //호수
				
				kosmo[i][j]=sc.nextInt();
				}}
			
		System.out.println();
		
	   for(i=0; i<inRow; ++i) {
	            for(j=0; j <incolumn; ++j) {
	                System.out.print(kosmo[i][j] + "\t"); // 한칸씩 띄우기.
	                if (j==(incolumn-1)) {
	                	System.out.println();
	                         } 
	            }}
	            
		System.out.println();
		
	    int sum =0;
		double aver = 0.0;
		
        for(i=0; i<inRow; i++) { //층
        	
			for(j=0; j<incolumn; j++) { //호수
				sum+=kosmo[i][j];
				aver= sum/((i+1)*(j+1));
				}
				
			 System.out.println(sum);
	    	 System.out.println(aver);
	    	 
	    	 System.out.println();
	    
	       /* if(run) {
	        	System.out.println("데이터를 계속 찾으시겠습니까?(y/n)");
	        	String contious = sc.next();
	        	
	        	if (contious.equals("y")) {
	        		continue;
	        	} else {
	        		System.out.println("프로그램을 종료합니다.");
	        		break;
	        
	        	}*/
	        	}
	        }
	
	   
	}

        
       
	        
	        
	        
	        
		
	    	
	    	
 
	
		
		
	

		
	
