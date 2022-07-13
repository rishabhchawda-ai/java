class complexSum
{
	int real;
	int imaginary;
	void getData(int r, int i)
	{
		real = r;
		imaginary = i;
	}
	void sum(complexSum c2)
	{
		complexSum c3 = new complexSum();
		c3.real = real + c2.real;
		c3.imaginary = imaginary + c2.imaginary;
		System.out.println(c3.real + "+ i "+c3.imaginary);
	}
	public static void main(String args[])
	{
		complexSum c1 = new complexSum();
		complexSum c2 = new complexSum();
		c1.getData(1,2);
		c2.getData(3,4);
		c1.sum(c2);
	}
}