
public class InstructorManager extends UserManager
{
	
	public void signIn(User user) 
	{
		System.out.println("User Name: " + user.getUserName() + "\n" +"User Password: "+ user.getUserPassword()+ "\n");
		System.out.println("Eðitmen baþarý ile giriþ yaptý " + "\n");

	}
	public void add(Instructor instructor)
	{
		
		System.out.println("Eðitmen Eklendi: "+instructor.getInstructorId());
		
	}
	public void remove(Instructor instructor)
	{
		System.out.println("Eðitmen silindi: "+instructor.getInstructorId());
	}
	
	public void giveCourse(Instructor instructor,String Course)
	{
		instructor.setCourses(Course);
		System.out.println("Kursa eðitmene atandý : " + instructor.getCourses());
		
	}
}
