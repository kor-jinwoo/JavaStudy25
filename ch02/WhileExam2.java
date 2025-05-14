package ch02;

public class WhileExam2 {

	public static void main(String[] args) throws Exception {

		boolean run = true; // 실행 여부 판단용
		int speed = 100; // 현재 속도는 100km/h
		int key = 0; // 키보드로 입력되는 값.

		while (run) { // run에 초기값이 true이기 때문에 주행중이라는 뜻.
			if (key != 13 && key != 10) {
				System.out.println("1.엑셀 | 2. 브레이크 | 3. 중지");
				System.out.println("---------------------------");
				System.out.print("선택 : ");
			}
			key = System.in.read();

			if (key == 49) {
				speed += 5;
				System.out.println("현재속도 : " + speed);

			} else if (key == 50) {
				speed -= 5;
				System.out.println("현재속도 : " + speed);

			} else if (key == 51) {
				run = false;
				System.out.println("쿠르즈기능이 종료됩니다.");
				System.out.println("현재속도 : " + speed);
				System.out.println("안전운전하세요.");
			}

		}
		System.out.println("프로그램종료.");
	}

}
