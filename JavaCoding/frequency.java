package trycheck;

public class frequency
{
	public static void main(String[] args)
	{
		String s1 = "hello jeyesh hello world hello check";

		frequencyy(s1);
	}

	public static  void frequencyy(String ip)
	{
		String [] split = ip.split(" ");
		int freq = 0;

		for(String word: split)
		{
			if(word.equalsIgnoreCase("Hello"))
			{
				freq+=1;
			}
		}
		System.out.println("Frequency of hello: "+freq);
	}

}
