package ch01;

import java.util.Scanner;

public class LogicalExam2 {

	public static void main(String[] args) {
		
		String id = "asdzxc";
		String pw = "123456";
		
		Scanner abc = new Scanner(System.in);
		
		System.out.print("���̵��Է�:");
		String id1 = abc.nextLine();
		System.out.println("�Է¿Ϸ�");
		
		System.out.println("��й�ȣ�Է�:");
		String pw1 = abc.nextLine();
		System.out.println("�Է¿Ϸ�");
		
		if((id.equals(id1)) & pw.equals(pw1)){
			System.out.println("�α��μ���");
			
		} else { 
			System.out.println("���̵� �Ǵ� �н����� ����ġ");
			
			abc.close();
			
		}

	}

}
