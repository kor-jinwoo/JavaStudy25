package ch01;

import java.util.Scanner;

public class LogicalExam2 {

	public static void main(String[] args) {
		
		String id = "asdzxc";
		String pw = "123456";
		
		Scanner abc = new Scanner(System.in);
		
		System.out.print("아이디입력:");
		String id1 = abc.nextLine();
		System.out.println("입력완료");
		
		System.out.println("비밀번호입력:");
		String pw1 = abc.nextLine();
		System.out.println("입력완료");
		
		if((id.equals(id1)) & pw.equals(pw1)){
			System.out.println("로그인성공");
			
		} else { 
			System.out.println("아이디 또는 패스워드 불일치");
			
			abc.close();
			
		}

	}

}
