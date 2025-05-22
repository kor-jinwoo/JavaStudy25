package ch03;

public class ArrayExam {

	public static void main(String[] args) {

		int total = Odd(new int[] {70,80,90});
		int total2 = Odd(new int[] {80,90,100});
		int total3 = Odd(new int[] {60,70,80});
		System.out.println("1번 총합 : " + total);
		System.out.println("2번 총합 : " + total2);
		System.out.println("3번 총합 : " + total3);
	}

	private static int Odd(int[] scores) {
		int sum = 0;
		for (int i = 0; i < 3; i++) {
			sum += scores[i];
		
		
		}
		return sum;
	} // 메인메서드

} // 클래스
