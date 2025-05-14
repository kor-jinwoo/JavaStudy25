package ch02;

public class AsdExam {

	public static void main(String[] args) {
		// break문에 라벨을 붙히면 반복코드 종료시점을 정할 수 있다.
		for (char upper = 'A' ; upper <= 'Z' ; upper++) { // A~Z까지 반복용코드
			Outter : for (char lower = 'a' ; lower <= 'z' ; lower++) { // a~z까지 반복용코드
				
				System.out.println(upper + "-" + lower);
				if (lower == 'c') {
					break Outter;
				}
				
			}
		}
	
		
	}

}
