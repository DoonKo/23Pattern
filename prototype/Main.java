package prototype;

public class Main {

	public static void main(String[] args) {
		Student st = new Student("Thaw Thaw",23,"Latha");
		
		Student std1 = (Student)st.clone();
		std1.setName("Thu Thu Thaw");
		System.out.println("Name::"+std1.getName());
		System.out.println("Age::"+std1.getAge());
		System.out.println("School::"+std1.getSchool());
		
		System.out.println("Name::"+st.getName());
	}

}
