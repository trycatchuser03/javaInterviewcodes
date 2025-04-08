package trycheck;

public class wordchglocsame
{
	public static void main(String[] args) {

		String s1 = "hello Krishna Reddy";

	
		reversespecword(s1);
		woreversespeword(s1);


	}

	public static void reversespecword(String s1)
	{
		//op: olloh anhsirK yddeR
		String [] split = s1.split(" ");
		StringBuilder rev = new StringBuilder();
		for(String word: split)
		{
			StringBuilder reverse = new StringBuilder(word);
			String val = reverse.reverse().toString();
			//op = op + val + " ";
			rev.append(val).append(" ");
		}
		System.out.println(rev.toString());
	}

	public static void woreversespeword(String s1)
	{
		//op: olloh anhsirK yddeR
		String [] split = s1.split(" ");
		String op = "";
		for(String word: split)
		{
			char [] c = word.toCharArray();
			String rev = "";
			for(int i = c.length-1;i>=0;i--)
			{
				rev = rev+c[i];
			}
			op = op+rev+" ";
		}
		System.out.println(op);
	}



}
