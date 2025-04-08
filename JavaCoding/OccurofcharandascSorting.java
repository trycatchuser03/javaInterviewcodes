package trycheck;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class OccurofcharandascSorting {

	public static void main(String[] args) 
	{
		
			String s1 = "connectivity";
			
			ascendingorder(s1);
			
			
	}	
		
		public static void ascendingorder(String s1)
		{
			String s2 = s1.replaceAll("\\s+", "");
			char [] chk = s2.toLowerCase().toCharArray();
			
			Map<Character,Integer> maps = new HashMap<>();
			
			for(char c : chk)
			{
				maps.put(c, maps.getOrDefault(c, 0)+1);
			}
			
			
			List<Map.Entry<Character, Integer>> sortlist = new ArrayList<>(maps.entrySet());
			sortlist.sort(Map.Entry.comparingByValue());
			
			//sortlist.sort(Comparator.comparing(Map.Entry<Character, Integer>::getValue)
			//        .thenComparing(e -> s2.indexOf(e.getKey())));
			
			for(Map.Entry<Character, Integer> ent : sortlist)
			{
				
				System.out.println(ent.getKey() + " " + ent.getValue());
				/*if(ent.getValue()==1)
				{
					System.out.print(ent.getKey());
				}*/
				
			}

	}

}
