package trycheck;

public class MaxandMin {

	public static void main(String[] args) 
	{
		int[] a = {12,23,45,34,23,67,9};
		
		int[] result = maxandminchk(a);
		System.out.println("Max: "+result[0]);
		System.out.println("Min: "+result[1]);
	}

	private static int[] maxandminchk(int[] a) 
	{
		int max = a[0];
		int min = a[0];
		
		for(int i=1 ; i<a.length;i++)
		{
			if(a[i]>max)
			{
				max = a[i];
			}
			else if(a[i]<min)
			{
				min = a[i];
			}
		}
		
		//int[] result = {max,min};
		//return result;
		return new int[] {max,min};
						
	}

}
