package ch01;

import java.util.Scanner;

public class LogcalExam {

		public static void main(String[] args) {
			// 논리합 테스트용
			// | 연산은 대부분 조건이 2개 이상일 경우 판단하는 용도로 사용.
			// 예를들어 아이디나 비번이 둘중 하나라도 맞아야 아이디찾기나 비번찾기로 가는경우.
			// (가지고있던아이디 == 입력한아이디) | (가지고있던비번 == 입력한비번)
			//           false                       false           = false
			//           false                       true            = false
	        //           true                        false           = false
			
			// 키보드로 입력받은 숫자가 2의 배수이거나 3의 배수인것을 처리해본다.
			Scanner infut = new Scanner(System.in); // 키보드로 입력받는 객체
			System.out.println("2의 배수나 3의 배수인것을 확인");
			System.out.print(">>>");
			int value = infut.nextInt(); // 정수를 입력받아 변수를 넣음.
			if ( (value % 2 == 0) || (value % 3 == 0) ) {
				// 입력값을 2로 나눈 나머지가 0이면 true
				// 입력값을 3으로 나눈 나머지가 0이면 true
				System.out.println("2의 배수 또는 3의 배수입니다. : " + value);
			}else {
				System.out.println("2의 배수 또는 3의 배수가 아닙니다. : " + value);
				infut.close();
				
			}
			
			
			
		}

	}
