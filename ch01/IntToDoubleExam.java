package ch01;

public class IntToDoubleExam {

	public static void main(String[] args) {
		// intŸ�԰� floatŸ���� ����32bit�� ���������
		// float�� �Ҽ����� ����ϱ� ������ ���� ������ �Ͼ
		
		// float���� ū double�� ����Ͽ� �ذ� �غ���.
		
		int num1 = 123456780;
		int num2 = 123456780;
		
		double num3 = num2;
		num2 = (int)num3;
		
		System.out.println("num1 : " + num1);
		System.out.println("num2 : " + num2);
		System.out.println("num3 : " + num3);
		
		int result = num1 - num2;
		System.out.println("float���� �ٳ�� �� num2 �� �����.");
		System.out.println("num1 - num2 : " + result);

	}

}
