package eticaret.entities.concretes;

public class User 
{
	private int userId;
	private String firstName;
	private String lastName;
	private String email;
	private String parola;
	
	
	public User()
	{
		
	}


	public User(int userId,String firstName,String lastName, String email, String parola) {
		super();
		this.userId = userId;
		this.firstName=firstName;
		this.lastName=lastName;
		this.email = email;
		this.parola = parola;
	}


	public int getUserId() {
		return userId;
	}


	public void setUserId(int userId) {
		this.userId = userId;
	}


	public String getFirstName() {
		return firstName;
	}


	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}


	public String getLastName() {
		return lastName;
	}


	public void setLastName(String lastName) {
		this.lastName = lastName;
	}


	public String getEmail() {
		return email;
	}


	public void setEmail(String email) {
		this.email = email;
	}


	public String getParola() {
		return parola;
	}


	public void setParola(String parola) {
		this.parola = parola;
	}
}
