
public class CourseManagement 
{
	public void courseSelect(Courses selectedCourse)
	{
		System.out.println("Kurs se�imi ba�ar�l� ! "+ selectedCourse.courseName);
	}
	
	public void searchEducator(Educators arananEgitmen)
	{
		System.out.println("Arama Sonucu: "+ "\n" +arananEgitmen.educatorName +"\n"+ arananEgitmen.educatorYas);
	}
}
