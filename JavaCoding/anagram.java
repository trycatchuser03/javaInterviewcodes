package trycheck;

import java.util.Arrays;

public class anagram
{
	public static void main(String[] args)
	{
		String s1 = "listen";
		String s2 = "silent";
		if(anagramchk(s1,s2))
		{
			System.out.println("Both are anagram");
		}
		else
		{
			System.out.println("Both are not anagram");
		}

	}

	private static boolean anagramchk(String s1, String s2) {
		char[] c1 = s1.toCharArray();
		char[] c2 = s2.toCharArray();

		Arrays.sort(c1);
		Arrays.sort(c2);

		return Arrays.equals(c1, c2);
	}


}
