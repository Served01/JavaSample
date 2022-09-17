public class information1 {

	public static void main(String[] args) {
		
// 문제1> 국어점수 98점이고, 수학점수 100점인 경우의 합계를 구하세요.
		// 1. 정수형 데이터
		// 2. 합계를 구하라
		int kor=98;
		int mat=100;
		int sum = kor + mat;
		System.out.println("정수형 합계: " + sum);
		
// 문제2> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계를 구하세요.
		// 1. 실수형 데이터
		// 2. 합계를 구하라
		double eng=98.5;
		double math=100.0;
		double sum2 = eng + math;
		System.out.println("실수형 합계: " + sum2);
		
// 문제3> 영어점수 98.5점이고, 수학점수 100.0점인 경우의 합계는 정수형으로 구하시오.
		// 1. 실수형 데이터
		// 2. 합계를 구하라
		// 3. cast: 형 변환 (묵시적, 강제적 형변환)
		double eng2 = 98.5;
		double math3 = 100.0;
		int sum3 = (int)(eng2 + math3);
		// 이것의 경우는 강제적 형변환이다.
		System.out.println("정수형 합계: " + sum3);
		
// 문제 4> 영어점수 98.5점이고, 수학점수 100점인 경우의 합계는 실수형으로 구하시오.
		// 1.실수형 데이터, 정수형 데이터
		// 2.합계 구하라
		// 3.묵시적 형변화
		double eng4 =98.5;
		int mat4=100;
		
		double sum4 = eng4 + mat4;
		// 실수가 정수보다 넓은 개념이라 위의 코딩이 성립됨, 이런걸 보고 묵시적 형변화라고 한다
		System.out.println("실수형 합계: " + sum4);
				
		
	}

}

/*
   정보처리 단위
   ------------
   bit: 0 또는 1
    0: False, 거짓, off, 가중치가 존재하지 않음...
    1: True, 참, on, 가중치가 있음...
    - and, or, not, exor, nor, nand, nor...
    
   byte: bit가 8개 모이면 byte = char (영문자 1바이트), unicode(한글 3바이트)
   word: 의미 있는 단어 (현대빈, 새, 공기, 겨울...)
   field: 속성값 
   record: field의 모임 혹은 집합 (현대빈 100 100 100 100.0 300 : 이 경우에는 6개의 속성 있다고 본다)
   block: ibg, irg갭
   file: record의 모임 혹은 집합, 빅데이터 A반 24명의 성적 처리
   database: file의 모임 혹은 집합 = oracle, mssql, sybase, informix, db2, ...
   databank: 무정부 은행
   
   데이터: 문자(char), 문자열(String), 
   숫자[정수형(byte, short, int, long), 실수형(float, double)], 특수문자(!@#$%...)
             1     2      4    8           4       8
   일반적으로 4바이트 단위로 처리: int(32bit), 실수형: 8바이트(64bit)
   
   * 정수형은 실수형에 비해서 정밀도가 떨어지나 처리속도는 빠르다.
   
   크기: byte < short < int < long < float < double : 묵시적 형변환의 경우
   (bit) 8      16     32     64     32      64
   
*/