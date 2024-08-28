class Citizen
{
	private String name;
	private String nationality;
	private int age;

	public Citizen(String name, String nationality, int age)
	{
		this.name = name;
		this.nationality = nationality;
		this.age = age;
	}

	public void canVote()
	{
		if(this.nationality.equalsIgnoreCase("Nepali"))
		{
			if(this.age >= 18)
				System.out.println(this.name + ", You can Vote.");
			else
				System.out.println(this.name + ", You cannot Vote.");
		}
		else
			System.out.println(this.name + ", You cannot Vote.");
	}
}