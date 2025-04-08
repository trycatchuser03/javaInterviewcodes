package trycheck;

public class Tomorrow {
	
	//input: tomorrow
	//output: t$m$$rr$$$w
	public static void main(String[] args) 
	{
	
		String s1 = "tomorrow";
		int count = 1;
		String s2 = "";
		
		
		char [] chk = s1.toCharArray();
		
		for(char c: chk)
		{
			if(c == 'o')
			{
				for(int i=0; i<count;i++)
				{
					s2 = s2+'$';
				}
				count++;
			}
			else
			{
				s2=s2+c;
			}
		}
		
		System.out.println(s2);

	}

}
