package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		
	String strval1 = "±èÁø¿ì";
	String strval2 = "±èÁø¿ì";
	String strval3 = new String("±èÁø¿ì");
		
	System.out.println(strval1 == strval2);
	System.out.println(strval1 == strval3);
	System.out.println("----------------");
	System.out.println(strval1.equals(strval2));
	System.out.println(strval1.equals(strval3));
		

	}

}
