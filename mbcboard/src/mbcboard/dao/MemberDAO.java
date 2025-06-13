package mbcboard.dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

import mbcboard.dto.BoardDTO;
import mbcboard.dto.MemberDTO;
import mbcboard.service.Session;

public class MemberDAO {

	// 게시판의 db와 연동을 담당한다.
	// jdbc 5단계를 사용
	// 1단계 : Connect 객체를 사용하여 ojdbc6.jar를 생성
	// 2단계 : url, id, pw, sql 쿼리문을 작성한다.
	// 3단계 : 쿼리문을 실행한다.
	// 4단계 : 쿼리문 실행 결과를 받는다.
	// 5단계 : 연결 종료를 진행한다.

	// 필드
	public MemberDTO memberDTO = new MemberDTO();
	public Connection connection = null; // 1단계에서 사용하는 객체
	public Statement statement = null; // 3단계에서 사용하는 객체(구형)
	public PreparedStatement preparedStatement = null; // 3단계에서 사용하는 객체(신형)
	public ResultSet resultSet = null; // 4단계에서 결과 받는 표 객체 (select 결과)
	public int result = 0; // 4단계에서 결과 받는 정수 (insert, update, delete)
	// 1개의 행이 삽입 | 수정 | 삭제 되었습니다. (정상처리 -> commit)
	// 0개의 행이 삽입 | 수정 | 삭제 되었습니다. (비정상처리 -> rollback)

	public MemberDAO() { // 기본생성자

		try {
			// 예외가 발생할 수 있는 실행문
			// 프로그램 강제종료 처리용
			Class.forName("oracle.jdbc.driver.OracleDriver"); // 1단계 ojdbc6.jar 호출
			connection = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "boardtest", "boardtest"); // 2단계
		} catch (ClassNotFoundException e) {
			System.out.println("드라이버 이름이나, ojdbc6.jar 파일이 잘못 되었습니다.");
			e.printStackTrace();
			System.exit(0); // 강제 종료
		} catch (SQLException e) {
			System.out.println("url, id, pw가 잘못 되었습니다. MemberDAO에 기본생성자를 확인하세요");
			e.printStackTrace();
			System.exit(0); // 강제 종료
		}
	}

	public void insertMember(MemberDTO memberDTO) throws SQLException {
		// jdbc를 이용하여 insert 쿼리를 처리한다.
		// PreparedStatement 문을 사용해보자.
		// 동적쿼리문 이라고 하고 ?를 사용해서 세터로 입력한다.

		if (duplicateId(memberDTO, memberDTO.getId())) {
			System.out.println(" 이미 존재하는 id입니다. 다른 id를 입력해주세요.");
			return;
		}

		try {
			String sql = "insert into member(mno, bwriter, id, pw, regidate) "
					+ " values(board_seq.nextval, ?, ?, ?, sysdate)";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getWriter()); // 첫번쨰 ? 에 이름 객체 넣음
			preparedStatement.setString(2, memberDTO.getId()); // 두번째 ?에 id 객체를 넣음
			preparedStatement.setString(3, memberDTO.getPw()); // 세번째 ?에 pw 객체 내용 넣음

			result = preparedStatement.executeUpdate();

			if (result > 0) {
				System.out.println("회원가입이 완료되었습니다.");
			} else {
				System.out.println("회원가입 실패. 다시 확인해주세요.");
			}

		} catch (SQLException e) {
			System.out.println("예외발생 : insertMember()메서드에 쿼리문을 확인하세요 ");
			e.printStackTrace();
		} finally {

		}
		try {
			if (preparedStatement != null)
				preparedStatement.close();
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	public boolean login(MemberDTO memberDTO) {

		boolean loginsuccess = false; // 로그인 세션

		try {
			String sql = "select * from member where id = ? and pw = ? ";

			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, memberDTO.getId()); // 두번째 ?에 id 객체를 넣음
			preparedStatement.setString(2, memberDTO.getPw()); // 세번째 ?에 pw 객체 내용 넣음

			resultSet = preparedStatement.executeQuery();

			if (resultSet.next()) {
				memberDTO.setId(resultSet.getString("id"));
				memberDTO.setPw(resultSet.getString("pw"));
				memberDTO.setWriter(resultSet.getString("bwriter"));

				System.out.println("로그인 성공." + memberDTO.getId() + "님 환영합니다 !");
				loginsuccess = true;
				Session.loginM(memberDTO); // 로그인 세션

			} else {
				System.out.println("로그인 실패. 다시 확인해주세요.");
			}

		} catch (SQLException e) {
			System.out.println("예외발생 : login()메서드에 쿼리문을 확인하세요 ");
			e.printStackTrace();
		} finally {

			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
			return loginsuccess;
		}
	}

	public boolean duplicateId(MemberDTO memberDTO, String id) throws SQLException {
		// 회원가입 시 중복 id 검증용 메서드
		// 프라이머리키에 중복 id가입 시 오류발생
		String sql = "select  count(*) from  member where  id = ?";
		// member 테이블에서 id가 특정값과 일치하는 행의 개수를 조회하는 문

		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);
			resultSet = preparedStatement.executeQuery(); // 쿼리 실행 후 결과를 resultSet로 받음.
			if (resultSet.next()) { // 결과가 한줄이면 true
				return resultSet.getInt(1) > 0; // count 결과값을 가져옴 1이상이면 이미 존재하는 아이디 이므로 true (중복)
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			if (resultSet != null)
				resultSet.close();
			if (preparedStatement != null)
				preparedStatement.close();
		}

		return false;

	}

	public boolean memodifyMember(String currentId, String newName, String newid, String newpw) {
		// 회원 수정
		boolean modifySuccess = false;

		try {
			String sql = "update member set bwriter = ?, id = ?, pw = ? where id = ?";
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, newName);
			preparedStatement.setString(2, newid);
			preparedStatement.setString(3, newpw);
			preparedStatement.setString(4, currentId);

			int rows = preparedStatement.executeUpdate();
			modifySuccess = (rows > 0);

		} catch (SQLException e) {
			e.printStackTrace();

		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return modifySuccess;
	}

	public boolean deleteMemberById(String id) {
		// 매개변수로 받은 ID를 기준으로 member테이블에서 해당 회원을 삭제
		// 삭제 성공여부롤 boolean값으로 반환
		boolean success = false; // 삭제 성공여부 판단용

		String sql = "delete from member where id = ?"; // 삭제할 회원을 찾는 sql문

		try {
			preparedStatement = connection.prepareStatement(sql);
			preparedStatement.setString(1, id);

			int rows = preparedStatement.executeUpdate(); // 삭제된 행의 개수를 rows에 저장
			success = (rows > 0); // 삭제된 행이 하나 이상이라면 true

			if (success) {
				connection.commit(); // 삭제 내용을 db에 반영
			} else {
				connection.rollback(); // 실패 시 롤백
			}
		} catch (SQLException e) { // 예외발생 시 스택트레이스 출력
			e.printStackTrace();
		} finally {
			try {
				if (preparedStatement != null)
					preparedStatement.close(); // preparedStatement 객체를 닫음

			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

		return success; // 삭제 성공시 true / 실패시 false반환
	}

}
