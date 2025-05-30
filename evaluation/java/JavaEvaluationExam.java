package evaluation.java;

import java.util.Scanner;

import evaluation.java.dto.TeacherDTO;
import evaluation.java.service.Account;
import evaluation.java.dto.StudentDTO;

public class JavaEvaluationExam {

	public static Account[] accounts = new Account[15]; // 로그인 배열
	public static Account loginAccount = new Account(); // 로그인 세션
	public static TeacherDTO teacherDTO = new TeacherDTO();
	public static StudentDTO studentDTO = new StudentDTO();

	public static void main(String[] args) {
		
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		boolean run = true;
		while (run) {
			System.out.println("-----성적관리 프로그램-----");
			System.out.println("1. 학생메뉴");
			System.out.println("2. 교직원메뉴");
			System.out.println("3. 프로그램 종료");
			System.out.print("1~3입력 : ");
			String num = inputStr.next();

			switch (num) {
			case "1":
				System.out.println("-----학생메뉴로 진입하였습니다-----");
				Studentmenu(studentDTO, inputInt, inputStr);
				break;

			case "2":
				System.out.println("-----교직원메뉴로 진입하였습니다-----");

				break;

			case "3":
				System.out.println("프로그램을 종료함니다.");
				run = false;
				break;

			} // 스위치문 종료

		} // 와일문 종료

	}

	private static void Studentmenu(StudentDTO studentDTO2, Scanner inputInt, Scanner inputStr) {

		boolean run2 = true;

		while (run2) {
			System.out.println(" | 1. 성적계산 | 2. 학생로그인 | 3. 이전으로");
			System.out.print(">>> ");
			String num = inputStr.next();

			switch (num) {
			case "1":
				System.out.println("성적계산 메뉴로 이동합니다.");
				System.out.println("-------------------------------");

				StudentDTO st = new StudentDTO();

				System.out.print("학생 이름 입력 : ");
				st.sName = inputStr.next();

				System.out.print("학번 입력 : ");
				st.sNum = inputStr.next();

				System.out.print("국어점수 입력 : ");
				st.kor = inputInt.nextInt();

				System.out.print("영어점수 입력 : ");
				st.eng = inputInt.nextInt();

				System.out.print("수학점수 입력 : ");
				st.mat = inputInt.nextInt();

				System.out.println(st.sName + "님의 점수는");
				System.out.println("| 국어 " + st.kor + "점 |" + "| 영어 " + st.eng + "점 |" + "| 수학 " + st.mat + "점 |");
				System.out.println("| 합점 : " + (st.kor + st.eng + st.mat) + "점 |");
				System.out.println("| 평균 : " + (st.kor + st.eng + st.mat) / 3 + "점 |");

				break;

			case "2":
				System.out.println("로그인 메뉴로 이동합니다.");
				System.out.println("-------------------------------");
				SutdendLogin(inputStr, inputInt,studentDTO, accounts );
				// 로그인코드 & 성적저장코드 구현
				break;

			case "3":
				System.out.println("이전으로 이동합니다.");
				System.out.println("-------------------------------");
				run2 = false;
				break;

			} // 스위치문 종료

		} // 와일문 종료

	} // 메인메서드 종료

	private static void SutdendLogin(Scanner inputStr, Scanner inputInt, StudentDTO studentDTO2, Account[] accounts2) {
		
		
	} // 학생로그인 메서드

} // 클래스 종료
