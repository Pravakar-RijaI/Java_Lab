class SingleBaseClass
{
	private int attribute1;
	private String attribute2;

	public SingleBaseClass(int attribute1, String attribute2)
	{
		this.attribute1 = attribute1;
		this.attribute2 = attribute2;
	}

	public void display()
	{
		System.out.println("Attribute1 = " + this.attribute1 + "\n" + "Attribute2 = " + this.attribute2);
	}
}