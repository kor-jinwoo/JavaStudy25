package ch01;

public class RandomMath {

	public static void main(String[] args) {
		
		int num = (int)(Math.random()*6)+1;
	
	System.out.println("주사위게임");
	
	if (num == 1) {
		System.out.println("1");
	}else if (num == 2) {
		System.out.println("2");
	}else if (num == 3) {
		System.out.println("3");
	}else if (num == 4) {
		System.out.println("4");
	}else if (num == 5) {
		System.out.println("5");
	}else if (num == 6) {
		System.out.println("6");
	}else {
		System.out.println("주사위고장");	
	}
		

	}

}
