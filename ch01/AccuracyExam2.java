package ch01;

public class AccuracyExam2 {

	public static void main(String[] args) {
		// 사과 한개를 10개로 쪼갤때 소수점을 처리하지 말고 10으로 곱해서
		// 활용을 해보자. int 타입만 활용
		
		int apple = 1; //사과 1개
		int totalpieces = apple * 10; //10조각 처리용
		int num = 7; //사과 7조각
		int temp = totalpieces - num; //10조각 - 7조각
		
		double result = temp / 10.0; //위에서 10조각을 원위치
		System.out.println("남은 사과조각 수 : " + result);


	}

}
