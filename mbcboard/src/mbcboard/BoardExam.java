package mbcboard;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dao.MemberDAO;
import mbcboard.dto.MemberDTO;
import mbcboard.service.BoardService;
import mbcboard.service.MemberService;
import mbcboard.service.Session;

public class BoardExam {
	// 필드
	public static Scanner inputStr = new Scanner(System.in);
	
	// 생성자->static 블럭
	
	
	
	// 메서드
	public static void main(String[] args) throws SQLException {
		// mbc게시판용 jdbc 테스트
		// dto : 객체를 담당한다.
		// dao : 데이터베이스에서 연동을 담당한다.
		// service : 부메뉴와 서비스를 담당한다.
		boolean run = true;

		while (run) {
			
			if (Session.isLoggedIn()) {
				System.out.println("현재 로그인된 사용자 : " + Session.getCurrentUser().getId());
				// 다른 기능 호출 가능
			} else {
				System.out.println("[로그인이 필요합니다.]");
			}

			System.out.println("MBC 자유 게시판입니다.");
			System.out.println("| 1. 회원메뉴 | 2. 게시판 | 3. 종료 |");
			System.out.print(">>>");
			String select = inputStr.next();
			
			switch(select) {
			case "1" :
				System.out.println("회원용 서비스로 진입합니다.");
				MemberService memberService = new MemberService();
				memberService.memberMenu(inputStr);
				break;
				
			case "2" :
					System.out.println("게시판 서비스로 진입합니다.");
					BoardService boardService = new BoardService();
					boardService.subMenu(inputStr);
					break;
			case "3" :
				System.out.println("자유게시판 프로그램 종료합니다.");
				run = false ;
				break;
			default :
				System.out.println("1~3까지만 입력 바랍니다.");
			} // switch 문 종료
			
			
		} // while문 종료
		

	}// main() 종료

} // class 종료
