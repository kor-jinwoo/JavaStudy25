package ch01;

public class ConditionalExam {

	public static void main(String[] args) {
	
		int score = 95; // 스코어
		char grade = (score>90)? 'A' : (score>80)? 'B' : 'C';
	       // 스코어가 90점보다 높으면 A    // 스코어가 80점보다 높으면B 낮으면C
		System.out.println(score + "점은" + grade + "등급입니다.");
		

		
	}

}
