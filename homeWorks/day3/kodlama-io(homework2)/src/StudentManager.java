
public class StudentManager extends UserManager
{
	
	public void signIn(User user) 
	{
		System.out.println("User Name: " + user.getUserName() + "\n" +"User Password: "+ user.getUserPassword()+ "\n");
		System.out.println("Öðrenci baþarý ile giriþ yaptý " + "\n");

	}
	public void add(Student student)
	{
		
		System.out.println("Öðrenci Eklendi: "+ student.getStudentId());
		
	}
	
	public void remove(Student student)
	{
		System.out.println("Öðrenci Silindi: "+ student.getStudentId());

	}
	
	public void joinCourse(Student student,String course)
	{
		student.setTakenCourse(course);
		System.out.println("Kursa baþarýyla katýlýndý : " + student.getTakenCourse());
		
	}
	
	
}
