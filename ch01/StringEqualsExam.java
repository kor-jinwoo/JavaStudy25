package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		
	String strval1 = "������";
	String strval2 = "������";
	String strval3 = new String("������");
		
	System.out.println(strval1 == strval2);
	System.out.println(strval1 == strval3);
	System.out.println("----------------");
	System.out.println(strval1.equals(strval2));
	System.out.println(strval1.equals(strval3));
		

	}

}
