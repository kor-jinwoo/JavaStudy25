package ch02;

import java.util.Scanner;

public class IfExam {

	public static void main(String[] args) {
		// if(조건문){실행문}
		// 조건문에 true 처리되면 중괄호 안쪽이 실행된다.
		// 조건문에 false 처리되면 중괄호 안쪽이 실행되지않는다.
		
		Scanner infut = new Scanner(System.in);
		
		System.out.println("귀하의 성함를 입력하세요.");
		System.out.print(">>>");
		String name = infut.next();		
		
		// 키보드로 입력받을 수 있는 객체를 생성하여 infut 변수에 연결
		System.out.println("귀하의 점수를 입력하세요.");
		System.out.print(">>>");
		int score = infut.nextInt(); // 키보드로 입력받는 정수를 score에 넣음
		
		if (score > 0 && score <= 100) { // 0보다 크거나 100이하이면 true
			if (score >= 90) { // score에 입력된 값이 90 이상인가?
				System.out.println(name + "님이 입력하신 점수가 90점 이상입니다.");
				System.out.println(" 점수 : " + score + " : 등급 (A)");

			} else if (score >= 80) {
				System.out.println(score + "님이 입력하신 점수가 80~89점 이상입니다.");
				System.out.println(" 점수 : " + score + " : 등급 (B)");

			} else if (score >= 70) {
				System.out.println(score + "님이 입력하신 점수가 70~79점 이상입니다.");
				System.out.println(" 점수 : " + score + " : 등급 (C)");

			} else if (score >= 60) {
				System.out.println(score + "님이 입력하신 점수가 60~69점 이상입니다.");
				System.out.println(" 점수 : " + score + " : 등급 (D)");

			} else {
				System.out.println(name + "님이 입력하신 점수가 60점 이하입니다.");
				System.out.println(" 점수 : " + score + " : 등급 (F)");
			}  // 정상값이 입력 되었을때 실행문
			
		}else {
			System.out.println(name + "님의 일력값을 확인해주세요.");
			System.out.println("현재 입력값은" + score + "입니다.");
		}
		
		
		System.out.println("                    ");
		System.out.println("프로그램이 종료되었습니다.");
		
		infut.close();

	} // 메인메서드 종료 > 변수(infut,name,score)가 사라짐.

} // 클래스 종료 > 메서드가 사라짐. > 프로그램 종료