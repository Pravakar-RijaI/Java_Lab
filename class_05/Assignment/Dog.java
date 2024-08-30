class Dog extends Animal
{
	private boolean isCute;

	public Dog(String color, String species, boolean isCute)
	{
		super(color,species);
		this.isCute = isCute;
		System.out.println("isCute: " + this.isCute);
	}
}