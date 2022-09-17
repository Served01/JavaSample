package oop_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class Delete_student {

	private static int stu_no;
	
	static Scanner sc = new Scanner (System.in);

	public static void main(String[] args) {
		
		//1. 드라이버 로딩: DB연결정보 파악
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		String id = "hyun"; //계정
		String pw = "1234"; //비밀번호
		
		// 2. 데이터베이스 연결 부분
		Connection conn = null; //DB연결 클래스
		PreparedStatement pstmt = null; //명령 클래스, SQL => insert, delete, select, update ...
		ResultSet rs = null; //결과 저장 출력 클래스
		
		try {
			Class.forName(driver); //예외 처리하라고 정해져 있는 것
			System.out.println("드라이버 연결에 성공하였습니다.");
		} catch (ClassNotFoundException e) {
			//e.printStackTrace();
			System.out.println("드라이버 연결에 실패하였습니다.");
		} //finally {  } 생략가능, 성공하든 실패하든 나오는 것
		
		//3. 사용자 인증
		try {
			conn= DriverManager.getConnection(url, id, pw); //예외 처리하고 정해져 있는 것
			System.out.println("사용자 인증에 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("사용자 인증에 성공하였습니다.");
		}
		
		// primary key를 기준으로 데이터를 조회, 삭제, 수정한다가 데이터베이스의 기본 공식이다
		// 여기서 primary key는 학번이다.
		// CIUD create, insert, update, delete
		
		//4. 삭제를 위한 데이터 입력 루틴
		  System.out.println("----------학생 정보 입력----------");
		  try {
		  System.out.println("학번을 입력하시오.");
		  stu_no = sc.nextInt();
		  } catch(Exception e) {
			  System.out.println("데이터가 정수형이 아닙니다. 확인 바랍니다.");
		  }
		  
		  String sql = "delete from student where stu_no = ?";
		
		  try {  
		    pstmt = conn.prepareStatement(sql);
		   
		    pstmt.setInt(1, stu_no);
		    
			pstmt.executeUpdate();
			System.out.println("데이터 삭제를 성공하였습니다.");
			
		   } catch (SQLException e1) {
		    	
		    	e1.printStackTrace();
		    	System.out.println("데이터 삭제를 실패하였습니다.");
				
		}
			
		//5. 명령 실행
		String sql2 ="select*from student";
			
		try {
			pstmt = conn.prepareStatement(sql2);
			rs = pstmt.executeQuery();
			System.out.println("데이터 조회에 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 조회에 실패하였습니다.");
		}
		
		//6. 결과 출력
		System.out.println("--------------------------학생 정보 시스템--------------------------------");
		System.out.println("학번"+"\t"+"\t"+"이름"+"\t"+"학과"+"\t"+"학년"+"\t"+"교실"+"\t"+"성별"+"\t"+"키"+"\t"+"몸무게"+"\t");
		System.out.println("----------------------------------------------------------------------");
		try {
			while(rs.next()) {
				   int no = rs.getInt(1); //stu_no
				   String name = rs.getString(2); //stu_name
				   String dept = rs.getString(3); //stu_dept
				   int grade = rs.getInt(4); //stu_grade
				   String Class = rs.getString(5); //stu_class
				   String gender = rs.getString(6); //stu_gender 
				   int height = rs.getInt(7); //stu_height 
				   int weight = rs.getInt(8); //stu_weight
				   
				   
				   System.out.println(no+"\t"+name+"\t"+dept+"\t"+grade+"\t"+Class+"\t"+gender+"\t"+height+"\t"+weight+"\t");
				   
			}
			System.out.println("----------------------------------------------------------------------");
			
		} catch (SQLException e) {
			
			e.printStackTrace();
		} finally {
			try {
			if(rs != null) {rs.close();}
			if(pstmt != null) {pstmt.close();}
			if(conn != null) {conn.close();}
			System.out.println("데이터베이스 객체를 닫는데 성공하였습니다.");
			} catch(Exception e) {
		    System.out.println("데이터베이스 객체를 닫는데 성공하였습니다.");
			}
		}
     
	}

}

//이걸 실행해서 추가하면 DBMS에서도 확인이 가능하다.
