package ch01;

import java.util.Scanner; // �ܺ� ���̺귯��

public class LogicalExam {

	public static void main(String[] args) {
		// ������ �����ڴ� ũ�� 5���� ������ �ִ�.
		// & << ���� (~�̰�) 2���� ������ ��� "��"�� ��� ��.
		// | << ���� (~�̰ų�) 2������ �Ѱ��� "��"�� ��� ��.
		// ! << ������ ���� ������ ������.
		// ^ << ��Ÿ�� ���� (������ �������� 1+1=0 ���� ����� ��)
		
		String loginid = "kkw";
		String loginpw = "1234";
		
		Scanner infut = new Scanner(System.in);
		// �ֿܼ� Ű����� ���� �о���� ��ü�� ������.
		
		System.out.print("�α����� ���̵� �Է��ϼ��� : ");
		String id = infut.nextLine();
		System.out.println("�Է��Ͻ� ���̵�� " + id + "�Դϴ�.");
		
		System.out.print("�α��� �� ��ȣ�� �Է��ϼ��� : ");
		String pw = infut.nextLine();
		System.out.println("===�� �� ��===");
		
		if( (loginid.equals(id)) & loginpw.equals(pw)){
			// ������ �ִ� ���̵�� Ű����� �Է��� ���̵� ������
			// �̰ų� or
			// ������ �ִ� �н������ Ű����� �Է��� �н����尡 ������
			System.out.println("���̵� �н����尡 ��ġ�մϴ�.");
			System.out.println("===�α��� ����===");
			
		} else { // if���� fales ó����
			System.out.println("���̵� �н����尡 �ٸ��ϴ�.");
			System.out.println("===�α��� ����===");
		} // if�� ����
		
		infut.close();
		

	} // ���θ޼��� ����

} // Ŭ���� ����
