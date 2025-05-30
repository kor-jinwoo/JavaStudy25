package ch05.extended.phone;

public class DmbCellPhone extends CellPhone { // 자식 클래스
	int channe1; // 자식 필드추가 (디엠비폰은 방송을 볼수있는 기능이 추가됨)
	
	//생성자 -> 매개값을 입력받아 초기값을 진행
	public DmbCellPhone(String model, String color, int channe1) {
		this.model = model; // 부모필드
		this.color = color;
		this.channe1 = channe1; // 자식필드
	}
	// 메소드 -> 자식 클래스에 추가된 기능
	void turnOnDmb() {
		System.out.println("채널" + channe1 + "번 DMB방송 수신을 시작합니다.");
	}
	void changeChannelDmb(int channel) {
		this.channe1 = channel; // 채널 번호를 입력받아 채널 변경진행
		System.out.println("채널을" + channel + "번으로 변경합니다.");
	} // dmb채널변경
	void turnOffDmb() {
		System.out.println("DMB방송 수신을 종료합니다.");
	}
	
}
