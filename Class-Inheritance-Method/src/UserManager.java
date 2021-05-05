public class UserManager {
	public void add(User user) {
		System.out.println("ID : " + user.getId());
		System.out.println("First Name : " + user.getFirstName());
		System.out.println("Last Name : " + user.getLastName());
		System.out.println("EMAIL : " + user.getEmail());
		System.out.println("Course Name : " + user.getCourse());
	}
}
