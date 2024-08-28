class User
{
	private String username;
	private String password;

	public User(String username, String password)
	{
		this.username = username;
		this.password = password;
	}
	
	public void authenticate(String username, String password)
	{
		if(this.username.equals(username) && this.password.equals(password))
			System.out.println("You are authorized to login.");
		else
			System.out.println("Invalid Credentials");
	}
}