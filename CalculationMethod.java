class CalculationMethod 
{
	int x,y,z;

	Calculation(int a, int b, int c)
	{
		x=a;
		y=b;
		z=c;
	}

	void sum()
	{
		int res = x+y+z;
		System.out.println(res);
	}

	public static void main(String[] args) 
	{
		Calculation c1 = new Calculation(10,20,30);
		c1.sum();
		Calculation c2 = new Calculation(10,10,10);
		c2.sum();
	}
}
