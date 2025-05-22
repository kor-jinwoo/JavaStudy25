package ch02;

import java.util.Scanner;

public class CarRunExam {

	public static void main(String[] args) {
		// 바이크 주행 프로그램 만들기
		// C 시동을건다.
		// R 계기판 정보 출력.
		// U 주행.
		// D 시동을 끈다.

		Scanner infut = new Scanner(System.in);

		boolean run = true; // 시동을 건다.

		int speed = 0; // 바이크 속도.

		final int MAX = 300; // 최고속도 상수. (final을 붙히면 변경불가)

		final int MIN = 0; // 최저속도 상수. (final을 붙히면 변경불가)

		// max = 400; << 상수이기때문에 변경이 안되는 모습.

		System.out.println("가와사키 닌자H2R이 입고되었습니다.");
		System.out.println("시동을 켭니다. (4기통의 웅장한 배기음)");
		System.out.println(" ");
		System.out.println("현재속도 : " + speed + " Km/H");

		while (run) {

			System.out.println(" ");
			System.out.println("0. 시동끄기.");
			System.out.println("1. 풀스로틀.");
			System.out.println("2. 브레이크.");
			System.out.println("3. 멀티미디어.");
			System.out.println("4. 주유하기.");
			System.out.println(" ");
			System.out.print("(0~4번입력) >>> ");

			int select = infut.nextInt();
			switch (select) {

			case 0:
				System.out.println("시동을끈다.");
				run = false; // while문 종료.
				break;

			case 1:
				System.out.println("가속진행.");
				speed += 10;
				if (speed >= MAX) { // 현재속도가 최고속도보다 크거나 같으면.
					speed = MAX;
				}
				System.out.println("현재속도 : " + speed + " Km/H");// 300이상 출력 안됨.
				break;

			case 2:
				System.out.println("감속진행");
				speed -= 10;
				if (speed <= MIN) {
					speed = MIN;
				}
				System.out.println("현재속도 : " + speed + " Km/H");
				break;

			case 3:
				System.out.println("멀티미디어를 실행합니다.");
				break;

			case 4:
				System.out.println("주유를 진행합니다.");
				break;

			} // 스위치문 종료
		} // while문 종료

		System.out.println("바이크가 사라집니다.");
		infut.close();
	} // 메서드 종료.

} // 클래스 종료.
