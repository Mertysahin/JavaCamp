
public class InstructorManager extends UserManager
{
	
	public void signIn(User user) 
	{
		System.out.println("User Name: " + user.getUserName() + "\n" +"User Password: "+ user.getUserPassword()+ "\n");
		System.out.println("E�itmen ba�ar� ile giri� yapt� " + "\n");

	}
	public void add(Instructor instructor)
	{
		
		System.out.println("E�itmen Eklendi: "+instructor.getInstructorId());
		
	}
	public void remove(Instructor instructor)
	{
		System.out.println("E�itmen silindi: "+instructor.getInstructorId());
	}
	
	public void giveCourse(Instructor instructor,String Course)
	{
		instructor.setCourses(Course);
		System.out.println("Kursa e�itmene atand� : " + instructor.getCourses());
		
	}
}
