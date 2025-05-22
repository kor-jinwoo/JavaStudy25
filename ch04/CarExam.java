package ch04;

import java.util.Scanner;

public class CarExam {

	public static void main(String[] args) {
		// 자동차 주 실행 프로그램
				Scanner input = new Scanner(System.in);
				
				boolean run = true;
				System.out.println("---차량정보 입력---");
				Car myCar = new Car();// 기본생성자로 객체 생성
				// 생성시 속도와 알피엠과 오일량은 기본값으로 생성됨
				System.out.print("제조회사 : ");
				myCar.company = input.next();
				System.out.print("차량모델 : ");
				myCar.model = input.next();
				System.out.print("제조색상 : ");
				myCar.color = input.next();
				
				while (run) {
					System.out.println("1.차량 정보확인");
					System.out.println("2.차량 시동걸기");
					System.out.println("3.차량 주행시작");
					System.out.println("4.차량 주행종료");
					System.out.print(">>> ");
					String select = input.next();
					switch (select) {
					case "1":
						System.out.println("제조사 : " + myCar.company);
						System.out.println("모델명 : " + myCar.model);
						System.out.println("차량색상 : " + myCar.color);
						System.out.println("남은연료 : " + myCar.oil);
						break;
						
					case "2":
						System.out.println("차량에 시동을 겁니다.");
						myCar.start();
						System.out.println(" ");
						break;
						
					case "3":
						myCar.drive();
						System.out.println(" ");
						break;
						
					case "4":
						myCar.stop();
						System.out.println(" ");
						break;
					} // 스위치문 종료
				} // 와일문 종료

	}

}
