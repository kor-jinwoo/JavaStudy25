package ch05.lineage.service;

import java.util.Scanner;

import ch05.lineage.dto.Account;
import ch05.lineage.dto.ElfDTO;
import ch05.lineage.dto.KnightDTO;

public class CharacterService {

	public static void menu(Scanner input, Account loginAccount, KnightDTO knightDTO,ElfDTO elfDTO) {
		System.out.println("| 1. 기사 | 2. 요정 | 3. 마법사 | 4. 도적 | 5. 군주 | 6. 총사 | 7. 종료 |");
		System.out.print("1~7번 입력 : ");
		int select = input.nextInt();
		
		switch (select) {
		case 1:
			System.out.println("기사를 선택하셨습니다.");
			loginAccount.setKnight(knightDTO);
			System.out.println(loginAccount.getNickname() +
					"님 " + loginAccount.getKnight().getName() + "캐릭터를 선택하셨습니다.");
			break;
			
		} // 스위치문 종료
	} // 메서드종료
	
} // 클래스종료
