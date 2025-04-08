package trycheck;

import java.util.Arrays;

public class Movingzerosatlast {

	public static void main(String[] args) 
	{
		//op: [1, 4, 5, 1, 0, 0, 0, 0]
		int[] arr= {1,4,0,0,5,1,0,0};
		Movingzerosatlast ml = new Movingzerosatlast();
		ml.zeroatlast(arr);
	}
	
	 void zeroatlast(int[] arr)
	{
		int nonzero=0;
		for(int i=0;i<arr.length;i++)
		{
			if(arr[i]!=0)
			{
				arr[nonzero]=arr[i];				
				nonzero++;
			}
		}	
			while(nonzero<arr.length)
			{
				arr[nonzero]=0;				
				nonzero++;
			}
		
		System.out.println(Arrays.toString(arr));
	}

}
