import java.util.Scanner;

class DivisibleByDemo
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number: " );
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		DivisibleBy divisibleBy = new DivisibleBy(num);
		divisibleBy.isDivisible();
		input.close();
	}
}