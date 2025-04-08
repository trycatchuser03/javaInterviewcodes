package trycheck;

public class alternatewordrev
{
	
	public static void main(String[] args)
	{
		String s1 = "hi jeyesh how are you";
		//op: hi hseyej how era you

		altreverse(s1);
		altworeverse(s1);
		altworeversechk(s1);
	}

	public static void altworeversechk(String s1)
	{
		String[] split = s1.split(" ");
		String rev = " ";

		for(int i = 0; i< split.length;i++)
		{
			if(i%2==0)
			{
				rev =rev +" "+split[i];
			}
			else
			{
				rev = rev + " " + wordreverse(split[i]);
			}
		}

		System.out.println("alternative word: "+rev.trim());
	}

	public static String wordreverse(String name)
	{
		char[] c = name.toCharArray();
		String chk = "";
		for(int i = c.length-1;i>=0;i--)
		{
			chk = chk + c[i];
		}

		return chk;

	}

	public static  void altreverse(String ip)
	{
		String [] split = ip.split(" ");
		StringBuilder br = new StringBuilder();

		for(String word: split)
		{
			if(word.equalsIgnoreCase("jeyesh")||word.equalsIgnoreCase("are"))
			{
				StringBuilder rev = new StringBuilder(word);
				String val = rev.reverse().toString();
				br.append(val).append(" ");
			}
			else
			{
				br.append(word).append(" ");
			}
		}

		System.out.println(br.toString().trim());

	}

	public static  void altworeverse(String ip)
	{
		//op: hi hseyej how cinam you
		String [] split = ip.split(" ");
		String op = "";


			for (String word : split)
				{
					if (word.equalsIgnoreCase("jeyesh") || word.equalsIgnoreCase("are"))
					{
						String rev = "";

						for (int j = word.length() - 1; j >= 0; j--) {
							rev = rev + word.charAt(j);
						}
						op = op + rev + " ";
					}
					else {
						op = op + word + " ";
					}

				}

		System.out.println(op.trim());

	}

}
