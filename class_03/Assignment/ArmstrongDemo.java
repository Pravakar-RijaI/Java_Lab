import java.util.Scanner;

class ArmstrongDemo
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		Armstrong newNumber = new Armstrong(number);
		newNumber.checkArmstrong();
		input.close();
	}
}