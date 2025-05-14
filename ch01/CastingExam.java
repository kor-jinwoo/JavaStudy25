package ch01;

public class CastingExam {

	public static void main(String[] args) {
		// 강제타입변환 (Casting)
		// 큰 크기의 타입은 작은 크기에 타입으로 자동변환 할 수 없다.
		// int(21억) > byte 타입으로 담으면 누수가 발생한다.
		// 이것을 누수가 발생해도 강제로 적용하는 방법을 강제타입변환 이라고한다.
		
		int intValue = 123456789 ;
		byte byteValue = (byte) intValue ; // () 강제로 byte 타입으로 변환
		// Type mismatch: cannot convert from int to byte
		
		System.out.println("int 타입값 출력 : " + intValue);
		System.out.println("byte 타입값 출력 : " + byteValue);
		// byte타입의 8bit를 만들고 앞에값을 날려버림.
		// 111010110111100110100010101
        //                  > 00010101 <
		
		int kor = 85;
        int eng = 99;
        int mat = 97;
        
        int total = kor + eng + mat;
        System.out.println("------성적표------");
        System.out.println("국영수 총점 : " + total);
        
        double avg = total / 3 ; // 자동타입 변환됨.
        System.out.println("평균점수 : " + avg ) ;
        // 문제 : 어떤값을 계산해도 소수점이 0으로 나옴
        // 이유 : int타입 total이 3으로 나누어짐
        // 해결 : double 타입으로 강제타입변환 후 3으로 나눠야함
       
        avg = (float)total / 3 ; // 강제타입 변환됨.
        System.out.println("평균점수 : " + avg ) ;
		
	}

}
