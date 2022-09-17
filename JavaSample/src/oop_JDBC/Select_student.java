package oop_JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Select_student {

	public static void main(String[] args) {
		/*  학생 정보 조회 프로그램 작성
		 *  1. 드라이버 로딩: DB연결정보 파악
		 */
		String driver = "oracle.jdbc.OracleDriver";
		String url = "jdbc:oracle:thin:@localhost:1521:xe";
		//String url = "jdbc:oracle:thin:@127.0.0.1:1521:xe"; : loopback test
		//String url = "jdbc:oracle:thin:@210.45.23.96:1521:xe"; : 공인 IP
		//String url = "jdbc:oracle:thin:@192.168.0.71:1521:xe"; : 사설망 IP
		String id = "hyun"; //계정
		String pw = "1234"; //비밀번호
		
		/* 회사에 들어가서 일을 하다보면 본인이 인지 못하고 무엇인가를 건드렸을 경우
		 * 엄청난 후폭풍이 불 수 있음. 그러므로 본인이 회사에서 하는 일에는 항상
		 * 하나하나 신경써서 행동해야함. 본인의 정말 사소한 행동 하나로 인해 회사 전체가 멈출 수도 있음.
		 */
		
		// 2. 데이터베이스 연결 부분
		Connection conn = null; //DB연결 클래스
		PreparedStatement pstmt = null; //명령 클래스, SQL => insert, delete, select, update ...
		// 그냥 Statement를 써도 되지만 해킹에 취약하므로 위의 명령어를 쓴다.
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
		
		//4. 명령 실행
		String sql ="select*from student";
		
		// DB관리자는 몇줄이면 끝나는 일이지만 개발자는 위와 같이 굉장히 많은 것을 코딩해야 한다. 그러나 각각이 가지고 있는 책임감이 다르다.
		// 그래서 DB관리자는 이미 개발자로 회사에서 몇년 동안 일한 사람에게 맡긴다. 그게 대부분의 경우임.
		// 일찍 승진한 사람일수록 그만큼 빨리 잘리게 되어 있다. 그것이 회사내 순리이다.
		// 그러므로 회사내에 어느정도 적응하면 결정해야 한다. 돈을 많이 벌고 빨리 승진해서 회사에서 일찍 나갈 것인지 아니면 적당한 돈을 벌면서 높은 직위는 아니지만 오래 유지 할 건지
			
		try {
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			System.out.println("데이터 조회에 성공하였습니다.");
		} catch (SQLException e) {
			System.out.println("데이터 조회에 실패하였습니다.");
		}
		
		//5. 결과 출력
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

