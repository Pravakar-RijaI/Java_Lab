class PrintSeries
{
	private int value = 7;
	private int noOfTerms;

	public PrintSeries(int noOfTerms)
	{
		this.noOfTerms = noOfTerms;
	}

	public void printTerms()
	{
		for(int i = 0; i < noOfTerms; i++)
		{
			System.out.print(value + ", ");

			if(value % 2 == 0)
				value /= 2;

			else
				value = value * 3 + 1;
		}
	}
}				