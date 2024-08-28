import java.util.Scanner;

class UserDemo
{
	public static void main(String[] args)
	{
		User user = new User("Pravakar_Rijal","Pravakar@123");
		Scanner input = new Scanner(System.in);
		System.out.println("Enter Username: ");
		String username = input.next();
		System.out.println("Enter Password: );
		String password = input.next();
		user.authenticate(username, password);
		input.close();
	}
}