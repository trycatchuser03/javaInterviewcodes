package trycheck;

public class revonlyleter 
{
	public static void main(String[] args) 
	{
		String s1 = " jeys @mail.com#";
		
		reversonyletter(s1);

	}
	
	public static void reversonyletter( String s2)
	{
		char [] chk = s2.toCharArray();
		
		StringBuilder br = new StringBuilder();
		String op = "";
		
		for(char c: chk)
		{
			if(Character.isAlphabetic(c))
			{
				br.append(c);
			}
		}
		
		for(int i =br.length()-1;i>=0;i--)
		{
			op+=br.charAt(i);
		}
		
		System.out.println(op);
	
	}

}
