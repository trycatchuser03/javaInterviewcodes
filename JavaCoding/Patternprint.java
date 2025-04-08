package trycheck;

public class Patternprint {

	public static void main(String[] args) 
	{
		int num = 5;
		printnumbers(num);
		printcharacters(num);
	}
	
	static void printnumbers(int n)
	{		
		int k = 1;
		for(int i =1; i<=n;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print(k+" ");
				k=k+1;
			}
			System.out.println("");
		}
	}
	
	static void printcharacters(int n)
	{		
		for(int i =1; i<=n;i++)
		{
			for(int j=1; j<=i;j++)
			{
				System.out.print("*"+" ");
			}
			System.out.println(" ");
		}
	}

}
