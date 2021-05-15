
public class Instructor extends User
{
	private String instructorId;
	private String courses;
	 
	
	public Instructor(String instructorId,String userName, String userPassword,String firstName,String lastName,String userEmail,String courses)
	{
		super(userName,firstName,lastName,userEmail,userPassword);
		this.instructorId=instructorId;
		this.courses=courses;
	}


	public String getInstructorId() {
		return instructorId;
	}


	public void setInstructorId(String instructorId) {
		this.instructorId = instructorId;
	}


	public String getCourses() {
		return courses;
	}


	public void setCourses(String courses) {
		this.courses = courses;
	}
}
