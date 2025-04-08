package trycheck;

public class fibnocciseries {

	public static void main(String[] args) 
	{
		int n = 10;
		
		fibnocci(n);
		//fibnocciwithrecursion(n);

	}
	
	static void fibnocci(int n)
	{
		int first = 0;
		int second = 1;
		
		System.out.print(first);
		
		for(int i=1; i<n; i++)
		{
			System.out.print("," +second);
			int digit = first + second;
			first = second;
			second = digit;
		}
		
	}
	
	static void fibnocciwithrecursion(int n)
	{
		for(int i=0; i<n;i++)
		{
			System.out.print(fibnoc(i)+",");
		}
	}
	
	static int fibnoc(int i)
	{
		if(i<=1)
			return i;
		
		return fibnoc(i-1)+fibnoc(i-2);
	}

}
