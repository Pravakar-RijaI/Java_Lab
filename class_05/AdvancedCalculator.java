class AdvancedCalculator extends Calculator
{
	public int operation(int a, int b)
	{
		return a-b;
	}

	public int operation(int x, int y, int z)
	{
		return x+y+z;
	}

	public double operation(double p, double q)
	{
		return p+q;
	}
}