package ch02;

public class SwitchExam2 {
	
	public static void main(String[] args) {
		// �극��ũ�� ������ ����ġ��
		
		int time = (int)(Math.random()*6)+8;
		System.out.println("현재시각은" + time + "시");
			
		switch(time) {
		
		case 8 :
			System.out.println("출근준비를 한다");
			
		case 9 :
			System.out.println("회사에 도착한다");
			
		case 10 :
			System.out.println("일을한다");
			
		case 11 :
			System.out.println("더 열심히 일을 한다");
			
		case 12 :
			System.out.println("점심을 먹는다");
			
		case 13 :
			System.out.println("더더욱 열심히 일을 한다.");
			
			default :
				System.out.println("휴식");
		
		} //����ġ ����

	}

}
