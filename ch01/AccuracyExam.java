package ch01;

public class AccuracyExam {

	public static void main(String[] args) {
		// 사과 한개를 열조각으로 쪼개면 1조각이 0.1로 10개가 됨.
		
		int apple = 1; // 사과한개
		double pieceUint = 0.1; // 조각단위
		int number = 7; // 7개의 조각
		
		double result = apple - number*pieceUint;
		System.out.println("사과 7 조각을 뺌 : " +result);
		System.out.println("7 조각의 값 : " + number*pieceUint);
		
		// 결론 : 정확한 게산을 위해서는 실수타입을 사용하지 않는것이 좋다.

	}

}
