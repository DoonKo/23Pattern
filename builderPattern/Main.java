package builderPattern;

public class Main {

	public static void main(String[] args) {
	//	Student s1 = new Student("DD" , 23 , "Latha");
		Student s1 = new StudentBuilder()
				.create()
				.addAge(21)
				.addName("RR")
				.addSchool("Tokyo")
				.build();
		
		System.out.println(s1);
	}

}
