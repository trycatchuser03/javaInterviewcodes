package trycheck;

public class specialcharacterchk
{
	public static void main(String[] args)
	{
		
		String s1 = " jeyesh @gmail123.com";
		specialcharacter(s1);
		letterchk(s1);
		sumofdigits(s1);
		allinonewithcount(s1);
		replaceall(s1);
	}

	public static  void specialcharacter(String ip)
	{
		StringBuilder br = new StringBuilder();
		char[] chk = ip.toCharArray();
		int count = 0;
		for(char c:chk)
		{
			if(!Character.isLetterOrDigit(c) && !Character.isWhitespace(c))
			{
				count+=1;
				br.append(c);
			}
		}

		System.out.println("specialcharacter count"+count);
		System.out.println("specialcharacter: " +br);
	}
	
	static void letterchk(String s2)
	{
		StringBuilder br = new StringBuilder();
		char[] chk = s2.toCharArray();
		
		for(char c: chk)
		{
			if(Character.isAlphabetic(c) || Character.isWhitespace(c))
			{
				br.append(c);
			}
		}
		System.out.println("character with space:"+br.toString().trim());
	}
	
	static void sumofdigits(String s2)
	{
		char[] chk = s2.toCharArray();
		int sum = 0;
		for(char c: chk)
		{
			if(Character.isDigit(c))
			{
				sum += c - '0';
			}
		}
		System.out.println(sum);
	}
	
	static void allinonewithcount(String s2)
	{
		char[] chk = s2.toCharArray();
		int charactercount = 0, numbercount =0, sccount=0;
		String charact = "", numberi = "", sc = "";
		
		for(char c: chk)
		{
			if(Character.isAlphabetic(c))
			{
				charactercount++;
				charact+=c;				
			}
			else if(Character.isDigit(c))
			{
				numbercount++;
				numberi+=c;				
			}
			else if (!Character.isAlphabetic(c) && !Character.isDigit(c) && !Character.isWhitespace(c))
			{
				sccount++;
				sc+=c;
			}
		}
		
		System.out.println("Alphabetic: "+charact);
		System.out.println("Alphabetic count: "+charactercount);
		
		System.out.println("Numeric: "+numberi);
		System.out.println("Numeric count: "+numbercount);
		
		System.out.println("Special Character: "+sc);
		System.out.println("Special Character count: "+sccount);
	}
	
	static void replaceall(String s2)
	{
		System.out.println("Alphabets: "+ s2.replaceAll("[^a-zA-Z]", ""));
		System.out.println("Numbers: "+ s2.replaceAll("[^0-9]", ""));
		System.out.println("specialcharacter: "+ s2.replaceAll("[a-zA-Z0-9\\s]", "").trim());
		
	}

}
