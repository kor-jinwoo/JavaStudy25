package ch01;

public class PromotionExam {

	public static void main(String[] args) {
		// �ڵ� Ÿ�Ժ�ȯ ����
		// : ���� Ÿ�԰��� �ս� ���� ū Ÿ�� ������ ��ȯ�Ѵ�.
		// byte (1byte : 8bit)
		// short (2byte : 16bit) & char (�����ڵ�� : ����ǥ��)
		// int (4byre : 16bit)
		// long (8byte : 64bit) // ���̻�L
		// float (4byte : 32bit) // �Ǽ��� ���̻�F
		// double (8byte : 64bit)
		
		byte byteValue = 10 ; // ����ƮŸ���� ������ 10���� �ִ´�.
		int intValue = byteValue ; // �ڵ�Ÿ�Ժ�ȯ ��.
		
		System.out.println("�ڵ�Ÿ�� �� int : " + intValue );
		//sysout + ��Ʈ�� �����̽�
		
		char charValue = '��' ;
		intValue = charValue ;
		
		System.out.println("�ڵ�Ÿ�� �� int : " + intValue);
		
		intValue = 500 ;
		long longValue = intValue ;
		
		System.out.println("�ڵ�Ÿ�� �� long : " + longValue );
		
		double doubleValue = intValue ;
		
		System.out.println("�ڵ�Ÿ�� �� double : " + doubleValue);
		
		
		
	}

}
