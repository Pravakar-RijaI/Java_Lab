class Fibo
{
	private int noOfTerms;
	private int firstTerm = 0;
	private int secondTerm = 1;
	private int nextTerm;

	public Fibo(int noOfTerms)
	{
		this.noOfTerms = noOfTerms;
	}

	public void printTerms()
	{
		while(this.noOfTerms > 0)
		{
			System.out.print(this.firstTerm + ", ");
			this.nextTerm = this.firstTerm + this.secondTerm;
			this.firstTerm = this.secondTerm;
			this.secondTerm = this.nextTerm;
			this.noOfTerms--;
		}
	}
}
