package view;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

//데이터베이스 연결하는 클래스
public class MemberDAO {
	// 1. 오라클 데이터베이스 연동을 위한 4가지 정보를 문자열에 저장
	String driver = "oracle.jdbc.driver.OracleDriver";
	String url = "jdbc:oracle:thin:@localhost:1521:xe";
	String userid = "system";
	String passwd = "2039";

	public MemberDAO() {
		try {
			// 2. 드라이버 로딩 OracleDriver 클래스를 자바에서 이용하기 위해서 JVM에 올려줌
			Class.forName(driver);
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}// end 생성자

	// 회원 정보 보기
	public ArrayList<MemberDTO> select() {
		ArrayList list = new ArrayList<MemberDTO>();
		Connection con = null;
		PreparedStatement pstmt = null;// insert into member values(?, ?, ?, ?, ?); 이용
		ResultSet rs = null;
		// 3. Connection 맺기
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String query = "SELECT * FROM member";// 4. SQL문 작성
			pstmt = con.prepareStatement(query);// 5. PreparedStatement 생성, 요청할 SQL문을 전송하고 실행하는 클래스
			rs = pstmt.executeQuery();// 6. 전송한 후 DB에서 SQL문이 실행되고 결과를 담아 줄 것을 작성

			while (rs.next()) {
				MemberDTO dto = new MemberDTO();
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setWeight(rs.getInt("weight"));
				dto.setHeight(rs.getInt("height"));
				dto.setSex(rs.getString("sex").charAt(0));
				list.add(dto);// 컬렉션의 리스트에다 데이터베이스의 레코드를 가져와서 모두 넣어줌
			}

		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			// 7. 자원 반납
			if (rs != null)
				try {
					rs.close();
					if (pstmt != null)
						pstmt.close();
					if (con != null)
						con.close();
				} catch (SQLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
		}
		return list;
	}// end select()

	// 저장버튼 기능 - 데이터베이스안으로 새로운 자료 넣기
	public void insert(String name, String age, String weight, String height, String sex) {
		Connection con = null;
		PreparedStatement pstmt = null;

		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "INSERT INTO member (name, age, weight,height, sex)  VALUES(?,?,?,?,?)";
			pstmt = con.prepareStatement(sql);
			// ?안에 실제 데이터 넣기
			pstmt.setString(1, name);
			pstmt.setInt(2, Integer.parseInt(age));
			pstmt.setInt(3, Integer.parseInt(weight));
			pstmt.setInt(4, Integer.parseInt(height));
			pstmt.setString(5, sex);

			int n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}// end insert()

	// 검색버튼 기능
	public MemberDTO search(String name) throws RecordNotFoundException {
		
		if(!isExist(name)) throw new RecordNotFoundException("회원이 아닙니다.");
		
		MemberDTO dto = new MemberDTO();
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;

		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "SELECT * FROM member WHERE name=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				dto.setName(rs.getString("name"));
				dto.setAge(rs.getInt("age"));
				dto.setWeight(rs.getInt("weight"));
				dto.setHeight(rs.getInt("height"));
				dto.setSex(rs.getString("sex").charAt(0));

			}

		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}
		return dto;
	}

	// 삭제버튼 기능
	public void delete(String name) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "DELETE FROM member WHERE name=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			int n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}

	// 수정버튼 기능
	public void update(String name, String age, String weight, String height, String sex) {
		Connection con = null;
		PreparedStatement pstmt = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "UPDATE member SET age=?,weight=?,height=?,sex=? WHERE name=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, Integer.parseInt(age));
			pstmt.setInt(2, Integer.parseInt(weight));
			pstmt.setInt(3, Integer.parseInt(height));
			pstmt.setString(4, sex);
			pstmt.setString(5, name);
			int n = pstmt.executeUpdate();
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
	// 지우기버튼 기능

	// name이 존재하는지 체크하는 메소드
	public boolean isExist(String name) {
		boolean result = false;
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		try {
			con = DriverManager.getConnection(url, userid, passwd);
			String sql = "SELECT * FROM member WHERE name=?";
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, name);
			rs = pstmt.executeQuery();
			while (rs.next()) {
				result = true;
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			try {
				if (rs != null)
					rs.close();
				if (pstmt != null)
					pstmt.close();
				if (con != null)
					con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}

		}
		return result;

	}//end isExist()

}//end MemberDAO
