package ch03;

import java.util.Scanner;

public class ScoresExam {

	public static void main(String[] args) {

		Scanner in = new Scanner(System.in);

		int scores[] = new int[5];
		int sum = 0;
		
		for (int i = 0; i < scores.length; i++) {
			scores[i] = in.nextInt();
		}
		for (int i = 0; i < scores.length; i++) {
			sum += scores[i];
		}
		System.out.println("총점은 : " + sum);
		System.out.println("평균은 : " + sum/(double)scores.length);
	}

}
