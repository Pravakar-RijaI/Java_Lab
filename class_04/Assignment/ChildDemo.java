class ChildDemo
{
	public static void main(String[] args)
	{
		Child child = new Child();
		child.setnoOfToys(3);
		System.out.println("I have " + child.getnoOfToys() + " toys!!");
		child.isStrong();
		child.isBeautiful();
	}
}