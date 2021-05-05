public class Main {

	public static void main(String[] args) {
		
		Student student = new Student();
		
		student.setCourseNumber(142);
		student.setId(241);
		student.setFirstName("Mert");
		student.setLastName("Bozkus");
		student.setEmail("m.mertbozkus@gmail.com");
		student.setCourse("Java");
		
		Instructor instructor = new Instructor();
		
		instructor.setUserName("Engin_Demirog");
		instructor.setId(999);
		instructor.setFirstName("Engin");
		instructor.setLastName("Demirog");
		instructor.setEmail("engindemirog@gmail.com");
		instructor.setCourse("Java");
		
		UserManager userManager = new UserManager();
		
		StudentManager studentManager = new StudentManager();
		
		InstructorManager instructorManager = new InstructorManager();
		
		studentManager.add(student);
		userManager.add(student);
		
		System.out.println("---------------------------------------");
		
		instructorManager.add(instructor);
		userManager.add(instructor);
		
	}

}
