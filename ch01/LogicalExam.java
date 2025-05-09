package ch01;

import java.util.Scanner; // 외부 라이브러리

public class LogicalExam {

	public static void main(String[] args) {
		// 논리적인 연산자는 크게 5가지 유형이 있다.
		// & << 논리곱 (~이고) 2가지 변수가 모두 "참"일 경우 참.
		// | << 논리합 (~이거나) 2가지중 한개라도 "참"일 경우 참.
		// ! << 논리부정 참과 거짓을 반전함.
		// ^ << 배타적 논리합 (논리합의 마지막인 1+1=0 으로 결론이 남)
		
		String loginid = "kkw";
		String loginpw = "1234";
		
		Scanner infut = new Scanner(System.in);
		// 콘솔에 키보드로 값을 밀어넣을 객체를 생성함.
		
		System.out.print("로그인할 아이디를 입력하세요 : ");
		String id = infut.nextLine();
		System.out.println("입력하신 아이디는 " + id + "입니다.");
		
		System.out.print("로그인 할 암호를 입력하세요 : ");
		String pw = infut.nextLine();
		System.out.println("===검 증 중===");
		
		if( (loginid.equals(id)) & loginpw.equals(pw)){
			// 가지고 있던 아이디와 키보드로 입력한 아이디가 같은지
			// 이거나 or
			// 가지고 있던 패스워드와 키보드로 입력한 패스워드가 같은지
			System.out.println("아이디나 패스워드가 일치합니다.");
			System.out.println("===로그인 성공===");
			
		} else { // if문에 fales 처리용
			System.out.println("아이디나 패스워드가 다릅니다.");
			System.out.println("===로그인 실패===");
		} // if문 종료
		
		infut.close();
		

	} // 메인메서드 종료

} // 클래스 종료
