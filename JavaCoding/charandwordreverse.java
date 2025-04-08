package trycheck;

public class charandwordreverse
{
	public static void main(String[] args) {

		String s1 = "hello Krishna Reddy";

		reverse(s1);
		woreverse(s1);

	}

	public static  void reverse (String ip)
	{
		//op: yddeR anhsirK olleh
		StringBuilder reverse = new StringBuilder(ip);
		String op = reverse.reverse().toString();
		System.out.println(op);
	}

	public static  void woreverse (String ip)
	{
		//op: yddeR anhsirK olleh
		String [] split = ip.split(" ");
		String op = "";

		for(int i = split.length - 1; i>=0;i--)
		{
			String rev = "";
			char [] word = split[i].toCharArray();
			for(int j = word.length-1;j>=0;j--)
			{
				rev = rev+word[j];
			}
			op = op+rev+" ";
		}
		System.out.println(op.toString().trim());

	}



}
