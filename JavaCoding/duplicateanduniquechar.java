package trycheck;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class duplicateanduniquechar
{
	public static void main(String[] args)
	{
		//String s1="aaabbcccae";
		String s1="Krishna reddy";
		 s1 = s1.replaceAll(" ", "").toLowerCase();

		uniqDupli(s1);
	}

	public static  void uniqDupli(String ip)
	{
		char[] strtochar = ip.toCharArray();

		Map<Character,Integer> chk = new HashMap<>();

		for(char c:strtochar)
		{
			chk.put(c, (chk.getOrDefault(c, 0)+1));
		}

		for(Entry<Character, Integer> ent : chk.entrySet())
		{
			//unique value
			if(ent.getValue()==1)
			{
				System.out.println("Key: "+ent.getKey()+" Value: "+ent.getValue());
			}

			//duplicate value
			if(ent.getValue()>1)
			{
				System.out.println("Key: "+ent.getKey()+" Value: "+ent.getValue());			
			}
		}
	}
	/*
	op: 
	Key: a Value: 1
	Key: r Value: 2
	Key: s Value: 1
	Key: d Value: 2
	Key: e Value: 1
	Key: h Value: 1
	Key: i Value: 1
	Key: y Value: 1
	Key: k Value: 1
	Key: n Value: 1
	*/

}
