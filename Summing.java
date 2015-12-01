
public class Summing 
{
	public static int sumIterative(int upperLimit)
	{
		int sum = 0;
		
		//for(int i = 0; i <= upperLimit; i += 2)
		for(int i = upperLimit; i >= 0; i -= 2) 
		{
			sum = sum + i; // sum += i;
		}
		return sum;
	}
	
	public static int sumRecursion(int upperLimit)
	{
		int sum = 0;
		if ( upperLimit == 0)
		{
			sum = 0;
		}
		else
		{
			return upperLimit + sumRecursion(upperLimit - 2);
		}
		
		
		return sum;
	}

	public static void main(String[] args) 
	
	{
		int x;
		System.out.println(x = sumIterative(20));
		System.out.println(x = sumRecursion(20));

	}

}
