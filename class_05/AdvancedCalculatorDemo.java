class CalculatorDemo
{
	public static void main(String[] args)
	{
		AdvancedCalculator advancedCalculator = new AdvancedCalculator();
		System.out.println("Difference: " + advancedCalculator.operation(5,2));
		System.out.println("Sum: " + advancedCalculator.operation(4,5,6));
		System.out.println("Sum: " + advancedCalculator.operation(25.0,9.0)); 
	}
}