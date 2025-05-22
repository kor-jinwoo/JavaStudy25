package ch04;

import java.util.Scanner;

public class Car {
	// 필드 (객체가 가지고 있어야 하는 값) -> 글로벌 변수 (GV)
	// 고유데이터
	public String company; // 제작회사 (현재,기아,쉐보레,아우디)
	public String model; // 아반테,그랜져,소나타
	public String color; // 블랙,레드,화이트
	public String oilType; // 경유,휘발유
	public int maxSpeed; // 최고속도
	public int minSpeed; // 최소속도
	public int maxRpm;
	public int minRpm;
	public int backSpeed;

	// 상태값 (변동가능)
	public int speed; // 계기판 스피드
	public int sp;
	public int rpm;
	public int oil;

	// 부품 -> 다른 클래스를 생성하여 연결한다
//		public Body body;
//		public Engine engine;
//		public Tire tire;

	// 부품의 필드 사용법
	// Car myCar = new Car(); -> 객체생성 (인스턴스)
	// myCar.maxSpeed = 300; 객체에있는 maxSpeed에 300 정수를 넣는다.
	// -------------------------------------------------------

	// 기본생성자:생략가능 (객체가 생성할때 사용되는 메서드 : 클래스명과 같은 이름)
	public Car() {
		speed = 0; // 속도
		rpm = 0; // 엔진회전수
		oil = 100; // 주유량
		maxSpeed = 340;
		minSpeed = 0;
		maxRpm = 9400;
		minRpm = 0;
	} // 객체가 생성되면서 변수에 값이 저장됨

	// 사용자지정 생성자 -> 개발자가 응용하는 기법
	// 사용자지정 생성자가 만들어지면 기본생성자는 자동으로 생성되지않음
	public Car(String company, String model, String color) {
		this.company = company;
		this.model = model;
		this.color = color;
	} // Car myCar = new Car("벤츠",e클래스,레드");

	// 메서드 (객체가 수행해야 하는 동작)
	// C(시동걸기) R(차량상태) U(가속,감속,주차) D(시동끄기)
	public void start() {
		if (rpm == 0) {
			System.out.println(this.model + "가(이) 주행을 시작합니다.");
			rpm += 50;
			System.out.println("현재속도 : " + this.speed);
			System.out.println("현재 rpm : " + this.rpm);
			System.out.println("현재 주유량 : " + this.oil);
		}else {
			System.out.println(this.model + "의 시동이 이미 켜져있습니다");
		}

	}

	public void drive() {
		Scanner input = new Scanner(System.in);
		boolean run = true;
		while (run) {
			System.out.println("=====계기판=====");
			System.out.println("SPEED : " + this.speed + "Km/h |" + " RPM : " + this.rpm + " | OIL : " + this.oil + "%");
			System.out.println("1.파킹");
			System.out.println("2.전진");
			System.out.println("3.브레이크");
			System.out.println("4.후진");
			System.out.println("5.크락션");
			System.out.print(">>> ");
			String num = input.next();
			switch (num) {
			case "1":

				if (this.speed == 0) {
					sp = 0;
					backSpeed = 0;
					speed = 0;
					rpm = 50;
					System.out.println(this.model + "가(이) 주행을 멈췄습니다.");
					System.out.println("=====계기판=====");
					System.out.println("SPEED : " + this.speed);
					System.out.println("RPM : " + this.rpm);
					System.out.println("OIL : " + this.oil);
					System.out.println(" ");
					run = false;
				} else {
					System.out.println("주행중에는 파킹을 할 수 없습니다.");
					System.out.println("=====계기판=====");
					System.out.println("SPEED : " + this.speed);
					System.out.println("RPM : " + this.rpm);
					System.out.println("OIL : " + this.oil);
				}
				break;

			case "2":
				if (rpm >= 50) {
					sp += 20;
					speed += 20;
					rpm += 550;
					oil -= 1;
					System.out.println(this.model + "가(이) 속도를 냅니다.");
					System.out.println("=====계기판=====");
					System.out.println("SPEED : " + this.speed);
					System.out.println("RPM : " + this.rpm);
					System.out.println("OIL : " + this.oil);
				} else {
					System.out.println("시동이 꺼져있습니다.");
					run = false;
				} if ((rpm >= 8800) || (speed >= 320)) {
					System.out.println("※경고※ 최고시속 or RPM 입니다.");
				} if (oil <= 0) {
					speed = 0;
					rpm = 0;
					System.out.println("연료가 없습니다.");
					System.out.println("시동이 꺼집니다.");
					run = false;
				} if (backSpeed > 0) {
					System.out.println("후진중에 전진은 불가능합니다 차량을 정지시킨 후 시도하세요.");
				}
				break;
			case "3":
				if (speed > 0) {
					sp -= 20;
					speed -= 20;
					rpm -= 550;
					System.out.println(this.model + "가(이) 속도를 줄입니다");
					System.out.println("=====계기판=====");
					System.out.println("SPEED : " + this.speed);
					System.out.println("RPM : " + this.rpm);
					System.out.println("OIL : " + this.oil);
				}else if (speed <= 0){
					System.out.println("차량이 멈춰있습니다" + speed + "Km/h");
				}
				break;
				
			case "4":
				if ((rpm >= 50) && (sp == 0)) {
					backSpeed += 20;
					sp += 20;
					speed += 20;
					rpm += 550;
					oil -= 1;
					System.out.println(this.model + "가(이) 후진합니다..");
					System.out.println("=====계기판=====");
					System.out.println("SPEED : " + this.speed);
					System.out.println("RPM : " + this.rpm);
					System.out.println("OIL : " + this.oil);
				} else {
					System.out.println("전진중에 후진은 불가능합니다 차량을 정지시킨 후 시도하세요.");
				} if ((rpm >= 3000) || (speed >= 100)) {
					System.out.println("※경고※ 최고시속 or RPM 입니다.");
				} if (oil <= 0) {
					speed = 0;
					rpm = 0;
					System.out.println("연료가 없습니다.");
					System.out.println("시동이 꺼집니다.");
					run = false;
				}
				break;
				
			case "5":
				System.out.println("뻬에엠~");
				break;
				
			} // switch 종료
		} // while 종료

	
	}
	public void stop() {
		if ((speed <= 0) && (rpm <= 50)) {
			System.out.println(this.model + "의 시동을 끕니다.");
			rpm = 0;
			speed = 0;
			System.out.println("현재속도 : " + this.speed);
			System.out.println("현재 rpm : " + this.rpm);
			System.out.println("현재 주유량 : " + this.oil);
		}else {
			System.out.println("이미 시동이 꺼져있습니다.");
		}

	}
	
	
}

