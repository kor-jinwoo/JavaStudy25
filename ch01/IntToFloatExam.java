package ch01;

public class IntToFloatExam {

	public static void main(String[] args) {
		// float�� 32bit�� �Ǿ��ִ� �ε��Ҽ��� ���꿡 ����.
		// ����Ÿ���� �Ǽ�Ÿ������ ��ȯ �� �� �ս��� �߻��Ѵ�.
		// int(32bit) = float(32bit)
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		float num3 = num2; // int Ÿ�԰��� float�� ����.
		num2 = (int)num3; // ������ ������ ������ ���� �ٽ� ����.
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2); // num2 : 123456784
		System.out.println("num3 : " + num3);
		// num3 : 1.23456784E8 > ������������ E���� ���ڸ� �ε��Ҽ��� ó��.
		//        12.3456784E7
		//        1234567.84E2
		
		int result = num1 - num2;
		System.out.println("float���� �ٳ�� �� num2 �� �����.");
		System.out.println("num1 - num2 : " + result);
		
	}

}
