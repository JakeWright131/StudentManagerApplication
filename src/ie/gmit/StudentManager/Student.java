package ie.gmit.StudentManager;

import java.util.*; // for Date dob

public class Student {

	//instance variables
	
	private String studentId;
	private String firstName;
	private String surname;
	private Course course;
	private Date dob;
	private Address address;
	
	
	
	public Student(String sid) {
		this.studentId = sid;
	}
	
	
	public Student(String sid, String fname, String sname, Date dob) {
		this(sid);
		this.firstName = fname;
		this.surname = sname;
		this.dob = dob;
		
	}
	
		public String getStudentId() {
		return studentId;
		
	}
		
		public void setStudentId(String studentId) {
			this.studentId = studentId;
	}
		
	
		public String getfirstName() {
		return this.firstName;
		
	}
	
		public String getCourse() {
		return this.course;
		
	}
	
	
	
	
	public void setName(String firstname) {
			this.firstName = firstname;
			
	}		
	
	public void setCourse(String course) {
		this.course = course;
	
	
	}
	
	
}
