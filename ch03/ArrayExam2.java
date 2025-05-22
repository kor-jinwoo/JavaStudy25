package ch03;

import java.util.Scanner;

public class ArrayExam2 {

	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		Scanner inputInt = new Scanner(System.in);

		boolean run = true;
		String id = "1234"; // 관리자 비번
		String[] menu = { "브론즈박스", "실버박스", "골드박스", "다이아박스","추억의 짱껨뽀", "로또번호뽑기" }; // 메뉴
		int[] set = { 10, 10, 10, 10, 9999, 9999 };// 메뉴수량
		int[] price = { 3000, 5000, 10000, 20000, 2000, 500 }; // 상품가격
		int revenue = 0; // 통계용
		int coin = 0; // 코인2

		while (run) {
		System.out.println(" ");
		System.out.println("===랜덤박스자판기===");
		System.out.println("1.코인넣기");
		System.out.println("2.상품구매");
		System.out.println("3.관리자호출");
		System.out.println("9.종료");
		System.out.println("현재코인 : " + coin);
		System.out.print(">>> ");
		int won = inputInt.nextInt();

		switch (won) {
		case 1:
		System.out.println("현재 코인은 " + coin + "입니다.");
		System.out.println("충전할 금액을 입력하세요");
		System.out.println("1. 3,000원");
		System.out.println("2. 5,000원");
		System.out.println("3. 10,000원");
		System.out.println("4. 20,000원");
		System.out.println("9. 돌아가기");
		System.out.println(">>> ");
		int num = inputInt.nextInt();

		switch (num) { // 코인충전 스위치문
		case 1:
		coin = coin + 3000;
		System.out.println("+3,000원이 충전되었습니다.");
		break;

		case 2:
		coin = coin + 5000;
		System.out.println("+5,000원이 충전되었습니다.");
		break;

		case 3:
		coin = coin + 10000;
		System.out.println("+10,000원이 충전되었습니다.");
		break;

		case 4:
		coin = coin + 20000;
		System.out.println("+20,000원이 충전되었습니다.");
		break;

		case 9:
		System.out.println("이전으로 돌아갑니다.");
		break;

		default:
		System.out.println("오류: 잘못된입력.");
		System.out.println("프로그램종료.");
		run = false;

		}// 코인충전 스위치문 종료
		break;
		case 2:
		System.out.println("구매할 상품을 선택하세요.");
		System.out.println("1. " + menu[0] + " " + price[0] + " 원");
		System.out.println("2. " + menu[1] + " " + price[1] + " 원");
		System.out.println("3. " + menu[2] + " " + price[2] + " 원");
		System.out.println("4. " + menu[3] + " " + price[3] + " 원");
		System.out.println("5. " + menu[4] + " " + price[4] + " 원");
		System.out.println("6. " + menu[5] + " " + price[5] + " 원");
		System.out.println("9. 돌아가기");
		System.out.print(">>> ");
		int add3 = inputInt.nextInt();
		switch (add3) {
		case 1:
		if (coin >= price[0] && set[0] > 0) { // 코인이 상품값보다 많고 재고가 남아있을경우 IF
		set[0] = set[0] - 1; // 재고차감
		revenue = revenue + price[0]; // 수익통계용
		coin = coin - price[0]; // 코인차감
		System.out.println(menu[0] + " 를 구매하였습니다!");
		System.out.println("-" + price[0] + " 원");
		System.out.println("남은잔액 : " + coin);
		System.out.println(" ");
		int random = (int) (Math.random() * 6) + 1; // 랜덤
		if (random == 1) {
		System.out.println("꽝이네융ㅋ");
		} else if (random == 2) {
		System.out.println("쓰잘데기없는 [키링] 획득!");
		} else if (random == 3) {
		System.out.println("[3,000원] 코인 획득! 다시한번 도전하셔유");
		coin = coin + 3000;
		} else if (random == 4) {
		System.out.println("유감스럽게도 박스가 나오지 않았습니다 ㅋㅋ 관리자를 호출하세요!");
		} else if (random == 5) {
		coin = coin + 5000;
		System.out.println("[5,000] 코인 획득!!");
		} else {
		System.out.println("아쉽게도 꽝입니다ㅋ");
		}
		} else {
		System.out.println("※코인부족 or 재고부족※");
		System.out.println("현재잔액 : " + coin);
		System.out.println(menu[0] + " 재고 : " + set[0]);
		System.out.println("다음에 오십쇼");
		}
		break;

		case 2:
		if (coin >= price[1] && set[1] > 0) {
		set[1] = set[1] - 1;
		revenue = revenue + price[1];
		coin = coin - price[1];
		System.out.println(menu[1] + " 를 구매하였습니다!");
		System.out.println("-" + price[1] + " 원");
		System.out.println("남은잔액 : " + coin);
		System.out.println(" ");
		int random = (int) (Math.random() * 6) + 1;
		if (random == 1) {
		System.out.println("꽝이네융ㅋ");
		} else if (random == 2) {
		System.out.println("조금 쓸만한 [텀블러] 획득!");
		} else if (random == 3) {
		System.out.println("[5,000원] 코인 획득! 다시한번 도전하셔유");
		coin = coin + 5000;
		} else if (random == 4) {
		System.out.println("유감스럽게도 박스가 나오지 않았습니다 ㅋㅋ 관리자를 호출하세요!");
		} else if (random == 5) {
		coin = coin + 10000;
		System.out.println("[10,000] 코인 획득!!");
		} else {
		System.out.println("[제주감귤5kg교환권] 획득!!");
		}
		} else {
		System.out.println("※코인부족 or 재고부족※");
		System.out.println("현재잔액 : " + coin);
		System.out.println(menu[1] + "재고 : " + set[1]);
		System.out.println("다음에 오십쇼");
		}
		break;

		case 3:
		if (coin >= price[2] && set[2] > 0) {
						set[2] = set[2] - 1;
		revenue = revenue + price[2];
		coin = coin - price[2];
		System.out.println(menu[2] + " 를 구매하였습니다!");
		System.out.println("-" + price[2] + " 원");
		System.out.println("남은잔액 : " + coin);
		System.out.println(" ");
		int random = (int) (Math.random() * 6) + 1;
		if (random == 1) {
		System.out.println("꽝이네융ㅋ");
		} else if (random == 2) {
		System.out.println("쓸만한 [백화점 50,000원 상품권] 획득!");
		} else if (random == 3) {
		coin = coin + 10000;
		System.out.println("[10,000원] 코인 획득! 다시한번 도전하셔유");
		} else if (random == 4) {
		System.out.println("유감스럽게도 박스가 나오지 않았습니다 ㅋㅋ 관리자를 호출하세요!");
		} else if (random == 5) {
		coin = coin + 20000;
		System.out.println("[20,000] 코인 획득!!");
		} else {
		System.out.println("대~박! [김기원 선생님의 존잘 셀카] 획득!");
		}
		} else {
		System.out.println("※코인부족 or 재고부족※");
		System.out.println("현재잔액 : " + coin);
		System.out.println(menu[2] + "재고 : " + set[2]);
		System.out.println("다음에 오십쇼");
		}
		break;

		case 4:
		if (coin >= price[3] && set[3] > 0) {
		set[3] = set[3] - 1;
		revenue = revenue + price[3];
		coin = coin - price[3];
		System.out.println(menu[3] + " 를 구매하였습니다!");
		System.out.println("-" + price[3] + " 원");
		System.out.println("남은잔액 : " + coin);
		System.out.println(" ");
		int random = (int) (Math.random() * 6) + 1;
		if (random == 1) {
		System.out.println("유감..꽝이네용..ㅋㅋ");
		} else if (random == 2) {
		System.out.println("대박! [백화점 100,000원 상품권] 획득!");
		} else if (random == 3) {
		System.out.println("대박! [사장님의 전화번호] 획득!");
		} else if (random == 4) {
		System.out.println("유감스럽게도 박스가 나오지 않았습니다 ㅋㅋ 관리자를 호출하세요!");
		} else if (random == 5) {
		coin = coin + 20000;
		System.out.println("[20,000] 코인 획득!! 재도전 ㄱㄱ");
		} else {
		System.out.println("축하합니다! 관리자코드를 얻었습니다.");
		System.out.println("첫페이지 : 99 | 비번 : 1234");
		}
		} else {
		System.out.println("※코인부족 or 재고부족※");
		System.out.println("현재잔액 : " + coin);
		System.out.println(menu[3] + "재고 : " + set[3]);
		System.out.println("다음에 오십쇼");
		}
		break;
		
		case 5:
		if (coin >= price[4] && set[4] > 0) {
		set[4] = set[4] - 1;
		revenue = revenue + price[4];
		coin = coin - price[4];
		System.out.println(menu[4] + " 를 구매하였습니다!");
		System.out.println("-" + price[4] + " 원");
		System.out.println("남은잔액 : " + coin);
		System.out.println(" ");
		System.out.println("무엇을 내시겠습니까?");
		System.out.println("1.묵 (주먹)");
		System.out.println("2.찌 (가위)");
		System.out.println("3.빠 (보자기)");
		System.out.print(">>");
		int num4 = inputInt.nextInt();
		
		int random = (int) (Math.random() * 3) + 1;
		if ((random == 1) && num4 == 1) {
		System.out.println("묵 (주먹)");
		System.out.println(" ");
		System.out.println("비겼습니다 ! 재도전 ㄱㄱ (+2000)");
		coin = coin + 2000;
		
		} else if ((random == 2) && (num4 == 2)) {
		System.out.println("찌 (가위)");
		System.out.println(" ");
		System.out.println("비겼습니다 ! 재도전 ㄱㄱ (+2000)");
		coin = coin + 2000;
		
		}else if ((random == 3) && (num4 == 3)) {
		System.out.println("빠 (보자기)");
		System.out.println(" ");
		System.out.println("비겼습니다 ! 재도전 ㄱㄱ (+2000)");
		coin = coin + 2000;
		
		}else if ((random == 1) && (num4 == 2)) {
		System.out.println("묵 (주먹)");
		System.out.println(" ");
		System.out.println("졌습니다 ㅋㅋ");
		
		}else if ((random == 2) && (num4 == 1)) {
		System.out.println("찌 (가위)");
		System.out.println(" ");
		System.out.println("이겼습니다 !");
		int random2 = (int) (Math.random() * 5) + 1;
		if (random2 == 1) {
		coin = coin + 500;
		System.out.println("500원 당첨!");
		}else if (random2 == 2) {
		coin = coin + 1000;
		System.out.println("1000원 당첨!");
		}else if (random2 == 3) {
		coin = coin + 1500;
		System.out.println("1500원 당첨!");
		}else if (random2 == 4) {
		coin = coin + 2000;
		System.out.println("2000원 당첨!");
		}else if (random2 == 5) {
		coin = coin + 5000;
		System.out.println("대박! 5000원 당첨!");
		}
			
		}else if ((random == 1) && (num4 == 3)) {
		System.out.println("묵 (주먹)");
		System.out.println(" ");
		System.out.println("이겼습니다 !");
		int random2 = (int) (Math.random() * 5) + 1;
		if (random2 == 1) {
		coin = coin + 500;
		System.out.println("500원 당첨!");
		}else if (random2 == 2) {
		coin = coin + 1000;
		System.out.println("1000원 당첨!");
		}else if (random2 == 3) {
		coin = coin + 1500;
		System.out.println("1500원 당첨!");
		}else if (random2 == 4) {
		coin = coin + 2000;
		System.out.println("2000원 당첨!");
		}else {
		coin = coin + 5000;
		System.out.println("대박! 5000원 당첨!");
		}
			
		}else if ((random == 2) && (num4 == 3)) {
		System.out.println("찌 (가위)");
		System.out.println(" ");
		System.out.println("졌습니다 ㅋㅋ");
		}else if ((random == 3) && (num4 == 2)) {
		System.out.println("빠 (보자기)");
		System.out.println(" ");
		System.out.println("이겼습니다 !");
		int random2 = (int) (Math.random() * 5) + 1;
		if (random2 == 1) {
		coin = coin + 500;
		System.out.println("500원 당첨!");
		}else if (random2 == 2) {
		coin = coin + 1000;
		System.out.println("1000원 당첨!");
		}else if (random2 == 3) {
		coin = coin + 1500;
		System.out.println("1500원 당첨!");
		}else if (random2 == 4) {
		coin = coin + 2000;
		System.out.println("2000원 당첨!");
		}else {
		coin = coin + 5000;
		System.out.println("대박! 5000원 당첨!");
		}
		}else if ((random == 3) && (num4 == 1)) {
		System.out.println("빠 (보자기)");
		System.out.println(" ");
		System.out.println("졌습니다 ㅋㅋ");
		
		
		}
		
		}else {
		System.out.println("※코인부족 or 재고부족※");
		System.out.println("현재잔액 : " + coin);
		System.out.println(menu[4] + "재고 : " + set[4]);
		System.out.println("다음에 오십쇼");	
		}
		break;
		case 6:	
		if (coin >= price[5] && set[5] > 0) {
		set[5] = set[5] - 1;
		revenue = revenue + price[5];
		coin = coin - price[5];
		System.out.println(menu[5] + " 를 구매하였습니다!");
		System.out.println("-" + price[5] + " 원");
		System.out.println("남은잔액 : " + coin);
		System.out.println(" ");
		int i = 0;
		while (true) {
			int num4 = (int) (Math.random()*45) + 1;
			System.out.println("오늘의 행운번호 : " + num4);
			i++; 		
			if (i == 6) { 
				System.out.println("");
				System.out.println("행운을빕니다.");
				break;
			}
		}
		}
				break;
		} // 상품구매 스위치문
		
		break;

		case 3:
		System.out.println("010-1234-5678 로 전화주세요");
		System.out.println(" ");
		break;

		case 9:
		System.out.println("프로그램 종료");
		run = false;
		break;

		case 99: // 관리자용코드
		System.out.println("관리자코드입력");
		System.out.print(">>> ");
		String idd = input.next();
		if (idd.equals(id)) {
		System.out.println("검증성공.");
		System.out.println("관리자 메뉴로 진입합니다.");
		System.out.println("1.메뉴수정");
		System.out.println("2.메뉴삭제");
		System.out.println("3.통계");
		System.out.println("9.처음으로");
		System.out.print(">>> ");
		int add = inputInt.nextInt();

		switch (add) {
		case 1:
		System.out.println("수정할 상품을 선택하세요.");
		System.out.println("1. " + menu[0] + " " + price[0] + " 원" + set[0] + " 개남음");
		System.out.println("2. " + menu[1] + " " + price[1] + " 원" + set[1] + " 개남음");
		System.out.println("3. " + menu[2] + " " + price[2] + " 원" + set[2] + " 개남음");
		System.out.println("4. " + menu[3] + " " + price[3] + " 원" + set[3] + " 개남음");
		System.out.println("9. 돌아가기");
		System.out.print(">>> ");
		int add2 = inputInt.nextInt();

		switch (add2) {
		case 1: // 상품수정 케이스
		System.out.println("변경할 상품명 입력.");
		System.out.print(">>> ");
		menu[0] = input.next();

		System.out.println("변경할 상품가격 입력.");
		System.out.print(">>> ");
		price[0] = inputInt.nextInt();

		System.out.println("변경할 상품수량 입력.");
		System.out.print(">>> ");
		set[0] = inputInt.nextInt();

		System.out.println(" ");
		System.out.println("상품수정 완료.");
		System.out.println("상품명: " + menu[0] + "상품가격: " + price[0] + "수량 : " + set[0]);
		System.out.println(" ");
		break;

		case 2:
		System.out.println("변경할 상품명 입력.");
		System.out.print(">>> ");
		menu[1] = input.next();

		System.out.println("변경할 상품가격 입력.");
		System.out.print(">>> ");
		price[1] = inputInt.nextInt();

		System.out.println("변경할 상품수량 입력.");
		System.out.print(">>> ");
		set[1] = inputInt.nextInt();

		System.out.println(" ");
		System.out.println("상품수정 완료.");
		System.out.println("상품명: " + menu[1] + "상품가격: " + price[1] + "수량 : " + set[1]);
		System.out.println(" ");
		break;

		case 3:
		System.out.println("변경할 상품명 입력.");
		System.out.print(">>> ");
		menu[2] = input.next();

		System.out.println("변경할 상품가격 입력.");
		System.out.print(">>> ");
		price[2] = inputInt.nextInt();

		System.out.println("변경할 상품수량 입력.");
		System.out.print(">>> ");
		set[2] = inputInt.nextInt();

		System.out.println(" ");
		System.out.println("상품수정 완료.");
		System.out.println("상품명: " + menu[2] + "상품가격: " + price[2] + "수량 : " + set[2]);
		System.out.println(" ");
		break;

		case 4:
		System.out.println("변경할 상품명 입력.");
		System.out.print(">>> ");
		menu[3] = input.next();

		System.out.println("변경할 상품가격 입력.");
		System.out.print(">>> ");
		price[3] = inputInt.nextInt();

		System.out.println("변경할 상품수량 입력.");
		System.out.print(">>> ");
		set[3] = inputInt.nextInt();

		System.out.println(" ");
		System.out.println("상품수정 완료.");
		System.out.println("상품명: " + menu[3] + "상품가격: " + price[3] + "수량 : " + set[3]);
		System.out.println(" ");
		break;

		}// 상품수정 스위치문
		break;

		case 2: // 상품삭제 케이스
		System.out.println(" ");
		System.out.println("삭제할 상품을 선택하세요.");
		System.out.println("1. " + menu[0]);
		System.out.println("2. " + menu[1]);
		System.out.println("3. " + menu[2]);
		System.out.println("4. " + menu[3]);
		System.out.println("9. 돌아가기");
		System.out.print(">>> ");
		int num2 = inputInt.nextInt();
		switch (num2) {
		case 1:
		System.out.println(" ");
		System.out.println("1번 메뉴를 삭제하였습니다");
		System.out.println(" ");
		menu[0] = null;
		price[0] = 0;
		set[0] = 0;
		break;

		case 2:
		System.out.println(" ");
		System.out.println("2번 메뉴를 삭제하였습니다");
		System.out.println(" ");
		menu[1] = null;
		price[1] = 0;
		set[1] = 0;
		break;

		case 3:
		System.out.println(" ");
		System.out.println("3번 메뉴를 삭제하였습니다");
		System.out.println(" ");
		menu[2] = null;
		price[2] = 0;
		set[2] = 0;
		break;

		case 4:
		System.out.println(" ");
		System.out.println("4번 메뉴를 삭제하였습니다");
		System.out.println(" ");
		menu[3] = null;
		price[3] = 0;
		set[3] = 0;
		break;

		}// 상품삭제 스위치문
		break;

		case 3: // 통계 케이스
		System.out.println(" ");
		System.out.println("오늘의매출 : " + revenue + "원.");
		System.out.println("현재 남은 재고는 [" + menu[0] + "] " + set[0] + " 개");
		System.out.println("현재 남은 재고는 [" + menu[1] + "] " + set[1] + " 개");
		System.out.println("현재 남은 재고는 [" + menu[2] + "] " + set[2] + " 개");
		System.out.println("현재 남은 재고는 [" + menu[3] + "] " + set[3] + " 개 입니다.");
		System.out.println(" ");
		break;

		} // 관리자메뉴 스위치문
		} else {
		System.out.println("돌아가라 인간.");
		run = false;
		}
		break;

			} // 스위치문
		} // 와일문
		input.close();
		inputInt.close();
	} // 메인메서드

} // 클래스
