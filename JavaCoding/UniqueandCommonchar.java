package trycheck;

import java.util.HashSet;

public class UniqueandCommonchar {

	public static void main(String[] args) 
	{
		int[] a1 = {1,2,3,4,5};
		int[] a2 = {3,4,5,6,7};
		
		unique(a1,a2);
		common(a1,a2);
	}
	
	static void unique(int[] a, int[] b)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		
		
		for(int ac: a)
		{
			set.add(ac);
		}
		
		for(int ac:b)
		{
			if(set.contains(ac))
			{
				set.remove(ac);
			}
			else
			{
				set.add(ac);
			}
		}
		
		System.out.println(set.toString());
	}
	
	static void common(int[] a, int[] b)
	{
		HashSet<Integer> set = new HashSet<Integer>();
		HashSet<Integer> resultset = new HashSet<Integer>();
		
		for(int ac: a)
		{
			set.add(ac);
		}
		
		for(int ac:b)
		{
			if(set.contains(ac))
			{
				resultset.add(ac);
			}
		
		}
		
		System.out.println(resultset.toString());
	}

}
