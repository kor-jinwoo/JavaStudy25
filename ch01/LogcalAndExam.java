package ch01;

import java.util.Scanner;

public class LogcalAndExam {

		public static void main(String[] args) {
			// 논리곱 테스트용.
			// & 연산은 대부분 조건이 두개 이상일 경우 판단하는 용도로 사용. 
			// 예를 들어 아이디,비번이 둘다 맞아야 로그인이 성공하는 경우.
			// (가지고있던 아이디 == 입력한 아이디) & (가지고있던 비번 == 입력한 비번)
			//            false                           false          = false
			//            true                           false           = false
			//            true                           true            = true
			
			Scanner infut = new Scanner(System.in); // 키보드로 입력할 수 있는 객체 생성
			System.out.println("정수를 입력하면 대소문자나 숫자를 판단해드림");
			System.out.println("유니코드표를 참고하여 프로그램을 제작하였습니다");
			System.out.print("숫자입력 >>");
			
			int charCode = infut.nextInt(); // 키보드로 정수값이 입력되고 변수에 들어감.
			
			// if(비교판단문) {비교판단문이 true 값일때 수행되는 문}
			// else {비교판단문이 false 값일때 수행되는 문}
			if( (charCode >= 65) && (charCode <= 90)){
				// 입력된 숫자 값이 65 이상이고 90 이하면 대문자.
				System.out.println("현재 입력된 숫자는 대문자 " + (char)charCode + " 입니다.");
				
		    } else if ((charCode >= 97) && (charCode <= 122 )) {
			// 위에서 실행된 if 값이 false 일 경우 또 비교를 하게 됨.
			// 입력된 숫자 값이 97 이상이고 122 이하이면 소문자.
			// &보다 && 를 사용하면 빠른 처리를 함. (코드튜닝)
			System.out.println("현재 입력된 숫자는 소문자 " + (char)charCode + "입니다");
			
			} else if (!(charCode < 48) && !(charCode > 57)){
			// NAND개념이다. 드모르간의법칙을 파악하면 NOR
			// 48보다 작지않고 57보다 크지 않은 비교문.
			
			System.out.println("현재 입력된 숫자는 유니코드의 문자형숫자 입니다. : " + (char)charCode);
			
		}else {
			System.out.println("대문자,소문자,숫자의 유니코드 표 없는 숫자입니다");
			System.out.println("프로그램을 다시 실행해주세요.");
			
			infut.close();
			
			} // 다중if문 종료
			
		} // 메인메서드 종료

	} // 클래스종료