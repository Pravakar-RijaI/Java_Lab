import java.util.Scanner;

class PalindromeDemo
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number: ");
		Scanner input = new Scanner(System.in);
		int number = input.nextInt();
		Palindrome newNumber = new Palindrome(number);
		newNumber.isPalindrome();
		input.close();
	}
}