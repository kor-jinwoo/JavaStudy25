package ch01;

import java.util.Scanner;

public class IfExam2 {

	public static void main(String[] args) {
		
		System.out.println("�ֹι�ȣ�� �Է����ּ���. (-����)");
		Scanner in = new Scanner(System.in);
		
		String ssn = in.next();
		
		char ssn2 = ssn.charAt(6); // ����Ȯ������
		int num = Character.getNumericValue(ssn2);
		
		if (num % 2 == 0) {
			System.out.println("���� : ����");
		}else if (num % 2 == 1) {
			System.out.println("���� : ����");
		}else {
			System.out.println("�ٽ� �Է����ּ���.");
		} // ���� ���� if�� ����
		
		int year = Integer.parseInt(ssn.substring(0,2)); // �¾ �⵵ ����
		
		if (num == 1 || num == 2 || num == 5 || num == 6) {
			System.out.println("���� : " + (2025 - (1900 + year) + 1));
		}else if (num == 3 || num == 4 || num == 7 || num == 8) {
			System.out.println("���� : " + (2025 + (2000 + year) + 1));
		}else {
			System.out.println("�ٽ� �Է����ּ���.");
	}
		
		int month = Integer.parseInt(ssn.substring(2,4)); // �¾ �� ����
		
		if (month <= 0 || month >= 13) {
			System.out.println("�ٽ� �Է����ּ���.");
		}else if (month >= 3 && month <= 5) {
			System.out.println("���� �¾.");
		}else if (month >= 6 && month <= 8) {
			System.out.println("������ �¾.");
		}else if (month >= 9 && month <= 11) {
			System.out.println("������ �¾.");
		}else {
			System.out.println("�ܿ￡ �¾.");
		}// if�� ����
		
		in.close();
		
	}// ���θ޼��� ����

}// Ŭ���� ����
