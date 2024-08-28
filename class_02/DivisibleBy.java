class DivisibleBy
{
	private int num;

	public DivisibleBy(int num)
	{
		this.num = num;
	}
	
	public void isDivisible()
	{
		if(this.num % 3 == 0 && this.num % 5 == 0)
		System.out.println(this.num + " is divisible by 3 and 5 both.");

		else if(this.num % 3 == 0)
		System.out.println(this.num + " is divisible by 3.");
		
		else if(this.num % 5 == 0)
		System.out.println(this.num + " is divisible by 5.");

		else
		System.out.println(this.num + " is neither divisible by 3 nor 5.");
	}
}

