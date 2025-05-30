package ch05.mbcbank.service;

import java.util.Scanner;

import ch05.mbcbank.DTO.HanaAccountDTO;

public class BankService { // 서비스 계층은 crud 메서드 위주로 생성한다.
	// 필드
	
	
	// 생성자
	
	
	// 메서드 (부메뉴, 계좌생성, 입금, 출금, 삭제, 이체 등....)
	
	public void menu(Scanner inputInt, Scanner inputStr, HanaAccountDTO[] hanaBank) {
		boolean subRun = true; 
		while(subRun) {
			System.out.println("----------------------------");
			System.out.println("하나은행계좌관리 메서드 입니다.");
			System.out.println("1. 계좌생성");
			System.out.println("2. 계좌목록");
			System.out.println("3. 예금");
			System.out.println("4. 출금");
			System.out.println("5. 이체");
			System.out.println("6. 종료");
			System.out.print(">>>");
			String select = inputStr.next();
			switch(select) {
			case "1" :
				System.out.println("====계좌생성메서드로진입합니다====");
				createAccount(inputStr, inputInt, hanaBank);
				break;
			case "2" :
				System.out.println("====계좌목록보기메서드로진입합니다====");
				accountLists(inputStr, inputInt, hanaBank);
				break;
			case "3" :
				System.out.println("====계좌입금메서드로진입합니다====");
				deposit(inputStr, inputInt, hanaBank);
				break;
			case "4" :
				System.out.println("====계좌출금메서드로진입합니다====");
				break;
			case "5" :
				System.out.println("====계좌이체메서드로진입합니다====");
				break;
			case "6" :
				System.out.println("====하나은행을 종료합니다====");
				System.out.println("====메인메뉴로 복귀합니다.====");
				subRun=false;
				break;
			default :
				System.out.println("1~6까지만 입력하세요");
				break;
			}// 스위치문 종료
			
		} // 와일문 종료
		
	} // 부메뉴 메서드 종료

	private void deposit(Scanner inputStr, Scanner inputInt, HanaAccountDTO[] hanaBank) {
	// 계좌번호를 입력하고 입금액을 입력하면 계좌번호를 찾아서 계좌잔액을 증가 시킨다.
		System.out.println("=======예금=======");
		System.out.print("계좌번호 : ");
		String ano = inputStr.next();
		System.out.print("예금액 : ");
		int money = inputInt.nextInt();
		HanaAccountDTO inputAccount = findAccount(ano, hanaBank);
		// findAccount 메서드는 배열에서 객체를 찾아주고 객체를 리턴해준다.(반복코드 배제용)
		if(inputAccount == null) {
			System.out.println("찾는 계좌번호가 없습니다.");
			return ;
		}
		inputAccount.setBalance(inputAccount.getBalance() + money);
		System.out.println("입금 테스트 결과 : " + inputAccount); 
		// toString으로 결과 보기
		System.out.println(inputAccount.getOwner() + "님 입금이 성공되었습니다.");
		System.out.println("잔액 : " + inputAccount.getBalance() + "원");
		System.out.println("============================");
	
	} // 입금용 메서드 종료

	private HanaAccountDTO findAccount(String ano, HanaAccountDTO[] hanaBank) {
		// 입금, 출금, 이체에서 계좌번호를 이용해 객체를 찾는 반복 코드 메서드
		HanaAccountDTO account = null; // 빈객체 
		for(int i=0 ; i<hanaBank.length ; i++) {
			if(hanaBank[i] !=null ) {
				// 하나은행배열이 널이 아님
				String dbAno = hanaBank[i].getAno();
				// 배열에있는 계좌번호를 가져와 dbAno 변수에 넣음
				if(dbAno.equals(ano)) {
					// 키보드로 입력된 계좌번호와 dbAno와 같은 값을 찾는다.
					account = hanaBank[i]; 
					// 빈객체에 찾은 객체를 넣는다.
					break;
				} // 번호 같은지 판단 종료
			} //빈객체가 아닌지 판단 종료
		} // 배열 반복 종료
		
		
		return account ;
	} // 계좌 찾기 메서드 종료 

	private void accountLists(Scanner inputStr, Scanner inputInt, HanaAccountDTO[] hanaBank) {
	// 하나은행에 계정을 모두 본다 (은행원용)
		System.out.println("-----하나은행계좌리스트------");
		for(int i=0 ; i<hanaBank.length ; i++) {
			HanaAccountDTO accountlist = hanaBank[i];
			if(accountlist != null) {
				// 배열에 null이 아니면 출력
				System.out.print(accountlist.getAno());
				System.out.print("\t");
				
				System.out.print(accountlist.getOwner());
				System.out.print("\t");
				
				System.out.print(accountlist.getBalance());
				System.out.print("\t\n");
				System.out.println("--------------------------");
				
			}
		}
		
	}

	private void createAccount(Scanner inputStr, Scanner inputInt, HanaAccountDTO[] hanaBank) {
		// 하나은행 배열에 새로운 객체를 넣는다.
		System.out.println("------계좌생성------");
		HanaAccountDTO myAccount = new HanaAccountDTO(); //빈객체 생성
		
		System.out.print("계좌번호 : ");
		myAccount.setAno(inputStr.next());
		
		System.out.print("계좌주 : ");
		myAccount.setOwner(inputStr.next());
		
		System.out.print("초기입금액 : ");
		myAccount.setBalance(inputInt.nextInt()); // 21억까지 입금
		myAccount.setBankname("하나"); // 빈 객체에 데이터 입력 완료
		
		// 하나은행 배열에 객체를 삽입 (null인지 확인하고 넣음)
		for(int i=0 ; i<hanaBank.length ; i++) {
			if(hanaBank[i] == null) {
				// 하나은행배열에 null 값이면 처리 하는 코드
				hanaBank[i] = myAccount; // 배열에 입력한 객체 연결
				System.out.println("계좌 입력 완료 테스트 :" + hanaBank[i]);
				break; // 1개만 입력하기 위함.
				
				// toString으로 테스트 결과가 보임.
			}
			
			
		} // 하나은행 배열을 0번에서 부터 반복 코드
		
		
		System.out.println("계좌생성이 정상적으로 처리 되었습니다.");
		
		
		
		
		
	} // 계좌생성 메서드 종료
	
	
	
	
} // 하나은행 클래스 종료
