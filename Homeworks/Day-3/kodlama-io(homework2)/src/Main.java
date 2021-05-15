
public class Main {

	public static void main(String[] args)
	{
		User user1 = new User("mertsahin", "4532", "Mertcan", "ŞAHİN", "merty1304@gmail.com");
		Instructor instructor1 = new Instructor("1", "engindemir", "engin123", "Engin", "Demiroğ", "engin@gmail.com", "Java");
		Student student1 = new Student("1", "merttsahin", "mert123", "mertcan", "şahin", "merty1304@gmail.com", "Java");
		
		UserManager userManager = new UserManager();
		userManager.signIn(instructor1);
		userManager.add(user1);
		
		StudentManager studentManager = new StudentManager();
		studentManager.joinCourse(student1, "Python");
		System.out.println(student1.getTakenCourse());
				
		InstructorManager instructorManager = new InstructorManager();
		instructorManager.giveCourse(instructor1, "Python");
		
		
	}

}
