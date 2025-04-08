package trycheck;

public class PrimeNumbers {

	public static void main(String[] args) 
	{
		int n=30;
		for(int i=1; i<n;i++)
		{
			if(isprime(i))
			{
				System.out.println("prime number: "+i);
			}
		}
	}
	
	static boolean isprime(int n)
	{
		if(n<=1) 
			return false;
		
		//i<=n/2 
		for(int i=2;i<=Math.sqrt(n);i++)
		{
			if(n%i==0)
				return false;
		}
		
		return true;
	}

}
