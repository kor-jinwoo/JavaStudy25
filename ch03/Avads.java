package ch03;

import java.util.Scanner;

public class Avads {

	public static void main(String[] args) {
		      // 라면을 끓여주는 자판기
		      // 라면 선택, 토핑 선택 for문으로 변경하기
		      // (23.6.7 아직 변경 전)

		      boolean play = true;
		      boolean add = true;
		      
		      // 관리자 모드 사용 초기값;
		      boolean Manager = true; // while문 실행을 위해 true 값 선언
		      int numMenu = 0; // 라면 메뉴 가짓수
		      int numMenu2 = 0; // 토핑 메뉴 가짓수
		      String[] ramenMenu = null; // 라면 종류 
		      String[] toppingMenu = null; // 토핑 종류
		      int[] price = null; // 라면 가격
		      int[] price2 = null; // 토핑 가격
		      int[] stock = null; // 라면 재고
		      int[] stock2 = null; // 토핑 재고
		      
		      // 고객 모드 사용 초기값
		      boolean customer = false;
		      int selectNo = 0;
		      int toppingNo = 0;
		      int money = 0;
		      int num = 0;

		      Scanner scanner = new Scanner(System.in);
		      
		      
		      while (play) {
		         System.out.println(); // 개행
		         System.out.println("-------------------------------------------------------");
		         System.out.println("주문하실 라면을 선택해주세요!");
		         System.out.println("1. 국물이 있는 라면 종류 2. 볶음라면 종류");
		         System.out.print("숫자를 입력해주세요. >> ");
		         int type = scanner.nextInt();
		         System.out.println(); // 개행

		         System.out.println("영업 준비 중 입니다.");
		         System.out.println("-------------------------------------------------------");
		         System.out.println(); // 개행
		   
		         if( type == 1 ) { // 국물라면 선택
		            
		            while(customer) {
		            System.out.println("-------------------------------------------------------");
		            System.out.println("현재 주문이 가능한 라면 목록 입니다!");
		            System.out.println("1번 " + ramenMenu[0] + " 가격 : " + price[0] + "원 재고 " + stock[0] + "개 ");
		            System.out.println("2번 " + ramenMenu[1] + " 가격 : " + price[1] + "원 재고 " + stock[1] + "개 ");
		            System.out.println("3번 " + ramenMenu[2] + " 가격 : " + price[2] + "원 재고 " + stock[2] + "개 ");
		            System.out.println("4. 이전 메뉴로 돌아가기");
		            System.out.print("숫자를 입력해주세요. >> ");
		            selectNo = scanner.nextInt();
		            System.out.println(); // 개행
		            
		            
		            switch (selectNo) { //토핑 선택하는 switch문
		            case 1 : // ramenMenu[0]을 선택
		               System.out.println("-------------------------------------------------------");
		               System.out.println("토핑 추가는 어떠세요?");
		               System.out.println("1번 " + toppingMenu[0] + " 가격 : " + price2[0] + "원 재고 " + stock2[0] + "개 ");
		               System.out.println("2번 " + toppingMenu[1] + " 가격 : " + price2[1] + "원 재고 " + stock2[1] + "개 ");
		               System.out.println("3번 " + toppingMenu[2] + " 가격 : " + price2[2] + "원 재고 " + stock2[2] + "개 ");
		               System.out.println("4번 추가 안함");
		               System.out.println("5. 이전 메뉴로 돌아가기");
		               System.out.print("숫자를 입력해주세요. >> ");
		               toppingNo = scanner.nextInt();
		               System.out.println(); // 개행
		               
		               if (toppingNo == 1) { // toppingMenu[0]을 선택
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("주문을 확인해주세요!! ");
		                  System.out.println(ramenMenu[0] + "에 " + toppingMenu[0] + " 추가");
		                  System.out.println("결제하실 금액은 : " + (price[0]+price2[0]) + "원 입니다.");
		                  System.out.println("1. 결제하기 2. 돌아가기");
		                  System.out.print("숫자를 입력해주세요. >> ");
		                  num = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  
		                  if ( num == 1) { // 결제하기를 선택
		                        System.out.println("-------------------------------------------------------");
		                        System.out.println("결제를 도와드리겠습니다.");
		                        System.out.println("현재는 현금만 결제가 가능합니다. ");
		                        System.out.println("결제 취소는 5번을 입력해주세요.");
		                        
		                        while (add) {
		                        System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                        System.out.print("금액을 입금해주세요. >> ");
		                        int seleteMoney = scanner.nextInt();
		                        System.out.println();
		                                             
		                        switch (seleteMoney) {
		                        case 1 : 
		                           money += 1000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 2 :
		                           money += 5000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 3 :
		                           money += 10000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        } // 돈 입금 switch문
		                        
		                           if (money >= price[0]+price2[0]) {
		                              // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                              System.out.println("-------------------------------------------------------");
		                              System.out.println("주문 감사합니다! ");
		                              System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                              System.out.println("거스름돈 " + (money-(price[0]+price2[0])) + "을 받으세요.");
		                              System.out.println();
		                              customer = false;
		                              add = false;
		                              play = false;
		                              break;
		                              
		                           } else if (money < price[0]+price2[0]) {
		                              // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                              System.out.println("잔액이 부족합니다.");
		                              System.out.println("추가 입금이 필요합니다.");
		                              System.out.println();
		                              continue;
		                           } // 잔액 확인 후 결제하는 if문
		                           
		                        } // while-add 종료
		                     }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                        break;
		                     } // 돌아가기를 선택 if문 종료
		               } else if ( toppingNo == 2 ) { // toppingMenu[1]을 선택
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("주문을 확인해주세요!! ");
		                  System.out.println(ramenMenu[0] + "에 " + toppingMenu[1] + " 추가");
		                  System.out.println("결제하실 금액은 : " + (price[0]+price2[1]) + "원 입니다.");
		                  System.out.println("1. 결제하기 2. 돌아가기");
		                  System.out.print("숫자를 입력해주세요. >> ");
		                  num = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  
		                  if ( num == 1) { // 결제하기를 선택
		                        System.out.println("-------------------------------------------------------");
		                        System.out.println("결제를 도와드리겠습니다.");
		                        System.out.println("현재는 현금만 결제가 가능합니다. ");
		                        System.out.println("결제 취소는 5번을 입력해주세요.");
		                        
		                        while (add) {
		                        System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                        System.out.print("금액을 입금해주세요. >> ");
		                        int seleteMoney = scanner.nextInt();
		                        System.out.println();
		                                             
		                        switch (seleteMoney) {
		                        case 1 : 
		                           money += 1000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 2 :
		                           money += 5000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 3 :
		                           money += 10000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        } // 돈 입금 switch문
		                        
		                           if (money >= price[0]+price2[1]) {
		                              // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                              System.out.println("-------------------------------------------------------");
		                              System.out.println("주문 감사합니다! ");
		                              System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                              System.out.println("거스름돈 " + (money-(price[0]+price2[1])) + "을 받으세요.");
		                              System.out.println();
		                              customer = false;
		                              add = false;
		                              play = false;
		                              break;
		                              
		                           } else if (money < price[0]+price2[1]) {
		                              // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                              System.out.println("잔액이 부족합니다.");
		                              System.out.println("추가 입금이 필요합니다.");
		                              System.out.println();
		                              continue;
		                           } // 잔액 확인 후 결제하는 if문
		                           
		                        } // while-add 종료
		                     }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                        break;
		                     } // 돌아가기를 선택 if문 종료
		               } else if ( toppingNo == 3 ) { // toppingMenu[2]을 선택
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("주문을 확인해주세요!! ");
		                  System.out.println(ramenMenu[0] + "에 " + toppingMenu[2] + " 추가");
		                  System.out.println("결제하실 금액은 : " + (price[0]+price2[2]) + "원 입니다.");
		                  System.out.println("1. 결제하기 2. 돌아가기");
		                  System.out.print("숫자를 입력해주세요. >> ");
		                  num = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  
		                  if ( num == 1) { // 결제하기를 선택
		                        System.out.println("-------------------------------------------------------");
		                        System.out.println("결제를 도와드리겠습니다.");
		                        System.out.println("현재는 현금만 결제가 가능합니다. ");
		                        System.out.println("결제 취소는 5번을 입력해주세요.");
		                        
		                        while (add) {
		                        System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                        System.out.print("금액을 입금해주세요. >> ");
		                        int seleteMoney = scanner.nextInt();
		                        System.out.println();
		                                             
		                        switch (seleteMoney) {
		                        case 1 : 
		                           money += 1000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 2 :
		                           money += 5000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 3 :
		                           money += 10000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        } // 돈 입금 switch문
		                        
		                           if (money >= price[0]+price2[2]) {
		                              // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                              System.out.println("-------------------------------------------------------");
		                              System.out.println("주문 감사합니다! ");
		                              System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                              System.out.println("거스름돈 " + (money-(price[0]+price2[2])) + "을 받으세요.");
		                              System.out.println();
		                              customer = false;
		                              add = false;
		                              play = false;
		                              break;
		                              
		                           } else if (money < price[0]+price2[2]) {
		                              // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                              System.out.println("잔액이 부족합니다.");
		                              System.out.println("추가 입금이 필요합니다.");
		                              System.out.println();
		                              continue;
		                           } // 잔액 확인 후 결제하는 if문
		                           
		                        } // while-add 종료
		                     }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                        break;
		                     } // 돌아가기를 선택 if문 종료
		               } // toppingNum 선택 if문 종료
		               break;   
		               
		            case 2 : // ramenMenu[1]을 선택
		               
		               System.out.println("-------------------------------------------------------");
		               System.out.println("토핑 추가는 어떠세요?");
		               System.out.println("1번 " + toppingMenu[0] + " 가격 : " + price2[0] + "원 재고 " + stock2[0] + "개 ");
		               System.out.println("2번 " + toppingMenu[1] + " 가격 : " + price2[1] + "원 재고 " + stock2[1] + "개 ");
		               System.out.println("3번 " + toppingMenu[2] + " 가격 : " + price2[2] + "원 재고 " + stock2[2] + "개 ");
		               System.out.println("4번 추가 안함");
		               System.out.println("5. 이전 메뉴로 돌아가기");
		               System.out.print("숫자를 입력해주세요. >> ");
		               toppingNo = scanner.nextInt();
		               System.out.println(); // 개행
		               
		               if (toppingNo == 1) { // toppingMenu[0]을 선택
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("주문을 확인해주세요!! ");
		                  System.out.println(ramenMenu[1] + "에 " + toppingMenu[0] + " 추가");
		                  System.out.println("결제하실 금액은 : " + (price[1]+price2[0]) + "원 입니다.");
		                  System.out.println("1. 결제하기 2. 돌아가기");
		                  System.out.print("숫자를 입력해주세요. >> ");
		                  num = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  
		                  if ( num == 1) { // 결제하기를 선택
		                        System.out.println("-------------------------------------------------------");
		                        System.out.println("결제를 도와드리겠습니다.");
		                        System.out.println("현재는 현금만 결제가 가능합니다. ");
		                        System.out.println("결제 취소는 5번을 입력해주세요.");
		                        
		                        while (add) {
		                        System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                        System.out.print("금액을 입금해주세요. >> ");
		                        int seleteMoney = scanner.nextInt();
		                        System.out.println();
		                                             
		                        switch (seleteMoney) {
		                        case 1 : 
		                           money += 1000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 2 :
		                           money += 5000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 3 :
		                           money += 10000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        } // 돈 입금 switch문
		                        
		                           if (money >= price[1]+price2[0]) {
		                              // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                              System.out.println("-------------------------------------------------------");
		                              System.out.println("주문 감사합니다! ");
		                              System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                              System.out.println("거스름돈 " + (money-(price[1]+price2[0])) + "을 받으세요.");
		                              System.out.println();
		                              customer = false;
		                              add = false;
		                              play = false;
		                              
		                           } else if (money < price[1]+price2[0]) {
		                              // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                              System.out.println("잔액이 부족합니다.");
		                              System.out.println("추가 입금이 필요합니다.");
		                              System.out.println();
		                              continue;
		                           } // 잔액 확인 후 결제하는 if문
		                           
		                        } // while-add 종료
		                     }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                        break;   
		                     }
		               } else if ( toppingNo == 2 ) { // toppingMenu[1]을 선택
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("주문을 확인해주세요!! ");
		                  System.out.println(ramenMenu[1] + "에 " + toppingMenu[1] + " 추가");
		                  System.out.println("결제하실 금액은 : " + (price[1]+price2[1]) + "원 입니다.");
		                  System.out.println("1. 결제하기 2. 돌아가기");
		                  System.out.print("숫자를 입력해주세요. >> ");
		                  num = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  
		                  if ( num == 1) { // 결제하기를 선택
		                        System.out.println("-------------------------------------------------------");
		                        System.out.println("결제를 도와드리겠습니다.");
		                        System.out.println("현재는 현금만 결제가 가능합니다. ");
		                        System.out.println("결제 취소는 5번을 입력해주세요.");
		                        
		                        while (add) {
		                        System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                        System.out.print("금액을 입금해주세요. >> ");
		                        int seleteMoney = scanner.nextInt();
		                        System.out.println();
		                                             
		                        switch (seleteMoney) {
		                        case 1 : 
		                           money += 1000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 2 :
		                           money += 5000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 3 :
		                           money += 10000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        } // 돈 입금 switch문
		                        
		                           if (money >= price[1]+price2[1]) {
		                              // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                              System.out.println("-------------------------------------------------------");
		                              System.out.println("주문 감사합니다! ");
		                              System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                              System.out.println("거스름돈 " + (money-(price[1]+price2[1])) + "을 받으세요.");
		                              System.out.println();
		                              customer = false;
		                              add = false;
		                              play = false;
		                              break;
		                              
		                           } else if (money < price[1]+price2[1]) {
		                              // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                              System.out.println("잔액이 부족합니다.");
		                              System.out.println("추가 입금이 필요합니다.");
		                              System.out.println();
		                              continue;
		                           } // 잔액 확인 후 결제하는 if문
		                           
		                        } // while-add 종료
		                     }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                        break;
		                     } // 돌아가기를 선택 if문 종료
		               } else if ( toppingNo == 3 ) { // toppingMenu[2]을 선택
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("주문을 확인해주세요!! ");
		                  System.out.println(ramenMenu[1] + "에 " + toppingMenu[2] + " 추가");
		                  System.out.println("결제하실 금액은 : " + (price[1]+price2[2]) + "원 입니다.");
		                  System.out.println("1. 결제하기 2. 돌아가기");
		                  System.out.print("숫자를 입력해주세요. >> ");
		                  num = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  
		                  if ( num == 1) { // 결제하기를 선택
		                        System.out.println("-------------------------------------------------------");
		                        System.out.println("결제를 도와드리겠습니다.");
		                        System.out.println("현재는 현금만 결제가 가능합니다. ");
		                        System.out.println("결제 취소는 5번을 입력해주세요.");
		                        
		                        while (add) {
		                        System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                        System.out.print("금액을 입금해주세요. >> ");
		                        int seleteMoney = scanner.nextInt();
		                        System.out.println();
		                                             
		                        switch (seleteMoney) {
		                        case 1 : 
		                           money += 1000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 2 :
		                           money += 5000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 3 :
		                           money += 10000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        } // 돈 입금 switch문
		                        
		                           if (money >= price[1]+price2[2]) {
		                              // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                              System.out.println("-------------------------------------------------------");
		                              System.out.println("주문 감사합니다! ");
		                              System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                              System.out.println("거스름돈 " + (money-(price[1]+price2[2])) + "을 받으세요.");
		                              System.out.println();
		                              customer = false;
		                              add = false;
		                              play = false;
		                              break;
		                              
		                           } else if (money < price[1]+price2[2]) {
		                              // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                              System.out.println("잔액이 부족합니다.");
		                              System.out.println("추가 입금이 필요합니다.");
		                              System.out.println();
		                              continue;
		                           } // 잔액 확인 후 결제하는 if문
		                           
		                        } // while-add 종료
		                     }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                        break;
		                     } // 돌아가기를 선택 if문 종료
		               } // toppingNum 선택 if문 종료
		               
		               break;
		               
		            case 3 : // ramenMenu[2]을 선택
		               System.out.println("-------------------------------------------------------");
		               System.out.println("토핑 추가는 어떠세요?");
		               System.out.println("1번 " + toppingMenu[0] + " 가격 : " + price2[0] + "원 재고 " + stock2[0] + "개 ");
		               System.out.println("2번 " + toppingMenu[1] + " 가격 : " + price2[1] + "원 재고 " + stock2[1] + "개 ");
		               System.out.println("3번 " + toppingMenu[2] + " 가격 : " + price2[2] + "원 재고 " + stock2[2] + "개 ");
		               System.out.println("4번 추가 안함");
		               System.out.println("5. 이전 메뉴로 돌아가기");
		               System.out.print("숫자를 입력해주세요. >> ");
		               toppingNo = scanner.nextInt();
		               System.out.println(); // 개행
		               
		               if (toppingNo == 1) { // toppingMenu[0]을 선택
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("주문을 확인해주세요!! ");
		                  System.out.println(ramenMenu[2] + "에 " + toppingMenu[0] + " 추가");
		                  System.out.println("결제하실 금액은 : " + (price[2]+price2[0]) + "원 입니다.");
		                  System.out.println("1. 결제하기 2. 돌아가기");
		                  System.out.print("숫자를 입력해주세요. >> ");
		                  num = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  
		                  if ( num == 1) { // 결제하기를 선택
		                        System.out.println("-------------------------------------------------------");
		                        System.out.println("결제를 도와드리겠습니다.");
		                        System.out.println("현재는 현금만 결제가 가능합니다. ");
		                        System.out.println("결제 취소는 5번을 입력해주세요.");
		                        
		                        while (add) {
		                        System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                        System.out.print("금액을 입금해주세요. >> ");
		                        int seleteMoney = scanner.nextInt();
		                        System.out.println();
		                                             
		                        switch (seleteMoney) {
		                        case 1 : 
		                           money += 1000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 2 :
		                           money += 5000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 3 :
		                           money += 10000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        } // 돈 입금 switch문
		                        
		                           if (money >= price[2]+price2[0]) {
		                              // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                              System.out.println("-------------------------------------------------------");
		                              System.out.println("주문 감사합니다! ");
		                              System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                              System.out.println("거스름돈 " + (money-(price[2]+price2[0])) + "을 받으세요.");
		                              System.out.println();
		                              customer = false;
		                              add = false;
		                              play = false;
		                              
		                           } else if (money < price[2]+price2[0]) {
		                              // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                              System.out.println("잔액이 부족합니다.");
		                              System.out.println("추가 입금이 필요합니다.");
		                              System.out.println();
		                              continue;
		                           } // 잔액 확인 후 결제하는 if문
		                           
		                        } // while-add 종료
		                     }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                        break;
		                     } // 돌아가기를 선택 if문 종료
		               } else if ( toppingNo == 2 ) { // toppingMenu[1]을 선택
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("주문을 확인해주세요!! ");
		                  System.out.println(ramenMenu[2] + "에 " + toppingMenu[1] + " 추가");
		                  System.out.println("결제하실 금액은 : " + (price[2]+price2[1]) + "원 입니다.");
		                  System.out.println("1. 결제하기 2. 돌아가기");
		                  System.out.print("숫자를 입력해주세요. >> ");
		                  num = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  
		                  if ( num == 1) { // 결제하기를 선택
		                        System.out.println("-------------------------------------------------------");
		                        System.out.println("결제를 도와드리겠습니다.");
		                        System.out.println("현재는 현금만 결제가 가능합니다. ");
		                        System.out.println("결제 취소는 5번을 입력해주세요.");
		                        
		                        while (add) {
		                        System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                        System.out.print("금액을 입금해주세요. >> ");
		                        int seleteMoney = scanner.nextInt();
		                        System.out.println();
		                                             
		                        switch (seleteMoney) {
		                        case 1 : 
		                           money += 1000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 2 :
		                           money += 5000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 3 :
		                           money += 10000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        } // 돈 입금 switch문
		                        
		                           if (money >= price[2]+price2[1]) {
		                              // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                              System.out.println("-------------------------------------------------------");
		                              System.out.println("주문 감사합니다! ");
		                              System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                              System.out.println("거스름돈 " + (money-(price[2]+price2[1])) + "을 받으세요.");
		                              System.out.println();
		                              customer = false;
		                              add = false;
		                              play = false;
		                              break;
		                              
		                           } else if (money < price[2]+price2[1]) {
		                              // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                              System.out.println("잔액이 부족합니다.");
		                              System.out.println("추가 입금이 필요합니다.");
		                              System.out.println();
		                              continue;
		                           } // 잔액 확인 후 결제하는 if문
		                           
		                        } // while-add 종료
		                     }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                        break;
		                     } // 돌아가기를 선택 if문 종료
		               } else if ( toppingNo == 3 ) { // toppingMenu[2]을 선택
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("주문을 확인해주세요!! ");
		                  System.out.println(ramenMenu[2] + "에 " + toppingMenu[2] + " 추가");
		                  System.out.println("결제하실 금액은 : " + (price[2]+price2[2]) + "원 입니다.");
		                  System.out.println("1. 결제하기 2. 돌아가기");
		                  System.out.print("숫자를 입력해주세요. >> ");
		                  num = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  
		                  if ( num == 1) { // 결제하기를 선택
		                        System.out.println("-------------------------------------------------------");
		                        System.out.println("결제를 도와드리겠습니다.");
		                        System.out.println("현재는 현금만 결제가 가능합니다. ");
		                        System.out.println("결제 취소는 5번을 입력해주세요.");
		                        
		                        while (add) {
		                        System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                        System.out.print("금액을 입금해주세요. >> ");
		                        int seleteMoney = scanner.nextInt();
		                        System.out.println();
		                                             
		                        switch (seleteMoney) {
		                        case 1 : 
		                           money += 1000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 2 :
		                           money += 5000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        case 3 :
		                           money += 10000;
		                           System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                           break;
		                        } // 돈 입금 switch문
		                        
		                           if (money >= price[2]+price2[2]) {
		                              // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                              System.out.println("-------------------------------------------------------");
		                              System.out.println("주문 감사합니다! ");
		                              System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                              System.out.println("거스름돈 " + (money-(price[2]+price2[2])) + "을 받으세요.");
		                              System.out.println();
		                              customer = false;
		                              add = false;
		                              play = false;
		                              break;
		                              
		                           } else if (money < price[2]+price2[2]) {
		                              // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                              System.out.println("잔액이 부족합니다.");
		                              System.out.println("추가 입금이 필요합니다.");
		                              System.out.println();
		                              continue;
		                           } // 잔액 확인 후 결제하는 if문
		                           
		                        } // while-add 종료
		                     }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                        break;
		                     } // 돌아가기를 선택 if문 종료
		               } // toppingNum 선택 if문 종료
		      
		   
		            } // 토핑 선택하는 switch

		            } // 고객모드 customer while문 종료
		            
		            break;
		            
		            
		         } else if ( type == 2 ) { // 볶음라면 선택
		            while(customer) {
		               System.out.println("-------------------------------------------------------");
		               System.out.println("현재 주문이 가능한 라면 목록 입니다!");
		               System.out.println("1번 " + ramenMenu[3] + " 가격 : " + price[3] + "원 재고 " + stock[3] + "개 ");
		               System.out.println("2번 " + ramenMenu[4] + " 가격 : " + price[4] + "원 재고 " + stock[4] + "개 ");
		               System.out.println("3번 " + ramenMenu[5] + " 가격 : " + price[5] + "원 재고 " + stock[5] + "개 ");
		               System.out.println("4. 이전 메뉴로 돌아가기");
		               System.out.print("숫자를 입력해주세요. >> ");
		               selectNo = scanner.nextInt();
		               System.out.println(); // 개행
		               
		               
		               switch (selectNo) { //토핑 선택하는 switch문
		               case 1 : // ramenMenu[3]을 선택
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("토핑 추가는 어떠세요?");
		                  System.out.println("1번 " + toppingMenu[0] + " 가격 : " + price2[0] + "원 재고 " + stock2[0] + "개 ");
		                  System.out.println("2번 " + toppingMenu[1] + " 가격 : " + price2[1] + "원 재고 " + stock2[1] + "개 ");
		                  System.out.println("3번 " + toppingMenu[2] + " 가격 : " + price2[2] + "원 재고 " + stock2[2] + "개 ");
		                  System.out.println("4번 추가 안함");
		                  System.out.println("5. 이전 메뉴로 돌아가기");
		                  System.out.print("숫자를 입력해주세요. >> ");
		                  toppingNo = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  if (toppingNo == 1) { // toppingMenu[0]을 선택
		                     System.out.println("-------------------------------------------------------");
		                     System.out.println("주문을 확인해주세요!! ");
		                     System.out.println(ramenMenu[3] + "에 " + toppingMenu[0] + " 추가");
		                     System.out.println("결제하실 금액은 : " + (price[3]+price2[0]) + "원 입니다.");
		                     System.out.println("1. 결제하기 2. 돌아가기");
		                     System.out.print("숫자를 입력해주세요. >> ");
		                     num = scanner.nextInt();
		                     System.out.println(); // 개행
		                     
		                     
		                     if ( num == 1) { // 결제하기를 선택
		                           System.out.println("-------------------------------------------------------");
		                           System.out.println("결제를 도와드리겠습니다.");
		                           System.out.println("현재는 현금만 결제가 가능합니다. ");
		                           System.out.println("결제 취소는 5번을 입력해주세요.");
		                           
		                           while (add) {
		                           System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                           System.out.print("금액을 입금해주세요. >> ");
		                           int seleteMoney = scanner.nextInt();
		                           System.out.println();
		                                                
		                           switch (seleteMoney) {
		                           case 1 : 
		                              money += 1000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 2 :
		                              money += 5000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 3 :
		                              money += 10000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           } // 돈 입금 switch문
		                           
		                              if (money >= price[3]+price2[0]) {
		                                 // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                                 System.out.println("-------------------------------------------------------");
		                                 System.out.println("주문 감사합니다! ");
		                                 System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                                 System.out.println("거스름돈 " + (money-(price[3]+price2[0])) + "을 받으세요.");
		                                 System.out.println();
		                                 customer = false;
		                                 add = false;
		                                 play = false;
		                                 break;
		                                 
		                              } else if (money < price[3]+price2[0]) {
		                                 // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                                 System.out.println("잔액이 부족합니다.");
		                                 System.out.println("추가 입금이 필요합니다.");
		                                 System.out.println();
		                                 continue;
		                              } // 잔액 확인 후 결제하는 if문
		                              
		                           } // while-add 종료
		                        }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                           break;
		                        } // 돌아가기를 선택 if문 종료   
		                  } else if ( toppingNo == 2 ) { // toppingMenu[1]을 선택
		                     System.out.println("-------------------------------------------------------");
		                     System.out.println("주문을 확인해주세요!! ");
		                     System.out.println(ramenMenu[3] + "에 " + toppingMenu[1] + " 추가");
		                     System.out.println("결제하실 금액은 : " + (price[3]+price2[1]) + "원 입니다.");
		                     System.out.println("1. 결제하기 2. 돌아가기");
		                     System.out.print("숫자를 입력해주세요. >> ");
		                     num = scanner.nextInt();
		                     System.out.println(); // 개행
		                     
		                     
		                     if ( num == 1) { // 결제하기를 선택
		                           System.out.println("-------------------------------------------------------");
		                           System.out.println("결제를 도와드리겠습니다.");
		                           System.out.println("현재는 현금만 결제가 가능합니다. ");
		                           System.out.println("결제 취소는 5번을 입력해주세요.");
		                           
		                           while (add) {
		                           System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                           System.out.print("금액을 입금해주세요. >> ");
		                           int seleteMoney = scanner.nextInt();
		                           System.out.println();
		                                                
		                           switch (seleteMoney) {
		                           case 1 : 
		                              money += 1000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 2 :
		                              money += 5000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 3 :
		                              money += 10000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           } // 돈 입금 switch문
		                           
		                              if (money >= price[3]+price2[1]) {
		                                 // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                                 System.out.println("-------------------------------------------------------");
		                                 System.out.println("주문 감사합니다! ");
		                                 System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                                 System.out.println("거스름돈 " + (money-(price[3]+price2[1])) + "을 받으세요.");
		                                 System.out.println();
		                                 customer = false;
		                                 add = false;
		                                 play = false;
		                                 break;
		                                 
		                              } else if (money < price[3]+price2[1]) {
		                                 // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                                 System.out.println("잔액이 부족합니다.");
		                                 System.out.println("추가 입금이 필요합니다.");
		                                 System.out.println();
		                                 continue;
		                              } // 잔액 확인 후 결제하는 if문
		                              
		                           } // while-add 종료
		                        }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                           break;
		                        } // 돌아가기를 선택 if문 종료
		                  } else if ( toppingNo == 3 ) { // toppingMenu[2]을 선택
		                     System.out.println("-------------------------------------------------------");
		                     System.out.println("주문을 확인해주세요!! ");
		                     System.out.println(ramenMenu[3] + "에 " + toppingMenu[2] + " 추가");
		                     System.out.println("결제하실 금액은 : " + (price[3]+price2[2]) + "원 입니다.");
		                     System.out.println("1. 결제하기 2. 돌아가기");
		                     System.out.print("숫자를 입력해주세요. >> ");
		                     num = scanner.nextInt();
		                     System.out.println(); // 개행
		                     
		                     
		                     if ( num == 1) { // 결제하기를 선택
		                           System.out.println("-------------------------------------------------------");
		                           System.out.println("결제를 도와드리겠습니다.");
		                           System.out.println("현재는 현금만 결제가 가능합니다. ");
		                           System.out.println("결제 취소는 5번을 입력해주세요.");
		                           
		                           while (add) {
		                           System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                           System.out.print("금액을 입금해주세요. >> ");
		                           int seleteMoney = scanner.nextInt();
		                           System.out.println();
		                                                
		                           switch (seleteMoney) {
		                           case 1 : 
		                              money += 1000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 2 :
		                              money += 5000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 3 :
		                              money += 10000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           } // 돈 입금 switch문
		                           
		                              if (money >= price[3]+price2[2]) {
		                                 // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                                 System.out.println("-------------------------------------------------------");
		                                 System.out.println("주문 감사합니다! ");
		                                 System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                                 System.out.println("거스름돈 " + (money-(price[3]+price2[2])) + "을 받으세요.");
		                                 System.out.println();
		                                 customer = false;
		                                 add = false;
		                                 play = false;
		                                 break;
		                                 
		                              } else if (money < price[3]+price2[2]) {
		                                 // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                                 System.out.println("잔액이 부족합니다.");
		                                 System.out.println("추가 입금이 필요합니다.");
		                                 System.out.println();
		                                 continue;
		                              } // 잔액 확인 후 결제하는 if문
		                              
		                           } // while-add 종료
		                        }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                           break;
		                        } // 돌아가기를 선택 if문 종료
		                  } // toppingNum 선택 if문 종료
		               
		                  break;
		               case 2 : // ramenMenu[4]을 선택
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("토핑 추가는 어떠세요?");
		                  System.out.println("1번 " + toppingMenu[0] + " 가격 : " + price2[0] + "원 재고 " + stock2[0] + "개 ");
		                  System.out.println("2번 " + toppingMenu[1] + " 가격 : " + price2[1] + "원 재고 " + stock2[1] + "개 ");
		                  System.out.println("3번 " + toppingMenu[2] + " 가격 : " + price2[2] + "원 재고 " + stock2[2] + "개 ");
		                  System.out.println("4번 추가 안함");
		                  System.out.println("5. 이전 메뉴로 돌아가기");
		                  System.out.print("숫자를 입력해주세요. >> ");
		                  toppingNo = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  if (toppingNo == 1) { // toppingMenu[0]을 선택
		                     System.out.println("-------------------------------------------------------");
		                     System.out.println("주문을 확인해주세요!! ");
		                     System.out.println(ramenMenu[4] + "에 " + toppingMenu[0] + " 추가");
		                     System.out.println("결제하실 금액은 : " + (price[4]+price2[0]) + "원 입니다.");
		                     System.out.println("1. 결제하기 2. 돌아가기");
		                     System.out.print("숫자를 입력해주세요. >> ");
		                     num = scanner.nextInt();
		                     System.out.println(); // 개행
		                     
		                     
		                     if ( num == 1) { // 결제하기를 선택
		                           System.out.println("-------------------------------------------------------");
		                           System.out.println("결제를 도와드리겠습니다.");
		                           System.out.println("현재는 현금만 결제가 가능합니다. ");
		                           System.out.println("결제 취소는 5번을 입력해주세요.");
		                           
		                           while (add) {
		                           System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                           System.out.print("금액을 입금해주세요. >> ");
		                           int seleteMoney = scanner.nextInt();
		                           System.out.println();
		                                                
		                           switch (seleteMoney) {
		                           case 1 : 
		                              money += 1000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 2 :
		                              money += 5000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 3 :
		                              money += 10000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           } // 돈 입금 switch문
		                           
		                              if (money >= price[4]+price2[0]) {
		                                 // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                                 System.out.println("-------------------------------------------------------");
		                                 System.out.println("주문 감사합니다! ");
		                                 System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                                 System.out.println("거스름돈 " + (money-(price[4]+price2[0])) + "을 받으세요.");
		                                 System.out.println();
		                                 customer = false;
		                                 add = false;
		                                 play = false;
		                                 break;
		                                 
		                              } else if (money < price[4]+price2[0]) {
		                                 // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                                 System.out.println("잔액이 부족합니다.");
		                                 System.out.println("추가 입금이 필요합니다.");
		                                 System.out.println();
		                                 continue;
		                              } // 잔액 확인 후 결제하는 if문
		                              
		                           } // while-add 종료
		                        }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                           break;
		                        } // 돌아가기를 선택 if문 종료
		                  } else if ( toppingNo == 2 ) { // toppingMenu[1]을 선택
		                     System.out.println("-------------------------------------------------------");
		                     System.out.println("주문을 확인해주세요!! ");
		                     System.out.println(ramenMenu[4] + "에 " + toppingMenu[1] + " 추가");
		                     System.out.println("결제하실 금액은 : " + (price[4]+price2[1]) + "원 입니다.");
		                     System.out.println("1. 결제하기 2. 돌아가기");
		                     System.out.print("숫자를 입력해주세요. >> ");
		                     num = scanner.nextInt();
		                     System.out.println(); // 개행
		                     
		                     
		                     if ( num == 1) { // 결제하기를 선택
		                           System.out.println("-------------------------------------------------------");
		                           System.out.println("결제를 도와드리겠습니다.");
		                           System.out.println("현재는 현금만 결제가 가능합니다. ");
		                           System.out.println("결제 취소는 5번을 입력해주세요.");
		                           
		                           while (add) {
		                           System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                           System.out.print("금액을 입금해주세요. >> ");
		                           int seleteMoney = scanner.nextInt();
		                           System.out.println();
		                                                
		                           switch (seleteMoney) {
		                           case 1 : 
		                              money += 1000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 2 :
		                              money += 5000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 3 :
		                              money += 10000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           } // 돈 입금 switch문
		                           
		                              if (money >= price[4]+price2[1]) {
		                                 // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                                 System.out.println("-------------------------------------------------------");
		                                 System.out.println("주문 감사합니다! ");
		                                 System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                                 System.out.println("거스름돈 " + (money-(price[4]+price2[1])) + "을 받으세요.");
		                                 System.out.println();
		                                 customer = false;
		                                 add = false;
		                                 play = false;
		                                 break;
		                                 
		                              } else if (money < price[4]+price2[1]) {
		                                 // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                                 System.out.println("잔액이 부족합니다.");
		                                 System.out.println("추가 입금이 필요합니다.");
		                                 System.out.println();
		                                 continue;
		                              } // 잔액 확인 후 결제하는 if문
		                              
		                           } // while-add 종료
		                        }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                           break;
		                        } // 돌아가기를 선택 if문 종료
		                  } else if ( toppingNo == 3 ) { // toppingMenu[2]을 선택
		                     System.out.println("-------------------------------------------------------");
		                     System.out.println("주문을 확인해주세요!! ");
		                     System.out.println(ramenMenu[4] + "에 " + toppingMenu[2] + " 추가");
		                     System.out.println("결제하실 금액은 : " + (price[4]+price2[2]) + "원 입니다.");
		                     System.out.println("1. 결제하기 2. 돌아가기");
		                     System.out.print("숫자를 입력해주세요. >> ");
		                     num = scanner.nextInt();
		                     System.out.println(); // 개행
		                     
		                     
		                     if ( num == 1) { // 결제하기를 선택
		                           System.out.println("-------------------------------------------------------");
		                           System.out.println("결제를 도와드리겠습니다.");
		                           System.out.println("현재는 현금만 결제가 가능합니다. ");
		                           System.out.println("결제 취소는 5번을 입력해주세요.");
		                           
		                           while (add) {
		                           System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                           System.out.print("금액을 입금해주세요. >> ");
		                           int seleteMoney = scanner.nextInt();
		                           System.out.println();
		                                                
		                           switch (seleteMoney) {
		                           case 1 : 
		                              money += 1000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 2 :
		                              money += 5000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 3 :
		                              money += 10000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           } // 돈 입금 switch문
		                           
		                              if (money >= price[4]+price2[2]) {
		                                 // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                                 System.out.println("-------------------------------------------------------");
		                                 System.out.println("주문 감사합니다! ");
		                                 System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                                 System.out.println("거스름돈 " + (money-(price[4]+price2[2])) + "을 받으세요.");
		                                 System.out.println();
		                                 customer = false;
		                                 add = false;
		                                 play = false;
		                                 break;
		                                 
		                              } else if (money < price[4]+price2[2]) {
		                                 // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                                 System.out.println("잔액이 부족합니다.");
		                                 System.out.println("추가 입금이 필요합니다.");
		                                 System.out.println();
		                                 continue;
		                              } // 잔액 확인 후 결제하는 if문
		                              
		                           } // while-add 종료
		                        }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                           break;
		                        } // 돌아가기를 선택 if문 종료
		                  } // toppingNum 선택 if문 종료
		                  
		                  break;
		               case 3 : // ramenMenu[5]을 선택
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("토핑 추가는 어떠세요?");
		                  System.out.println("1번 " + toppingMenu[0] + " 가격 : " + price2[0] + "원 재고 " + stock2[0] + "개 ");
		                  System.out.println("2번 " + toppingMenu[1] + " 가격 : " + price2[1] + "원 재고 " + stock2[1] + "개 ");
		                  System.out.println("3번 " + toppingMenu[2] + " 가격 : " + price2[2] + "원 재고 " + stock2[2] + "개 ");
		                  System.out.println("4번 추가 안함");
		                  System.out.println("5. 이전 메뉴로 돌아가기");
		                  System.out.print("숫자를 입력해주세요. >> ");
		                  toppingNo = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  if (toppingNo == 1) { // toppingMenu[0]을 선택
		                     System.out.println("-------------------------------------------------------");
		                     System.out.println("주문을 확인해주세요!! ");
		                     System.out.println(ramenMenu[5] + "에 " + toppingMenu[0] + " 추가");
		                     System.out.println("결제하실 금액은 : " + (price[5]+price2[0]) + "원 입니다.");
		                     System.out.println("1. 결제하기 2. 돌아가기");
		                     System.out.print("숫자를 입력해주세요. >> ");
		                     num = scanner.nextInt();
		                     System.out.println(); // 개행
		                     
		                     
		                     if ( num == 1) { // 결제하기를 선택
		                           System.out.println("-------------------------------------------------------");
		                           System.out.println("결제를 도와드리겠습니다.");
		                           System.out.println("현재는 현금만 결제가 가능합니다. ");
		                           System.out.println("결제 취소는 5번을 입력해주세요.");
		                           
		                           while (add) {
		                           System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                           System.out.print("금액을 입금해주세요. >> ");
		                           int seleteMoney = scanner.nextInt();
		                           System.out.println();
		                                                
		                           switch (seleteMoney) {
		                           case 1 : 
		                              money += 1000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 2 :
		                              money += 5000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 3 :
		                              money += 10000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           } // 돈 입금 switch문
		                           
		                              if (money >= price[5]+price2[0]) {
		                                 // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                                 System.out.println("-------------------------------------------------------");
		                                 System.out.println("주문 감사합니다! ");
		                                 System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                                 System.out.println("거스름돈 " + (money-(price[5]+price2[0])) + "을 받으세요.");
		                                 System.out.println();
		                                 customer = false;
		                                 add = false;
		                                 play = false;
		                                 break;
		                                 
		                              } else if (money < price[5]+price2[0]) {
		                                 // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                                 System.out.println("잔액이 부족합니다.");
		                                 System.out.println("추가 입금이 필요합니다.");
		                                 System.out.println();
		                                 continue;
		                              } // 잔액 확인 후 결제하는 if문
		                              
		                           } // while-add 종료
		                        }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                           break;
		                        } // 돌아가기를 선택 if문 종료
		                  } else if ( toppingNo == 2 ) { // toppingMenu[1]을 선택
		                     System.out.println("-------------------------------------------------------");
		                     System.out.println("주문을 확인해주세요!! ");
		                     System.out.println(ramenMenu[5] + "에 " + toppingMenu[1] + " 추가");
		                     System.out.println("결제하실 금액은 : " + (price[5]+price2[1]) + "원 입니다.");
		                     System.out.println("1. 결제하기 2. 돌아가기");
		                     System.out.print("숫자를 입력해주세요. >> ");
		                     num = scanner.nextInt();
		                     System.out.println(); // 개행
		                     
		                     
		                     if ( num == 1) { // 결제하기를 선택
		                           System.out.println("-------------------------------------------------------");
		                           System.out.println("결제를 도와드리겠습니다.");
		                           System.out.println("현재는 현금만 결제가 가능합니다. ");
		                           System.out.println("결제 취소는 5번을 입력해주세요.");
		                           
		                           while (add) {
		                           System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                           System.out.print("금액을 입금해주세요. >> ");
		                           int seleteMoney = scanner.nextInt();
		                           System.out.println();
		                                                
		                           switch (seleteMoney) {
		                           case 1 : 
		                              money += 1000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 2 :
		                              money += 5000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 3 :
		                              money += 10000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           } // 돈 입금 switch문
		                           
		                              if (money >= price[5]+price2[1]) {
		                                 // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                                 System.out.println("-------------------------------------------------------");
		                                 System.out.println("주문 감사합니다! ");
		                                 System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                                 System.out.println("거스름돈 " + (money-(price[5]+price2[1])) + "을 받으세요.");
		                                 System.out.println();
		                                 customer = false;
		                                 add = false;
		                                 play = false;
		                                 break;
		                                 
		                              } else if (money < price[5]+price2[1]) {
		                                 // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                                 System.out.println("잔액이 부족합니다.");
		                                 System.out.println("추가 입금이 필요합니다.");
		                                 System.out.println();
		                                 continue;
		                              } // 잔액 확인 후 결제하는 if문
		                              
		                           } // while-add 종료
		                        }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                           break;
		                        } // 돌아가기를 선택 if문 종료
		                  } else if ( toppingNo == 3 ) { // toppingMenu[2]을 선택
		                     System.out.println("-------------------------------------------------------");
		                     System.out.println("주문을 확인해주세요!! ");
		                     System.out.println(ramenMenu[5] + "에 " + toppingMenu[2] + " 추가");
		                     System.out.println("결제하실 금액은 : " + (price[5]+price2[2]) + "원 입니다.");
		                     System.out.println("1. 결제하기 2. 돌아가기");
		                     System.out.print("숫자를 입력해주세요. >> ");
		                     num = scanner.nextInt();
		                     System.out.println(); // 개행
		                     
		                     
		                     if ( num == 1) { // 결제하기를 선택
		                           System.out.println("-------------------------------------------------------");
		                           System.out.println("결제를 도와드리겠습니다.");
		                           System.out.println("현재는 현금만 결제가 가능합니다. ");
		                           System.out.println("결제 취소는 5번을 입력해주세요.");
		                           
		                           while (add) {
		                           System.out.println("1. 1000원 2. 5000원 3. 10000원");
		                           System.out.print("금액을 입금해주세요. >> ");
		                           int seleteMoney = scanner.nextInt();
		                           System.out.println();
		                                                
		                           switch (seleteMoney) {
		                           case 1 : 
		                              money += 1000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 2 :
		                              money += 5000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           case 3 :
		                              money += 10000;
		                              System.out.println("현재 입금 금액은 " + money + "원 입니다.");
		                              break;
		                           } // 돈 입금 switch문
		                           
		                              if (money >= price[5]+price2[2]) {
		                                 // 입금된 금액이 결제할 금액보다 높을 경우 -> 결제 진행
		                                 System.out.println("-------------------------------------------------------");
		                                 System.out.println("주문 감사합니다! ");
		                                 System.out.println("거스름돈 반환 후 라면 제조가 시작됩니다.");
		                                 System.out.println("거스름돈 " + (money-(price[5]+price2[2])) + "을 받으세요.");
		                                 System.out.println();
		                                 customer = false;
		                                 add = false;
		                                 play = false;
		                                 break;
		                                 
		                              } else if (money < price[5]+price2[2]) {
		                                 // 입금된 금액이 결제할 금액보다 낮을 경우 -> 입금 진행
		                                 System.out.println("잔액이 부족합니다.");
		                                 System.out.println("추가 입금이 필요합니다.");
		                                 System.out.println();
		                                 continue;
		                              } // 잔액 확인 후 결제하는 if문
		                              
		                           } // while-add 종료
		                        }  else if ( num == 2 ) { // 돌아가기를 선택 (while customer로 돌아감)
		                           break;
		                        } // 돌아가기를 선택 if문 종료
		                  } // toppingNum 선택 if문 종료
		         
		                  break;
		               } // 토핑 선택하는 switch

		               } // 고객모드 customer while문 종료
		            
		            
		            
		            
		            
		            
		            
		            
		         } else if ( type == 99 ) { // 관리자 모드 진입 if
		            System.out.println(); // 개행
		            System.out.println("-------------------------------------------------------");
		            System.out.println("관리자 확인이 필요합니다.");
		            System.out.print("관리자 비밀번호를 입력해주세요 : ");
		            int pw = scanner.nextInt();
		            
		            
		            
		            if ( pw == 940408) {
		               // 관리자 모드
		               while (Manager) {
		                  System.out.println("-------------------------------------------------------");
		                  System.out.println("관리자 모드 입니다. ");
		                  System.out.println("1. 상품관리(라면) 2. 상품관리(토핑) 3. 재고조사  4. 관리자모드 종료");
		                  System.out.print("번호를 선택해주세요. >> ");
		                  int selectNo2 = scanner.nextInt();
		                  System.out.println(); // 개행
		                  
		                  switch (selectNo2) {
		                  case 1 : // 1. 상품관리(라면)
		                     System.out.print("상품(라면) 몇가지를 판매하시겠습니까? >> ");
		                     numMenu = scanner.nextInt();
		                     ramenMenu = new String[numMenu];
		                     price = new int[numMenu];
		                     stock = new int[numMenu];
		                     System.out.println(); // 개행
		                     
		                     System.out.println("상품명을 입력하세요. >>");
		                     for ( int i=0; i < ramenMenu.length; i++) {
		                        System.out.print((i+1)+ "번" + " 라면명 >> ");
		                        ramenMenu[i] = scanner.next();
		                        System.out.print("가격을 설정해주세요. >> ");
		                        price[i] = scanner.nextInt();      
		                        System.out.print("재고 수량을 입력해주세요. >> ");
		                        stock[i] = scanner.nextInt();
		                        System.out.println(); // 개행
		                     } // 라면 메뉴 추가
		                     break;
		                     
		                  case 2 : // 2. 상품관리(토핑)
		                     System.out.print("상품(토핑) 몇가지 판매하시겠습니까? >> ");
		                     numMenu2 = scanner.nextInt();
		                     toppingMenu = new String[numMenu2];
		                     price2 = new int[numMenu2];
		                     stock2 = new int[numMenu2];
		                     System.out.println(); // 개행
		         
		                     System.out.println("상품명을 입력하세요. >>");
		                     for ( int i=0; i < toppingMenu.length; i++) {
		                        System.out.print((i+1)+ "번" + " 토핑명 >> ");
		                        toppingMenu[i] = scanner.next();
		                        System.out.print("가격을 설정해주세요. >> ");
		                        price2[i] = scanner.nextInt();      
		                        System.out.print("재고 수량을 입력해주세요. >> ");
		                        stock2[i] = scanner.nextInt();
		                        System.out.println(); // 개행
		                     } // 토핑 메뉴 추가
		                     break;
		                     
		                  case 3 : // 3.  재고조사
		                     for (int i=0; i < ramenMenu.length; i++) {
		                        System.out.print((i+1) + "번 " + ramenMenu[i] + " 가격은 : " + price[i] + "원 입니다. ");
		                        System.out.println("현재 재고는 : " + stock[i] + "개 입니다.");
		                     } // 라면 재고
		                     System.out.println(); // 개행
		                     
		                     for (int i=0; i < toppingMenu.length; i++) {
		                        System.out.print((i+1) + "번 " + toppingMenu[i] + " 가격은 : " + price2[i] + "원 입니다. ");
		                        System.out.println("현재 재고는 : " + stock2[i] + "개 입니다.");
		                     } // 토핑 조사
		                     System.out.println(); // 개행
		                     break;
		                     
		                  case 4: // 4. 관리자모드 종료
		                     Manager = false;
		                     customer = true;
		                     break ;
		                  } // 관리자모드 switch문 종료
		                  
		               } // 관리자모드 Manager while문 종료
		               System.out.println("관리자 모드가 종료됩니다.");
		               System.out.println("-------------------------------------------------------");
		               System.out.println(); // 개행
		               
		               
		               
		            } else if ( pw != 940408 ) { // 맞는 pw 입력 시 관리자 모드 실행
		               System.out.println("잘못된 패스워드 입니다.");
		               System.out.println("-------------------------------------------------------");
		               System.out.println(); // 개행
		            } // 잘못된 pw 입력 시 출력 문구
		            
		         } // 관리자모드 진입 else if문 종료
		         
		      
		      } // while play 종료
		      
		      System.out.println("라면을 제조를 시작합니다.");
		      
		      
		   } // main
		} // class

	


