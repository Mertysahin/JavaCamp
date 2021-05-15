
public class StudentManager extends UserManager
{
	
	public void signIn(User user) 
	{
		System.out.println("User Name: " + user.getUserName() + "\n" +"User Password: "+ user.getUserPassword()+ "\n");
		System.out.println("��renci ba�ar� ile giri� yapt� " + "\n");

	}
	public void add(Student student)
	{
		
		System.out.println("��renci Eklendi: "+ student.getStudentId());
		
	}
	
	public void remove(Student student)
	{
		System.out.println("��renci Silindi: "+ student.getStudentId());

	}
	
	public void joinCourse(Student student,String course)
	{
		student.setTakenCourse(course);
		System.out.println("Kursa ba�ar�yla kat�l�nd� : " + student.getTakenCourse());
		
	}
	
	
}
