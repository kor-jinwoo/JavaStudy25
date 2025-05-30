package ch05.extended.school;

public class Teacher extends Person {
	private String teacherID; // 교직원번호
	private int grade; // 담당학년
	private int room; // 당당교실
	private int Stcount; // 학생수
	
	public Teacher() { // 기본생성자
		super();
	}
	
	// 게터 세터 메서드
	public String getTeacherID() {
		return teacherID;
	}

	public int getGrade() {
		return grade;
	}

	public int getRoom() {
		return room;
	}

	public int getStcount() {
		return Stcount;
	}

	public void setTeacherID(String teacherID) {
		this.teacherID = teacherID;
	}

	public void setGrade(int grade) {
		this.grade = grade;
	}

	public void setRoom(int room) {
		this.room = room;
	}

	public void setStcount(int stcount) {
		Stcount = stcount;
	}

	@Override
	public String toString() {
		return "Teacher [teacherID=" + teacherID + ", grade=" + grade + ", room=" + room + ", Stcount=" + Stcount
				+ ", getName()=" + getName() + ", getHeight()=" + getHeight() + ", getWeight()=" + getWeight()
				+ ", getAge()=" + getAge() + "]";
	}
	
	
	
}
