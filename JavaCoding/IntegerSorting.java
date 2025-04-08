package trycheck;

public class IntegerSorting {

	public static void main(String[] args) {

		int[] num = {10, 5 ,6, 25, 15, 23, 19};
		
		sorting(num);

	}
	
	static void sorting(int[] a)
	{
		for(int i=1;i<a.length;i++)
		{
			int key = a[i];
			int j = i-1;
			
			while(j>=0 && a[j]>key)
			{
				a[j+1]=a[j];
				j--;
			}
			a[j+1] = key;
		}
		
		System.out.print("sorted array: ");
		for(int num: a)
		{
			System.out.print(num+" ");
		}
		
		System.out.println("Max: "+a[a.length-1]);
		System.out.println("Min: "+a[0]);
		System.out.println("second minimum: "+a[0+1]);
		System.out.println("third largest: "+a[a.length-1-2]);
		System.out.println("third largest: "+a[a.length-3]);
	}

}
