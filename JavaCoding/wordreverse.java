package trycheck;

public class wordreverse
{
	public static void main(String[] args) {

		String s1 = "hello Krishna Reddy";

		reverseword(s1);
		woreverseword(s1);

	}


	public static void reverseword(String s1)
	{
		//op: Reddy Krishna Hello
		StringBuilder rev = new StringBuilder();
		String [] split = s1.split(" ");

		for(int i = split.length-1; i>=0;i--)
		{
			rev = rev.append(split[i]).append(" ");
		}
		System.out.println(rev.toString().trim());
	}

	public static void woreverseword(String s1)
	{
		//op: Reddy Krishna Hello
		String [] split = s1.split(" ");
		String op = "";

		for(int i = split.length-1;i>=0;i--)
		{
			op = op+split[i]+" ";
		}

		System.out.println(op);
	}


}
