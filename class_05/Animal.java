class Animal
{
	private String color;
	private String species;

	public Animal(String color, String species)
	{
		this.color = color;
		System.out.println("Color: " + this.color);
		this.species = species;
		System.out.println("Species: " + this.species);
	}
}