
public class User 
{	
	private String userName;
	private String userPassword;
	private String firstName;
	private String lastName;
	private String userEmail;
	
	
	
	public User(String userName, String userPassword, String firstName, String lastName, String userEmail)
	{
		this.userName=userName;
		this.userPassword=userPassword;
		this.firstName=firstName;
		this.lastName=lastName;
		this.userEmail=userEmail;
		
	}
	public User()
	{
		
	}



	public String getUserName() {
		return userName;
	}
	
	public void setUserName(String userName) {
		this.userName = userName;
	}


	public String getUserPassword() {
		return userPassword;
	}



	public void setUserPassword(String userPassword) {
		this.userPassword = userPassword;
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



	public String getUserEmail() {
		return userEmail;
	}



	public void setUserEmail(String userEmail) {
		this.userEmail = userEmail;
	}
}

