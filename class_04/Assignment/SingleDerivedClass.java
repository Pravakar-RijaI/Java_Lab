class SingleDerivedClass extends SingleBaseClass
{
	private int attribute3;

	public SingleDerivedClass(int attribute1, String attribute2, int attribute3)
	{
		super(attribute1, attribute2);
		this.attribute3 = attribute3;
	}

	public void display()
	{
		super.display();
		System.out.println("Attribute3 = " + this.attribute3);
	}
}