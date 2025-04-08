package trycheck;

public class Reverseonlybigwords {

	public static void main(String[] args) {
		
		String s1 = "reverse only big words automations";
		reversechk(s1);

	}
	
	public static void reversechk(String s2)
	{
		String[] words = s2.split(" ");
		int[] lengths = new int[words.length];
				
		for(int i=0;i<words.length;i++)
		{
			lengths[i]=words[i].length();
		}
		
		int max =0;
		for(int num: lengths)
		{
			if(num>max)
			{
				max=num;
			}
		}
		
		StringBuilder sb = new StringBuilder();
		String output = "";
		
		for(String word: words)
		{
			if(word.length()==max)
			{
				char[] chk = word.toCharArray();
				for(int i=chk.length-1;i>=0;i--)
				{
					output = output+chk[i];
				}
				sb.append(output).append(" ");
			}
			else
			{
				sb.append(word).append(" ");
			}
		}
		System.out.println(sb.toString().trim());
	}

}
