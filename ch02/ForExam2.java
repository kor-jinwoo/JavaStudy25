package ch02;

public class ForExam2 {

	public static void main(String[] args) {
	
for (int i = 1 ; i <= 10 ; i++){
	System.out.println("1~10의 증가값 : " + i);
}
		for(int x = 2 ; x <= 10 ; x = x + 2) {
			System.out.println("1~10 +2 증가값 : " + x);
		}
		for (int z = 5 ; z <= 100 ; z = z +5) {
			System.out.println("5~100 +5 증가값 : " + z);
		}
	}

}
