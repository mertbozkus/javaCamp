package javaCoursesDemo;

public class Course {
	
	public Course() {
		System.out.println("Kurslar atandý");
	};
	
	public Course(String name, int time, String teacherName) {
		this();
		this.name = name;
		this.time = time;
		this.teacherName = teacherName;
	}
	
	String name;
	int time;
	String teacherName;
	
}
