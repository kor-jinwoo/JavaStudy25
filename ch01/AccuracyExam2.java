package ch01;

public class AccuracyExam2 {

	public static void main(String[] args) {
		// ��� �Ѱ��� 10���� �ɰ��� �Ҽ����� ó������ ���� 10���� ���ؼ�
		// Ȱ���� �غ���. int Ÿ�Ը� Ȱ��
		
		int apple = 1; //��� 1��
		int totalpieces = apple * 10; //10���� ó����
		int num = 7; //��� 7����
		int temp = totalpieces - num; //10���� - 7����
		
		double result = temp / 10.0; //������ 10������ ����ġ
		System.out.println("���� ������� �� : " + result);

	}

}
