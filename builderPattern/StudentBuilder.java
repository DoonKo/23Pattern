package builderPattern;

public class StudentBuilder {
	private Student student;
	public StudentBuilder create() {
		student = new Student();
		return this;
	}
	
	public StudentBuilder addName(String name) {
		student.setName(name);
		return this;
	}
	
	
	public StudentBuilder addAge(int age) {
		student.setAge(age);
		return this;
	}
	
	public StudentBuilder addSchool(String school) {
		student.setSchool(school);
		return this;
	}
	
	public Student build() {
		return student;
	}
}
