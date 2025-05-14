package ch01;

import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {
		
		System.out.println("주민번호를 입력해주세요. (-생략)");
		Scanner in = new Scanner(System.in);
		
		String ssn = in.next();
		
		char ssn2 = ssn.charAt(6); // 성별확인추출
		int num = Character.getNumericValue(ssn2);
		
		if (num % 2 == 0) {
			System.out.println("성별 : 여자");
		}else if (num % 2 == 1) {
			System.out.println("성별 : 남자");
		}else {
			System.out.println("다시 입력해주세요.");
		} // 성별 구분 if문 종료
		
		int year = Integer.parseInt(ssn.substring(0,2)); // 태어난 년도 추출
		
		if (num == 1 || num == 2 || num == 5 || num == 6) {
			System.out.println("나이 : " + (2025 - (1900 + year) + 1));
		}else if (num == 3 || num == 4 || num == 7 || num == 8) {
			System.out.println("나이 : " + (2025 + (2000 + year) + 1));
		}else {
			System.out.println("다시 입력해주세요.");
	}
		
		int month = Integer.parseInt(ssn.substring(2,4)); // 태어난 월 추출
		
		if (month <= 0 || month >= 13) {
			System.out.println("다시 입력해주세요.");
		}else if (month >= 3 && month <= 5) {
			System.out.println("봄에 태어남.");
		}else if (month >= 6 && month <= 8) {
			System.out.println("여름에 태어남.");
		}else if (month >= 9 && month <= 11) {
			System.out.println("가을에 태어남.");
		}else {
			System.out.println("겨울에 태어남.");
		}// if문 종료
		
		in.close();
		
	}// 메인메서드 종료

}// 클래스 종료
