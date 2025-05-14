package ch02;

import java.util.Scanner;

public class UpDownExam {

	public static void main(String[] args) {
		// 업다운 게임 만들기.
		
		int infut = 0 , answer = 0;
		answer = (int)(Math.random()*50)+1; // 1~50까지의 랜덤 숫자
		Scanner scanner = new Scanner(System.in);
		
		do {
			System.out.println("1과 50의 사이의 정수를 입력하세요");
			System.out.print("입력 : ");
			infut = scanner.nextInt();
			if (infut > answer) {
				System.out.println("↓↓↓↓↓-DOWN-↓↓↓↓↓");
			}else if (infut < answer) {
				System.out.println("↑↑↑↑↑-UP-↑↑↑↑↑");
			}
			
		}while (infut != answer);
		System.out.println(" ");
		System.out.println("정답입니다.");
		

	}

}
