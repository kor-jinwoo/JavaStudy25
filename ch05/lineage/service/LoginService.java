package ch05.lineage.service;

import java.util.Scanner;

import ch05.lineage.dto.Account;

public class LoginService {
	// 로그인에 관한 부메뉴 용
	public static Account menu(Scanner input, Account[] accounts, Account loginAccount) {
		System.out.println("| 1. 로그인 | 2. 회원가입 | 3. 회원수정 | 4. 뒤로가기 |");
		System.out.print("1~4번 입력 : ");
		int select = input.nextInt();

		switch (select) {
		case 1:
			System.out.println("로그인진행");
			System.out.print("ID : ");
			String id = input.next();

			System.out.print("PW : ");
			String pw = input.next();

			Account account = new Account();
			account.setId(id);
			account.setPw(pw); // 새로만든 account객체에 id,pw 삽입

			for (int i = 0; i < accounts.length; i++) {
				if (accounts[i] != null) {
					if (accounts[i].getId().equals(account.getId())) {
						System.out.println("해당하는 id가 있습니다.");
						if (accounts[i].getPw().equals(account.getPw())) {
							System.out.println("해당하는 pw가 있습니다.");
							loginAccount = accounts[i];
							System.out.println("로그인성공");
							break;
						} else {
							System.out.println("해당하는  pw가 없습니다.");
						}
					} else {
						System.out.println("해당하는 id가 없습니다.");
					}
				} else {
					System.out.println("해당하는 정보가 없습니다.");
					break;
				} // 빈객체 비교
			} // for문 종료

		} // 스위치문 종료

		return loginAccount;

	} // menu메서드 종료

}
