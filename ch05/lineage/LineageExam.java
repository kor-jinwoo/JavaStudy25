package ch05.lineage;

import java.util.Scanner;

import ch05.lineage.dto.Account;
import ch05.lineage.dto.ElfDTO;
import ch05.lineage.dto.KnightDTO;
import ch05.lineage.service.CharacterService;
import ch05.lineage.service.LoginService;
import ch05.lineage.dto.Account;
public class LineageExam {
	// 필드
	public static Scanner input = new Scanner(System.in);
	public static Account[] accounts = new Account[10]; // 로그인용 배열
	public static Account loginAccount; // 로그인 성공시 객체 (세션역할)
	public static KnightDTO knightDTO = new KnightDTO();
	public static ElfDTO elfDTO = new ElfDTO();
	
	static {
		
	knightDTO.setSword("롱소드");
	knightDTO.setArmor("워모그의갑옷");
	knightDTO.setShield("도란의방패");
	knightDTO.setName("가렌");
	knightDTO.setSex("남");
	knightDTO.setLevel("1");
	knightDTO.setHp(5000);
	knightDTO.setMp(50);
	knightDTO.setExp(0);
	knightDTO.setMoney(500000);
	
	elfDTO.setBow("양손활");
	elfDTO.setDress("천사드레스");
	elfDTO.setArrow("크리티컬화살");
	elfDTO.setName("요정");
	elfDTO.setSex("여");
	elfDTO.setLevel("1");
	elfDTO.setHp(3000);
	elfDTO.setMp(300);
	elfDTO.setExp(0);
	elfDTO.setMoney(1000000);
	
	Account account = new Account(); // 테스트용 계정생성
	
	account.setId("kjw");
	account.setPw("1234");
	account.setNickname("zl존검사");
	
	accounts[0] = account; // 배열 0번에 계정객체 연결
	// db대신 초기값 지정 (생성자 대신)
	} // 스태틱블록 종료

	public static void main(String[] args) {
		// 객체간의 상속을 알아본다.
		// 부모 객체 자식 객체에게 모든 정보를 상속한다.
		// 자식 객체는 부모 객체의 정보를 받아 사용하며 추가적인 정보를 생성하여 활용함
		System.out.println("------리니지 게임을 시작합니다-------");
		boolean run = true;
		
		while (run) {
			System.out.println("| 1. 로그인메뉴 | 2. 캐릭터선택 | 3. 게임실행 | 4. 종료 |");
			System.out.print("1~4번 입력 : ");
			int num = input.nextInt();
			
			switch (num) {
			case 1:
				System.out.println(" ");
				System.out.println("로그인메뉴로 이동합니다.");
				loginAccount = LoginService.menu(input, accounts, loginAccount);
				break;
				
			case 2:
				System.out.println(" ");
				System.out.println("캐릭터를 선택합니다.");
				CharacterService.menu(input, loginAccount, knightDTO, elfDTO);
				break;
				
			case 3:
				System.out.println(" ");
				System.out.println("게임을 시작합니다.");
				break;
				
			case 4:
				System.out.println("게임을 종료합니다.");
				run = false;
				break;
				
				default :
					System.out.println("1~4번까지만 입력하세요.");
				
			} // 스위치문 종료
		
			
		} // 와일문종료
		
		
	} // 메인메서드 종료

} // 클래스종료
