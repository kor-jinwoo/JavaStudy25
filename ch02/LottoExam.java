package ch02;

public class LottoExam {

	public static void main(String[] args) {
		// 로또 프로그램 만들기.
		
		int i = 0;
		while (true) {
			int num = (int) (Math.random()*45) + 1;
			
			System.out.println("오늘의 행운번호 : " + num);
			
			i++; // 0부터 나오는걸 방지.
			
			if (i == 6) { // 6개씩 나오게 하기.
				System.out.println("");
				System.out.println("행운을빕니다.");
				break; // 멈춰주기.
			}
			
		}

	}

}
