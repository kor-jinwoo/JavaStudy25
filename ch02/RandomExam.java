package ch02;

public class RandomExam {

	public static void main(String[] args) {
		// 랜덤은 임의 숫자로 math라는 클래스 안쪽에 랜덤이라는 메서드를 활용.
		// 이 메서드는 초를 us단위로 변수에 넣어 사용.
		
		double random = Math.random()*6 + 1;
		System.out.println(random);
		
		

	}

}
