package javaCoursesDemo;

public class CourseManager {
		public void courseName(Course course) {
			System.out.println("Kurs Adý : " + course.name);
		}
		
		public void courseTime(Course course) {
			System.out.println("Kurs Süresi : " + course.time + " Saat");
		}
		
		public void courseTeacherName(Course course) {
			System.out.println("Eðitimci'nin Adý : " + course.teacherName);
		}
}
