package ch02;

import java.util.Scanner;

public class UpDwonExam2 {

	public static void main(String[] args) {
		// 업앤다운 게임 만들기
		// 컴퓨터가 랜덤 숫자를 생성 (1~50)
		// 사용자가 숫자를 입력한다.
		// 컴퓨터가 랜덤숫자를 판단하여 업/다운 을 알려준다.
		// 사용자의 숫자와 컴퓨터의 랜덤숫자가 일치하면 프로그램 종료와 함께 종료.
		// 3번안에 성공 시 상품 증정용 코드 추가.
		
		int answer = (int)(Math.random()*50)+1; // 랜덤숫자 생성 (1~50)
		Scanner infut = new Scanner(System.in); // 키보드로 입력받는 객체 생성
		
		int question = 0; // 사용자가 입력하는 숫자 보관용
		int hits = 0; // 카운트용
		
		System.out.println("업다운 게임에 오신걸 환영합니다.");
		System.out.println("★3번안에 맞추면 상품을 드립니다★");
		
		do {
			System.out.println("1~50사이의 숫자를 입력하세요.");
			System.out.print("입력 : ");
			
			question = infut.nextInt(); // 사용자 입력란 생성
			hits++; // 키보드로 입력한 회수 카운트용
			if (question > answer) {
				System.out.println("↓↓↓↓↓ DWON ↓↓↓↓↓");
			}else if (question < answer) {
				System.out.println("↑↑↑↑↑ UP ↑↑↑↑↑");
			}
		}while (question != answer); // do while문 종료
			// 랜덤숫자와 사용자가 입력한 숫자가 같지 않으면 do문으로 올라감.
			// 랜덤숫자와 사용자가 입력한 숫자가 같으면 아래로 내려옴.
			System.out.println("정답입니다." + answer);
			System.out.println("정답까지 사용한 회수는 : " + hits + "번 입니다.");
			
			if (hits < 3) {
				System.out.println("이벤트성공! 구라입니당ㅎ");
			}else {
				System.out.println("이벤트실패! 다음기회는 없습니다ㅋ");
			} // do while 문 종료
			
			infut.close();
			
		} // 메서드 종료
		
	} // 클래스 종료

 
