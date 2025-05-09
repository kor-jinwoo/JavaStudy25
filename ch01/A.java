package ch01;

public class A {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 11;
		boolean result1 = (num1 == num2); // 같은지 검사
		boolean result2 = (num1 != num2); // 다른지 검사
		boolean result3 = (num1 <= num2); // 같거나 다른지 검사
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		char char1 = 'A'; // int"65"의값
		char char2 = 'B'; // int"66"의값
		boolean result4 = (char1 < char2); // true
		System.out.println("result4 : " + result4);
		
	}

}
