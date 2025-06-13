package mbcboard.service;

import java.sql.SQLException;
import java.util.Scanner;

import mbcboard.dao.BoardDAO;
import mbcboard.dto.BoardDTO;

public class BoardService {
	// dao와 dto를 사용하여 부메뉴와 CRUD를 처리한다.

	// 필드
	public BoardDAO boardDAO = new BoardDAO(); // 1단계, 2단계가 수행 된다.

	// 생성자

	// 메서드 (부메뉴, 생성, 모두보기, 1개보기, 수정하기, 삭제하기)
	public void subMenu(Scanner inputStr) throws SQLException {
		boolean subRun = true;
		while (subRun) {
			System.out.println("MBC아카데미 게시판 서비스 입니다.");
			System.out.println("1. 모두보기");
			System.out.println("2. 게시글 작성");
			System.out.println("3. 게시글 자세히 보기");
			System.out.println("4. 게시글 수정");
			System.out.println("5. 게시글 삭제");
			System.out.println("6. 나가기");
			System.out.print(">>>");
			String subSelect = inputStr.next();

			switch (subSelect) {

			case "1":
				System.out.println("-----모든 게시글 보기-----");
				selectAll(boardDAO);
				break;

			case "2":
				if (Session.isLoggedIn()) {
					System.out.println("현재 로그인된 사용자: " + Session.getCurrentUser().getId());
					// 게시판 기능 호출 가능
					System.out.println("게시글 작성메뉴로 진입합니다.");
					insertBoard(boardDAO, inputStr);
					break;
				} else {
					System.out.println("로그인후 사용가능합니다.");
					System.out.println("-------------------------------");
					break;
				}

			case "3":
				System.out.println("게시글 자세히 보기메뉴로 진입합니다.");
				readOne(inputStr);
				break;

			case "4":
				if (Session.isLoggedIn()) {
					System.out.println("게시글 수정메서드로 진입합니다.");
					System.out.println("현재 로그인된 사용자: " + Session.getCurrentUser().getId());
					
					System.out.print("수정할 게시글 제목입력 : ");
				    inputStr.nextLine(); // 버퍼 제거
				    String title = inputStr.nextLine(); // 제목 입력 (띄어쓰기 포함 가능)
				 // 게시글 수정 기능 호출
					modify(title,inputStr); // title과 Scanner 모두 전달
					break;
				} else {
					System.out.println("로그인후 사용가능합니다.");
					System.out.println("-------------------------------");
					break;
				}

			case "5":
				if (Session.isLoggedIn()) {
					System.out.println("게시글 삭제메서드로 진입합니다.");
					System.out.println("현재 로그인된 사용자: " + Session.getCurrentUser().getId());
					deleteOne();
					break;
				} else {
					System.out.println("로그인후 사용가능합니다.");
					System.out.println("-------------------------------");
					break;
				}

			case "6":
				System.out.println("게시글 보기 종료");
				subRun = false;
				break;

			} // switch문 종료(부메뉴)

		} // while 문 종료 (부메뉴 반복)
	} // 부메뉴 메서드 종료

	private void deleteOne() throws SQLException {
		// 게시물의 번호를 받아 삭제한다
		System.out.println("삭제할 게시물의 번호를 입력하세요.");
		Scanner inputInt = new Scanner(System.in);
		System.out.print(">>>");
		int selectBno = inputInt.nextInt();
		boardDAO.deleteOne(selectBno);
	}

	private void modify(String title, Scanner inputStr) throws SQLException {
		boardDAO.modify(title, inputStr);
		System.out.println("--------------------------------");

	}

	private void readOne(Scanner inputStr) throws SQLException {
		// 제목을 입력하면 내용이 보이도록 select 처리
		System.out.println("보고싶은 게시물의 제목을 검색하세요.");
		System.out.print(">>>");
		inputStr.nextLine();
		String title = inputStr.nextLine();

		boardDAO.readOne(title);
		System.out.println("--------------------------------");

	}

	private void insertBoard(BoardDAO boardDAO, Scanner inputStr) throws SQLException {
		// 키보드로 입력한 데이터를 dto를 사용하여 데이터베이스에 insert하자.
		BoardDTO boardDTO = new BoardDTO(); // 빈객체 생성
	
		System.out.print("제목 : ");
		inputStr.nextLine();
		boardDTO.setBtitle(inputStr.nextLine());

		System.out.print("내용 : ");
		boardDTO.setBcontent(inputStr.nextLine()); // 띄어쓰기가 있는 문장!!!!

		boardDTO.setBwriter(Session.getCurrentUser().getId());
		boardDAO.insertBoard(boardDTO); // 위에서 만든 객체를 DAO에게 전달
		System.out.println("==========insertBoard메서드 종료==========");

	} // insertBoard()메서드 종료

	private void selectAll(BoardDAO boardDAO) throws SQLException {
		// dao에게 전체보기 하는 서비스를 제공한다.
		System.out.println("=======================");
		System.out.println("====MBC게시판목록입니다====");
		boardDAO.selectAll();
		System.out.println("=======================");

	} // 전체 보기 메서드 종료

}
