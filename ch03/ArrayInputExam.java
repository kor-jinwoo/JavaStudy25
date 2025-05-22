package ch03;

import java.util.Scanner;

public class ArrayInputExam {

	public static void main(String[] args) {

		boolean run = true;

		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		System.out.println("성적처리시스템");
		System.out.println("학생수 입력 : ");
		System.out.print(">> ");
		int count = inputInt.nextInt();

		System.out.println(count + "명의 학생 성적을 입력하겠습니다.");

		String[] names = new String[count];
		int[] kors = new int[count];
		int[] mats = new int[count];
		int[] engs = new int[count];
		while (run) {
			System.out.println("1. 성적입력");
			System.out.println("2. 성적수정");
			System.out.println("3. 성적삭제");
			System.out.println("4. 성적보기");
			System.out.println("9. 프로그램종료");
			System.out.print(">> ");
			int num = inputInt.nextInt();

			switch (num) {
			case 1:
				System.out.println("★성적입력메뉴★");
				scoreAdd(names, kors, mats, engs);
				break;

			case 2:
				System.out.println("★성적수정메뉴★");
				scoreTrn(names, kors, mats, engs);
				break;
				
			case 3:
				System.out.println("★성적삭제메뉴★");
				scoreDel(names, kors, mats, engs);
				break;

			} // 스위치문 종료
		} // 와일문종료

	} // 메인메서드

	private static void scoreDel(String[] names, int[] kors, int[] mats, int[] engs) {
		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		
		System.out.println("삭제할 학생이름 입력");
		System.out.print(">> ");
		String name = inputStr.next();
		
	} // 성적 삭제 메서드

	static void scoreTrn(String[] names, int[] kors, int[] mats, int[] engs) {

		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);
		
		System.out.println("수정할 학생이름 입력");
		System.out.print(">> ");
		String name = inputStr.next();
		

		
		for (int i = 0; i < names.length; i++) {
			if (names[i].equals(name)) {
				System.out.println(names[i] + "님의 성적을 수정합니다.");
				
				System.out.println("수정할 국어 점수입력 : ");
				System.out.print(">> ");
				kors[i] = inputInt.nextInt();
				
				System.out.println("수정할 국어 점수입력 : ");
				System.out.print(">> ");
				mats[i] = inputInt.nextInt();
				
				System.out.println("수정할 국어 점수입력 : ");
				System.out.print(">> ");
				engs[i] = inputInt.nextInt();
				
				System.out.println("수정이 완료되었습니다.");
				System.out.println(" ");
				System.out.println("수정된 " + names[i] + " 학생의 성적표");
				System.out.println("국어 " + kors[i] + " | 수학 " + mats[i] + " | 영어 " + engs[i]);
				System.out.println(" ");
				
			} // if
		
		} // for
		
	} // 성적 수정 메서드

	static void scoreAdd(String[] names, int[] kors, int[] mats, int[] engs) {

		Scanner inputInt = new Scanner(System.in);
		Scanner inputStr = new Scanner(System.in);

		for (int i = 0; i < names.length; i++) {
			System.out.println("학생이름 입력");
			System.out.print(">> ");
			names[i] = inputStr.next();

			System.out.println("국어성적 입력");
			System.out.print(">> ");
			kors[i] = inputInt.nextInt();

			System.out.println("수학성적 입력");
			System.out.print(">> ");
			mats[i] = inputInt.nextInt();

			System.out.println("영어성적 입력");
			System.out.print(">> ");
			engs[i] = inputInt.nextInt();

		} // 성적입력 for문
		System.out.println("성적입력이 완료되었습니다.");

	} // 성적입력 메서드

} // 클래스
