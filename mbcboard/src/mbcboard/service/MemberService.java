package mbcboard.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dao.BoardDAO;
import mbcboard.dao.MemberDAO;
import mbcboard.dto.MemberDTO;

public class MemberService {

	public MemberDAO memberDAO = new MemberDAO();

	public void memberMenu(Scanner inputStr) throws SQLException {

		boolean memRun = true;
		while (memRun) {

			if (Session.isLoggedIn()) {
				System.out.println("현재 로그인된 사용자 : " + Session.getCurrentUser().getId());

			} else {
				System.out.println("[비회원상태]");
			}

			System.out.println("MBC아카데미 회원 서비스 입니다.");
			System.out.println("1. 회원가입");
			System.out.println("2. 회원정보");
			System.out.println("3. 회원정보 수정");
			System.out.println("4. 회원탈퇴");
			System.out.println("5. 로그인");
			System.out.println("6. 로그아웃");
			System.out.println("9. 나가기");
			System.out.print(">>>");
			String memselect = inputStr.next();

			switch (memselect) {
			case "1": // 완료
				System.out.println("회원가입 메뉴로 진입합니다.");
				createMember(memberDAO, inputStr, inputStr);
				break;

			case "2": // 완료
				System.out.println("회원정보 메뉴로 진입합니다.");
				readMember(memberDAO);
				break;

			case "3": // 완료
				System.out.println("회원정보 수정 메뉴로 진입합니다.");
				memberModify(inputStr, memberDAO);
				break;

			case "4": // 완료
				System.out.println("회원탈퇴 메뉴로 진입합니다.");
				memberDelete(memberDAO, inputStr);
				break;

			case "5": // 완료
				System.out.println("로그인 메뉴로 진입합니다.");
				loginMember(memberDAO, inputStr);
				break;

			case "6": // 완료
				System.out.println("로그아웃 메뉴로 진입합니다.");
				Session session = new Session();
				System.out.println("로그아웃 하시겠습니까?");
				System.out.println("| 1. 예 | 2. 아니요 |");
				System.out.print("입력 : ");
				String num = inputStr.next();
				switch (num) {
				case "1":
					System.out.println("로그아웃 성공! 안녕히가십시오.");
					session.logout();
					break;

				case "2":
					System.out.println("로그인 상태를 유지합니다.");
					break;
				}
				break;

			case "9": // 완료
				System.out.println("이전으로 돌아갑니다.");
				memRun = false;
				break;

			} // 스위치문 종료

		} // 와일문종료

	} // 메서드종료
	// ---------------------------------------------------------------------------------------------------------------------
	
	private void memberDelete(MemberDAO memberDAO, Scanner inputStr) throws SQLException {

		MemberDTO memberDTO = Session.getCurrentUser(); // 로그인한 정보

		if (memberDTO == null) {
			System.out.println("세션 정보가 없습니다. 로그인해주세요.");
			return;

		} else {
			System.out.println(memberDTO.getWriter() + "님");
			System.out.println("회원을 탈퇴하시겠습니까? 작성한 게시물도 모두 삭제됩니다.");
			System.out.println("| 1. 예 | 2. 아니요 |");
			System.out.print("입력 : ");
			String num = inputStr.next();
			
			switch (num) {
			case "1":
				BoardDAO boardDAO = new BoardDAO();
				boardDAO.deletePostsByWriter(memberDTO.getId());
				
				boolean result = memberDAO.deleteMemberById(memberDTO.getId());
				
				if (result) {
				boardDAO.deletePostsByWriter(memberDTO.getId());
				System.out.println("[회원을 탈퇴하였습니다]");
				System.out.println("------------------------------------------------------");
				Session.logout(); // 세션 초기화
				}else {
					System.out.println("회원 탈퇴 실패. 관리자에게 문의하세요.");
				}
				break;

			case "2":
				System.out.println("이전 메뉴로 돌아갑니다.");
				break;
				
				default : 
					System.out.println("잘못된 입력입니다.");
			}
		}
		
	}
	
	// ---------------------------------------------------------------------------------------------------------------------

	private void readMember(MemberDAO memberDAO) {

		MemberDTO memberDTO = Session.getCurrentUser(); // 로그인한 정보

		if (memberDTO == null) {
			System.out.println("세션 정보가 없습니다. 로그인해주세요.");
			return;

		} else {

			System.out.println("-----회원정보-----");
			System.out.println("이름 : " + memberDTO.getWriter());
			System.out.println("ID : " + memberDTO.getId());
			System.out.println("ID : " + memberDTO.getPw());
			System.out.println("-----------------------------------------------------");
		}
	}
	
	// ---------------------------------------------------------------------------------------------------------------------
	
	private void memberModify(Scanner inputStr, MemberDAO memberDAO) {
		// 회원수정

		MemberDTO memberDTO = Session.getCurrentUser();
		// 로그인한 정보
		if (memberDTO == null) {
			System.out.println("세션 정보가 없습니다. 다시 로그인해주세요.");
			return;
		}

		System.out.println("회원정보를 수정합니다.");
		System.out.println("---현재정보---");
		System.out.println("이름 : " + memberDTO.getWriter());
		System.out.println("ID : " + memberDTO.getId());
		System.out.println("ID : " + memberDTO.getPw());
		System.out.println("-----------------------------------------------------");

		inputStr.nextLine();

		System.out.print("변경할 이름 입력 (변경하지 않으려면 Enter) : ");
		String newName = inputStr.nextLine();

		System.out.print("변경할 ID 입력 (변경하지 않으려면 Enter) : ");
		String newid = inputStr.nextLine();

		System.out.print("변경할 PW 입력 (변경하지 않으려면 Enter) : ");
		String newpw = inputStr.nextLine();

		System.out.println("-----------------------------------------------------");

		if (newName == null || newName.trim().isEmpty()) { // 입력이 비어있으면 기본정보 유지
			newName = memberDTO.getWriter();
		}
		if (newid == null || newid.trim().isEmpty()) { // 입력이 비어있으면 기본정보 유지
			newid = memberDTO.getId();
		}
		if (newpw == null || newpw.trim().isEmpty()) { // 입력이 비어있으면 기본정보 유지
			newpw = memberDTO.getPw();
		}

		// 현재 id 를 기준으로 db 업데이트요청
		boolean result = memberDAO.memodifyMember(memberDTO.getId(), newName, newid, newpw);

		if (result) {
			System.out.println("회원정보 수정이 완료되었습니다.");

			memberDTO.setWriter(newName); // 새정보
			memberDTO.setId(newid);
			memberDTO.setPw(newpw);
		} else {
			System.out.println("회원정보 수정 실패. 다시 확인해주세요.");
		}

	}

// ---------------------------------------------------------------------------------------------------------------------

	private void loginMember(MemberDAO memberDAO, Scanner inputStr) {
		// 로그인
		MemberDTO memberDTO = new MemberDTO();
		System.out.println("로그인을 진행합니다.");
		System.out.print("ID : ");
		memberDTO.setId(inputStr.next());

		System.out.print("PW : ");
		memberDTO.setPw(inputStr.next());

		memberDAO.login(memberDTO);
	}

	// ---------------------------------------------------------------------------------------------------------------------

	private void createMember(MemberDAO memberDAO, Scanner inputStr, Scanner inputInt) throws SQLException {
		// 회원가입
		MemberDTO memberDTO = new MemberDTO();

		System.out.println("회원가입을 진행합니다.");
		System.out.print("이름 : ");
		memberDTO.setWriter(inputStr.next());

		System.out.print("사용할ID : ");
		memberDTO.setId(inputStr.next());

		System.out.print("사용할PW : ");
		memberDTO.setPw(inputStr.next());
		memberDAO.duplicateId(memberDTO, null);
		memberDAO.insertMember(memberDTO);

	}

} // 클래스종료
