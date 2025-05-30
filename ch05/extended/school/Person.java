package ch05.extended.school;

public class Person {
	//	부모클래스로 자식이 상속받는다.
	
	private String name;
	private int height;
	private int weight;
	private int age;
	
	public Person(String name, int height, int weight, int age) {
		// Person person = new Person(이름,키,몸무게,나이);
		super(); // 부모생성자 -> superclass (자바의 최상위 부모객체) -> 색략가능
		this.name = name;
		this.height = height;
		this.weight = weight;
		this.age = age;
	}

	public Person() { // 기본생성자 = new Person();
		super();
	}
	
	//	게터 세터 메서드 (필드가 개인적으로 선언되었기 때문에 메서드로 접근 -> 캡슐화)
	public String getName() {
		// 이름 필드 값을 리턴한다.
		return name + "님";
	}

	public void setName(String name) {
		// 파라미터로 받은 이름을 필드로 전달한다.
		this.name = name;
	}

	public int getHeight() {
		// 키 필드 값을 리턴한다.
		return height;
	}

	public void setHeight(int height) {
		// 파라미터로 받은 키를 필드로 전달한다.
		this.height = height;
	}

	public int getWeight() {
		// 몸무게 필드 값을 리턴한다.
		return weight;
	}

	public void setWeight(int weight) {
		// 파라미터로 받은 몸무게를 필드로 전달한다.
		this.weight = weight;
	}

	public int getAge() {
		// 나이 필드 값을 리턴한다.
		return age;
	}

	public void setAge(int age) {
		// 파라미터로 받은 나이를 필드로 전달한다.
		this.age = age;
	}
	
	
	
	
	
}
