class CalculatorDemo
{
	public static void main(String[] args)
	{
		Calculator calculator = new Calculator();
		System.out.println("Sum: " + calculator.operation(4,5));
		System.out.println("Multiply: " + calculator.operation(4,5,9));
		System.out.println("Divide: " + calculator.operation(25.0,9.0)); 
	}
}