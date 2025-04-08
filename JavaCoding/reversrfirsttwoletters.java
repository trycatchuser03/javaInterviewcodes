package trycheck;

public class reversrfirsttwoletters
{
	public static void main(String[] args)
	{

		String s1 = "apple";
		reverse(s1);

		String s2 = "Hello kumar Reddy";
		reversefirstword(s2);
	}

	private static void reversefirstword(String s2)
	{

		String [] split = s2.split(" ");

		char[] c = split[0].toCharArray();

		String rev = "";
		for (int i = c.length-1;i>=0;i-- )
		{
			rev = rev+c[i];
		}

		for(String name: split)
		{
			
			if(!name.equalsIgnoreCase(split[0]))
			{
				rev = rev+" "+name;
			}
		}
		System.out.println(rev);
	}

	public static  void reverse(String ip)
	{
		String rev = "";
		char [] c = ip.toCharArray();

		for(int i = c.length-4;i>=0;i-- )
		{
			rev = rev+c[i];
		}

		for(int i = 2;i<=c.length-1;i++)
		{
			rev = rev+c[i];
		}

		System.out.println(rev);
	}

}
