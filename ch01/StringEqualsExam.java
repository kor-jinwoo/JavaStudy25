package ch01;

public class StringEqualsExam {

	public static void main(String[] args) {
		
	String strval1 = "김진우";
	String strval2 = "김진우";
	String strval3 = new String("김진우");
		
	System.out.println(strval1 == strval2);
	System.out.println(strval1 == strval3);
	System.out.println("----------------");
	System.out.println(strval1.equals(strval2));
	System.out.println(strval1.equals(strval3));
		

	}

}
