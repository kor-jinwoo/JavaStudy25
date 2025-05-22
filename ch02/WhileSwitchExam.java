package ch02;

import java.util.Scanner;

public class WhileSwitchExam {

	public static void main(String[] args) {
		
		
		int coin = 1000000;
		boolean sum = true;
		
		Scanner input = new Scanner(System.in);
		
		while (sum) {
			System.out.println("------------------------------------");
			System.out.println("비트코인게임");
			System.out.println("코인이 0원이 되면 청산됩니다.");
			System.out.println("코인이 10,000,000원이 되면 부자가 되는것입니다.");
			System.out.println("------------------------------------");
			System.out.println("1. 비트코인");
			System.out.println("2. 도지코인");
			System.out.println("3. 이더리움");	
			System.out.println("현재코인 : " + coin);
			System.out.print(" >>> ");
			int num = input.nextInt();
			switch (num) {
			
			case 1 :
				System.out.println("비트코인 투자를 시작하세요.");
				System.out.println("1. 300,000원 투자");
				System.out.println("2. 500,000원 투자");
				System.out.println("3. 1,000,000원 투자");
				System.out.print(" >>> ");
				int num1 = input.nextInt();
				switch (num1) {
				
				case 1 :
					if (coin <= 300000) {
						System.out.println("코인이 부족합니다.");
						System.out.println("다른게임으로 이동하세요.");
					}else {
						int co = (int)(Math.random()*8) +1;
					
						if (co == 1) {
							System.out.println("-300,000원 손실");
							coin = coin - 300000;
						}else if (co == 2) {
							coin = coin - 200000;
							System.out.println("-200,000원 손실");
						}else if (co == 3) {
							coin = coin - 100000;
							System.out.println("-100,000원 손실");
						}else if (co == 4) {
							coin = coin - 50000;
							System.out.println("50,000원 손실");
						}else if (co == 5) {
							coin = coin + 200000;
							System.out.println("+200,000원 이익");
						}else if (co == 6) {
							coin = coin + 400000;
							System.out.println("+400,000원 이익");
						}else if (co == 7) {
							coin = coin + 600000;
							System.out.println("+600,000원 이익");
						}else {
							coin = coin + 1000000;
							System.out.println("+1,000,000원 이익");
						}
					}
					break;
					
				} //case1 스위치문 종료
			} // 스위치문 종료
			if ((int) coin <= 0) { // 청산시스템
				System.out.println("모든돈을 청산당했습니다ㅋ");
				System.out.println("프로그램이 종료됩니다.");
				sum = false;
			}
			if ((int) coin >= 10000000) {
				System.out.println("부자가 되었습니다.");
				System.out.println("축하합니다.");
			}

		} // 와일문 종료
		
				
	
		

	}

}
