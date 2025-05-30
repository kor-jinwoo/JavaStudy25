package ch05.extended.school;

public class Student extends Person{
	// Person 객체의 자식 클래스
	// Student 객체를 생성하면 Person 객체부터 생성하고 Student 가 나중에 생성됨
	
	// 부모 클래스의 외적으로 추가된 필드
	private String studentID; // 학번
	private int grade; // 학년
	private int gpa; // 학점
	
	// Student student = new Student(이름.키.몸무게,나이,학번,학년,학점);
	public Student(String name, int height, int weight, int age, String studentIID, int grade, int gpa) {
		super(name, height, weight, age); // 부모 생성자의 값을 넣는다.
		
		this.studentID = studentIID;
		this.grade = grade;
		this.gpa = gpa;
		
	}
	
	// 부모 생성자 + 자식 기본생성자
	public Student(String name, int height, int weight, int age) {
		super(name, height, weight, age);
		
	}
	
	// 부모 기본생성자 + 자식 기본생성자용 
	public Student() {
		super();
		
	}
	
	// 자식 클래스의 게터 세터
	public String getStudentIID() {
		return studentID;
	}

	public int getGrade() {
		return grade;
	}

	public int getGpa() {
		return gpa;
	}

	public void setStudentIID(String studentIID) {
		this.studentID = studentIID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setGpa(int gpa) {
		this.gpa = gpa;
	}
	
	// 추가메서드
	public void show() {
		// 입력된 필드를 출력하는 메서드
		System.out.println("----------------------------");
		System.out.println("학생이름 : " + getName()); // 부모
		System.out.println("학생나이 : " + getAge());
		System.out.println("학생 키 : " + getHeight());
		System.out.println("학생 몸무게 : " + getWeight());
		System.out.println("----------------------------");
		System.out.println("학번 : " + getStudentIID()); // 자식
		System.out.println("학년 : " + getGrade());
		System.out.println("학점 : " + getGpa());
		
	}
	
	
	

}
