class Child implements Father, Mother
{
	private int noOfToys;
	
	public int getnoOfToys()
	{
		return this.noOfToys;
	}

	public void setnoOfToys(int noOfToys)
	{
		this.noOfToys = noOfToys;
	}

	public void isStrong()
	{
		System.out.println("Iam Strong.");
		System.out.println(this.hasBlueEyes ? "I have blue eyes." : "I don't have blue eyes.");
	}

	public void isBeautiful()
	{
		System.out.println("Iam Beautiful");
		System.out.println(this.hasDimples ? "I have dimples." : "I don't have dimples.");
	}
}