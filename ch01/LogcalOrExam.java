package ch01;

import java.util.Scanner;

public class LogcalOrExam {

	public static void main(String[] args) {
		// ���� �׽�Ʈ��
		// | ������ ��κ� ������ 2�� �̻��� ��� �Ǵ��ϴ� �뵵�� ���.
		// ������� ���̵� ����� ���� �ϳ��� �¾ƾ� ���̵�ã�⳪ ���ã��� ���°��.
		// (�������ִ����̵� == �Է��Ѿ��̵�) | (�������ִ���� == �Է��Ѻ��)
		//           false                       false           = false
		//           false                       true            = false
        //           true                        false           = false
		
		// Ű����� �Է¹��� ���ڰ� 2�� ����̰ų� 3�� ����ΰ��� ó���غ���.
		Scanner infut = new Scanner(System.in); // Ű����� �Է¹޴� ��ü
		System.out.println("2�� ����� 3�� ����ΰ��� Ȯ��");
		System.out.print(">>>");
		int value = infut.nextInt(); // ������ �Է¹޾� ������ ����.
		if ( (value % 2 == 0) || (value % 3 == 0) ) {
			// �Է°��� 2�� ���� �������� 0�̸� true
			// �Է°��� 3���� ���� �������� 0�̸� true
			System.out.println("2�� ��� �Ǵ� 3�� ����Դϴ�. : " + value);
		}else {
			System.out.println("2�� ��� �Ǵ� 3�� ����� �ƴմϴ�. : " + value);
			infut.close();
			
		}
		
		
		
	}

}
