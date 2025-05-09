package ch01;

public class CastingExam {

	public static void main(String[] args) {
		// ����Ÿ�Ժ�ȯ (Casting)
		// ū ũ���� Ÿ���� ���� ũ�⿡ Ÿ������ �ڵ���ȯ �� �� ����.
		// int(21��) > byte Ÿ������ ������ ������ �߻��Ѵ�.
		// �̰��� ������ �߻��ص� ������ �����ϴ� ����� ����Ÿ�Ժ�ȯ �̶���Ѵ�.
		
		int intValue = 123456789 ;
		byte byteValue = (byte) intValue ; // () ������ byte Ÿ������ ��ȯ
		// Type mismatch: cannot convert from int to byte
		
		System.out.println("int Ÿ�԰� ��� : " + intValue);
		System.out.println("byte Ÿ�԰� ��� : " + byteValue);
		// byteŸ���� 8bit�� ����� �տ����� ��������.
		// 111010110111100110100010101
        //                  > 00010101 <
		
		int kor = 85;
        int eng = 99;
        int mat = 97;
        
        int total = kor + eng + mat;
        System.out.println("------����ǥ------");
        System.out.println("������ ���� : " + total);
        
        double avg = total / 3 ; // �ڵ�Ÿ�� ��ȯ��.
        System.out.println("������� : " + avg ) ;
        // ���� : ����� ����ص� �Ҽ����� 0���� ����
        // ���� : intŸ�� total�� 3���� ��������
        // �ذ� : double Ÿ������ ����Ÿ�Ժ�ȯ �� 3���� ��������
       
        avg = (float)total / 3 ; // ����Ÿ�� ��ȯ��.
        System.out.println("������� : " + avg ) ;
		
	}

}
