package ch01;

public class A {

	public static void main(String[] args) {
		
		int num1 = 10;
		int num2 = 11;
		boolean result1 = (num1 == num2); // ������ �˻�
		boolean result2 = (num1 != num2); // �ٸ��� �˻�
		boolean result3 = (num1 <= num2); // ���ų� �ٸ��� �˻�
		
		System.out.println("result1 : " + result1);
		System.out.println("result2 : " + result2);
		System.out.println("result3 : " + result3);
		
		char char1 = 'A'; // int"65"�ǰ�
		char char2 = 'B'; // int"66"�ǰ�
		boolean result4 = (char1 < char2); // true
		System.out.println("result4 : " + result4);
		
	}

}
