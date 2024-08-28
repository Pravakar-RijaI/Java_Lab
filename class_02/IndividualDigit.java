class IndividualDigit
{
	private int num;
	private int digit;

	public IndividualDigit(int num)
	{
		this.num = num;
	}
	
	public void printDigits()
	{
		int temp = num;
		while(temp > 0)
		{
			digit = temp % 10;
			temp /= 10;
			System.out.println(digit);
		}
	}
}