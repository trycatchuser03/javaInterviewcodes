package trycheck;

public class intreversechk 
{
	public static void main(String[] args) {

		int ip = 1234567;
		intreverse(ip);
		sumofdigits(ip);
		appendspecialcharacter(ip);
		inthalfreverse(ip);

	}

	public static void intreverse(int ip)
	{
		//op: 7654321
		int val = 0;
		while(ip!=0)
		{
			int digit = ip%10;
			val = val*10 + digit;
			ip = ip/10;
		}
		System.out.println(val);

	}
	
	static void sumofdigits(int ip)
	{
		int sum = 0;
		
		while(ip!=0)
		{
			int digit = ip%10;
			sum = sum+digit;
			ip = ip/10;
		}
		System.out.println(sum);
		
	}
	
	 static void appendspecialcharacter(int ip)
	{
		//op: a_1 a_2 a_3 a_4 a_5 a_6 a_7
		int[] digit = new int[7];//new int[String.valueOf(ip).length()]
		
		for(int i=0;ip>0;i++)
		{
			digit[i]=ip%10;
			ip=ip/10;			
		}
		
		for(int i=digit.length-1;i>=0;i--) 
		{
			System.out.print("a_"+digit[i]+" ");
		}
	}
	 
	 static void inthalfreverse(int ip)
	 {
		 //op 1234765
		 int firsthalf = ip/1000;
		 int secondhalf = ip%1000;
		 int val = 0;
		while(secondhalf!=0)
		{
			int digit = secondhalf%10;
			val = val*10 + digit;
			secondhalf = secondhalf/10;
		}
		
		int finalval = (firsthalf * 1000)+val;
		System.out.println(finalval);
		 
	 }

}
