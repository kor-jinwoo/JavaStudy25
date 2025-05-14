package ch01;

public class CheckOverflowExam {

	public static void main(String[] args) {
		// 우리가 숫자타입을 키보드로 입력받아 처리하는것이 원칙
		// 입력값을 제어할 필요가 있다. (사전체크)
		// main 메서드 이외에 또다른 함수 메서드를 추가하여 사용

		int result = safeAdd(70, 80);
		System.out.println(result);

	} // 메인메서드종료

	public static int safeAdd(int left, int right) {
		if(right>0) { // 오른쪽 값이 0보다 커야됨
			if(left > (Integer.MAX_VALUE - right)) {
		            // Integer.MAX_VALUE 타입의 최대값 (약21억)
				    // int 타입에 최대값에서 오른쪽 값을 뺀것이 왼쪽 값보다 작아야함.
				throw new ArithmeticException("오버플로우발생");
				//예외처리 오류발생용 코드
	          } // 안쪽 if문 종료
	    } else { // false 일때
		if (left < (Integer.MIN_VALUE - right)) {
			// Integer.MAX_VALUE 타입의 최대값 (약-21억)
			throw new ArithmeticException("오버플로우발생");
		} // 안쪽 if문 종료
	} // 오버플로우 if문 종료

	return left+right;
} // safeAdd 메서드종료

} // 클래스 종료
