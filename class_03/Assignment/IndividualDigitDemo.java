import java.util.Scanner;

class IndividualDigitDemo
{
	public static void main(String[] args)
	{
		System.out.println("Enter a Number: ");
		Scanner input = new Scanner(System.in);
		int num = input.nextInt();
		IndividualDigit individualDigit = new IndividualDigit(num);
		individualDigit.printDigits();
		input.close();
	}
}