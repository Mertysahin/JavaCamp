
public class Student extends User
{
	
	private String studentId;
	private String takenCourse;
	
	
	public Student(String studentId,String userName,String userPassword,String firstName,String lastName,String userEmail,String takenCourse)
	{
		super(userName,firstName,lastName,userEmail,userPassword);
		this.studentId=studentId;
		this.takenCourse=takenCourse;
	}


	public String getStudentId() {
		return studentId;
	}


	public void setStudentId(String studentId) {
		this.studentId = studentId;
	}


	public String getTakenCourse() {
		return takenCourse;
	}


	public void setTakenCourse(String takenCourse) {
		this.takenCourse = takenCourse;
	}
}
