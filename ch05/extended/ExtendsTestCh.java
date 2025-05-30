package ch05.extended;

public class ExtendsTestCh extends ExtandsTast {

	int field2;
	void method2() {
		// 실행문
		
	} // 메소드종료
		public static void main(String[] args) {
			
			ExtendsTestCh b = new ExtendsTestCh(); // 객체생성
			b.field1 = 10;
			b.method1();
			
			b.field2 = 20;
			b.method2();
			
		}
	
	
} // 자식 클래스로 부모객체를 활용한다
