package ch01;

public class AccuracyExam {

	public static void main(String[] args) {
		// ��� �Ѱ��� ���������� �ɰ��� 1������ 0.1�� 10���� ��.
		
		int apple = 1; // ����Ѱ�
		double pieceUint = 0.1; // ��������
		int number = 7; // 7���� ����
		
		double result = apple - number*pieceUint;
		System.out.println("��� 7 ������ �� : " +result);
		System.out.println("7 ������ �� : " + number*pieceUint);
		
		// ��� : ��Ȯ�� �Ի��� ���ؼ��� �Ǽ�Ÿ���� ������� �ʴ°��� ����.

	}

}
