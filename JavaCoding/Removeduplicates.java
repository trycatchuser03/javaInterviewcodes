package trycheck;

import java.util.LinkedHashSet;

public class Removeduplicates 
{
	public static void main(String[] args)
	{
		String s1 = "automation";
		linkedhasmap(s1);
		boolenchk(s1);
		javacompilor(s1);
		javacompilorrepeatednumber(s1);
		occuranceofcharacter(s1);
		
	}
	
	static void boolenchk(String s1)
	{
		char[] chk = s1.toCharArray();
		
		StringBuilder sb = new StringBuilder();
		boolean[] seen = new boolean[256];
		
		for(char c: chk)
		{
			if(!seen[c])
			{
				seen[c] = true;
				sb.append(c);
			}
		}
		
		System.out.println(sb.toString());
	}
	
	static void linkedhasmap(String s1)
	{
		LinkedHashSet<Character> settt = new LinkedHashSet<>();
		StringBuilder sb = new StringBuilder();
		for(char c: s1.toCharArray())
		{
			settt.add(c);
		}
		
		for(char c:settt)
		{
			sb.append(c);
		}
		System.out.println(sb.toString());
	}
	
	static void javacompilor(String s1)
	{
		int[] freq = new int[256];
		StringBuilder br = new StringBuilder();
		
		char[] chk = s1.toCharArray();
		
		for(char c: chk)
		{
			freq[c]++;
		}
		
		for(char c: chk)
		{
			if(freq[c]==1)
			{
				br.append(c);
			}
		}
		
		System.out.println(br.toString().replace(" ", ""));
		
	
	}
	static void javacompilorrepeatednumber(String s1)
	{
		char [] chk = s1.toCharArray();
		int[] freq = new int[256];
		StringBuilder br = new StringBuilder();
		for(char c: chk)
		{
			freq[c]++;
		}
		for(char c: chk)
		{
			if(freq[c]>1)
			{
				br.append(2);
			}
			else
			{
				br.append(c);
			}
		}
		System.out.println("repeatedwordswithnumber: "+br.toString());
	}
	static void occuranceofcharacter(String s1)
	{
		char [] chk = s1.toCharArray();
		int[] freq = new int[256];
		StringBuilder br = new StringBuilder();
		for(char c: chk)
		{
			freq[c]++;
		}
		for(char c: chk)
		{
			System.out.println("character: "+c+" count: "+freq[c]);
		}
		
	}
}
