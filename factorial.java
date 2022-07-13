import java.util.Scanner;
class factorial
{
	
	public static void main(String args[])
	{
		int fact=1,n;
		Scanner sc = new Scanner(System.in);
		System.out.print("enter number to find factorial:");
		n = sc.nextInt();

		for (int i=1; i<=n ; i++)
			{
				
				fact = fact * i;
			}
		System.out.println("factorial is:"+ fact);
		
	}
}