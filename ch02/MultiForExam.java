package ch02;

public class MultiForExam {

	public static void main(String[] args) {
		// for문 안쪽에 또다른 for문을 넣어 테스트해보자.

		// 9x9단을 만들어 본다.
		// 2x1=2 ~ 2x9=18 부터
		// 끝 9x1=9 ~ 9x9=81 까지
		
		//앞단의 for문 구현
		for (int m = 2 ; m <= 9 ; m++) { // 2~9 까지 1씩 증가
		System.out.println();
			System.out.println("======" + m + "단======");
		
		// 뒤단에 for문 구현
		for (int n = 1 ; n <= 9 ; n++) { // 1~9까지 1씩 증가
		System.out.print(m + "x" + n + "=" + (m*n) + "  ");
		}
		} // for문종료
	
	}



	}


