package ch02;

import java.util.Scanner;

public class WhileExam {

	public static void main(String[] args) {
		// while문은 조건식이 true일때만 반복함.
		// while문을 종료하고싶으면 false처리하면 종료됨.
		// 무한반복용 코드를 작성할때 사용함.

		Scanner infutint = new Scanner(System.in); // 정수용 스캐너
		Scanner infutchar = new Scanner(System.in); // 문자용 스캐너

		boolean run = true; // 무한반복용 변수
		while (run) {
			System.out.println("-----MBC성적처리-----");
			System.out.println("1. 교직원관리");
			System.out.println("2. 학생관리");
			System.out.println("3. 성적관리");
			System.out.println("9. 프로그램 종료");
			System.out.print("(1~9입력)>>> ");
			int selectint = infutint.nextInt(); // 숫자입력란 생성

			switch (selectint) { // 키보드로 입력받은 숫자를 판단하여 분기를 결정.

			case 1: // Create:생성 Read:읽기 Update:수정 Delete:삭제 기법에 맞출것.
				boolean subrun = true;
				
				while (subrun) {
					System.out.println("교직원관리 메뉴로 진입하였습니다.");
					System.out.println("a. 교직원등록");
					System.out.println("b. 교직원보기");
					System.out.println("c. 교직원수정");
					System.out.println("d. 교직원삭제");
					System.out.println("z. 교직원관리 메뉴 종료");
					System.out.print("(a~z입력)>>> ");
					char subselect = infutchar.next().charAt(0);
					// 문자열로 입력된 문자중 0번쨰 문자만 subselect 에 넣음.
					// 위에서 입력받은 알파벳을 처리.
					switch (subselect) {
					
					case 'a' :
					case 'A' :
						System.out.println("교직원등록 메뉴로 진입하였습니다.");
						//교직원 등록 코드
						break;
						
					case 'b' :
					case 'B' :
						System.out.println("교직원보기 메뉴로 진입하였습니다.");
						//교직원 보기 코드
						break;
						
					case 'c' :
					case 'C' :
						System.out.println("교직원수정 메뉴로 진입하였습니다.");
						//교직원 수정 코드
						break;
						
					case 'd' :
					case 'D' :
						System.out.println("교직원삭제 메뉴로 진입하였습니다.");
						//교직원 삭제 코드
						break;
						
					case 'z' :
					case 'Z' :
						System.out.println("교직원 메뉴 종료.");
						subrun = false;
						//교직원 종료 코드
						break;
						
					
					} // 교직원 관리 스위치문 종료
				}
				// 교직원 관리용 코드
				break;

			case 2:
				System.out.println("학생관리 메뉴로 진입하였습니다.");
				// 학생 관리용 코드
				break;

			case 3:
				System.out.println("성적관리 메뉴로 진입하였습니다.");
				// 성적 관리용 코드
				break;

			case 9:
				System.out.println("프로그램을 종료하였습니다.");
				// 프로그램 종료 코드
				run = false;
				break;

			default:
				System.out.println("다시 입력해주세요.");
				break;
				
			} // switch문 종료.

		} // while문 종료.

		infutint.close();
		infutchar.close();
		
	} // 메서드 종료.

} // 클래스 종료.
