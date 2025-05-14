package ch01;

public class VarExam {

	public static void main(String[] args) {
		// 변수 선언 테스트
		
		int x = 1 ; // 정수타입 x 변수에 1을 넣는다.
		
		char y = 65 ; // char는 문자타입이지만 숫자로 변환되기도 함.
					 // 컴퓨터는 문자를 유니코드로 변환하여 처리함.
					 // 유니코드 표에 65는 A를 의미함.
		
		char z = 'A' ; // char 타입의 z 변수에 문자 A를 넣는다.
		
		System.out.println("int x = " + x);
		System.out.println("char y = " + y);
		System.out.println("char z = " + z);
		
		char z1 = 'b' ; // 문자로 쓸건지 문자열로 쓸건지 결정필요.
		
		// 변수의 선언
		
		int x1 ; // 초기화가 안된 변수.
		x1 = 10 ; // 변수에 초기값을 10으로 넣음.
		System.out.println(x1);
		
		// 다중 변수 선언
		
		int kor, mat, eng, total, avg ;
		
		kor = 90 ;
		mat = 80 ;
		eng = 70 ;
		total = kor + mat + eng ; // 총점
		avg = total / 3 ; // 평균
		
		System.out.println("총점 : " + total);
		System.out.println("평균 : " + avg);
		// 코드상에 문제는 아니지만 평균 값에 소주점이 사라짐.
		// 석차를 구현하는 코딩에서 문제가 생길수 있다.
		
		// 변수 작성 규칙
		// 변수는 첫글자가 영문이여야 되며 $, _을 사용할 수 있다.
		// 관례로 첫글자 영문은 소문자로, 2번째 단어부터는 대문자로 시작.
		
		int price, $price, _price ; // 가급적이면 특수문자 사용 제외
		//int 1v ;
		//int @speed ;
		//int $#value ;
		
		char firstname = '김' ;
		char firstName = '이' ;
		char firsTname = '박' ;
		char firStname = '정' ;
		
		System.out.println("성 : " + firstname);
		System.out.println("성 : " + firstName);
		System.out.println("성 : " + firsTname);
		System.out.println("성 : " + firStname);
		// 변수명에 대소문자는 다른 변수로 인식함.
		
		// 변수명에 예약어는 사용할수없음.
		// 예약어는 자바에서 이미 사용중인 영문을 의미함.(변수, 클래스)
		//int char 등등 ;
		
		// 리터럴 (riteral) : 직접 입력된 값.
		
		int literal1 = 75 ; // 10진수
		int literal2 = 075 ; // 8진수
		int literal3 = 0b0011 ; // 2진수
		int literal4 = 0xA ; // 16진수
		
		System.out.println("10진수 75 :" + literal1);
		System.out.println("8진수 75 :" + literal2);
		System.out.println("2진수 0011 :" + literal3);
		System.out.println("16진수 A :" + literal4);
		
		
	}

}
