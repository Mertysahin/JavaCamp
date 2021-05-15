
public class Main {

	public static void main(String[] args) 
	{

		Courses course1 = new Courses(1,"Java","2 Ay boyunca s�recek Java Kursu");
		Courses course2= new Courses(2,"Python","2 Ay boyunca s�recek Python Kursu");
		Educators educator1 = new Educators(1,"Engin Demiro�",25);
		Educators educator2 = new Educators(2,"Mertcan �ahin",23);
		
		
		Courses[] courses = {course1,course2};
		for(Courses kurs : courses)
		{
			System.out.println(kurs.courseName);
		}
		
		System.out.println("----------------------------------");
		
		Educators[] educators = {educator1,educator2};
		for(Educators egitmen : educators)
		{
			System.out.println(egitmen.educatorName);
		}
		
		System.out.println("----------------------------------");

		CourseManagement courseManager = new CourseManagement();
		courseManager.courseSelect(course2);
		courseManager.searchEducator(educator1);

	}

}
