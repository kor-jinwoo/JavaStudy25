package ch01;

import java.util.Scanner;

public class LogcalAndExam {

	public static void main(String[] args) {
		// ���� �׽�Ʈ��.
		// & ������ ��κ� ������ �ΰ� �̻��� ��� �Ǵ��ϴ� �뵵�� ���. 
		// ���� ��� ���̵�,����� �Ѵ� �¾ƾ� �α����� �����ϴ� ���.
		// (�������ִ� ���̵� == �Է��� ���̵�) & (�������ִ� ��� == �Է��� ���)
		//            false                           false          = false
		//            true                           false           = false
		//            true                           true            = true
		
		Scanner infut = new Scanner(System.in); // Ű����� �Է��� �� �ִ� ��ü ����
		System.out.println("������ �Է��ϸ� ��ҹ��ڳ� ���ڸ� �Ǵ��ص帲");
		System.out.println("�����ڵ�ǥ�� �����Ͽ� ���α׷��� �����Ͽ����ϴ�");
		System.out.print("�����Է� >>");
		
		int charCode = infut.nextInt(); // Ű����� �������� �Էµǰ� ������ ��.
		
		// if(���Ǵܹ�) {���Ǵܹ��� true ���϶� ����Ǵ� ��}
		// else {���Ǵܹ��� false ���϶� ����Ǵ� ��}
		if( (charCode >= 65) && (charCode <= 90)){
			// �Էµ� ���� ���� 65 �̻��̰� 90 ���ϸ� �빮��.
			System.out.println("���� �Էµ� ���ڴ� �빮�� " + (char)charCode + " �Դϴ�.");
			
	    } else if ((charCode >= 97) && (charCode <= 122 )) {
		// ������ ����� if ���� false �� ��� �� �񱳸� �ϰ� ��.
		// �Էµ� ���� ���� 97 �̻��̰� 122 �����̸� �ҹ���.
		// &���� && �� ����ϸ� ���� ó���� ��. (�ڵ�Ʃ��)
		System.out.println("���� �Էµ� ���ڴ� �ҹ��� " + (char)charCode + "�Դϴ�");
		
		} else if (!(charCode < 48) && !(charCode > 57)){
		// NAND�����̴�. ��𸣰��ǹ�Ģ�� �ľ��ϸ� NOR
		// 48���� �����ʰ� 57���� ũ�� ���� �񱳹�.
		
		System.out.println("���� �Էµ� ���ڴ� �����ڵ��� ���������� �Դϴ�. : " + (char)charCode);
		
	}else {
		System.out.println("�빮��,�ҹ���,������ �����ڵ� ǥ ���� �����Դϴ�");
		System.out.println("���α׷��� �ٽ� �������ּ���.");
		
		infut.close();
		
		} // ����if�� ����
		
	} // ���θ޼��� ����

} // Ŭ��������
