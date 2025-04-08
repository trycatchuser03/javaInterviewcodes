package trycheck;

public class Capgemini {

	public static void main(String[] args) 
	{
		String s1 = "capgemini";
		//op: geminicap
		reverse(s1);
		substring(s1);

	}
	
	static void reverse(String s2)
	{
		char[] chk = s2.toCharArray();
		String s3 = "";
		
		int mid = chk.length/2;
		
		for(int i =mid-1; i<chk.length;i++)
		{
			s3 = s3+chk[i];
		}
		
		for(int i =0; i<mid-1;i++)
		{
			s3 = s3+chk[i];
		}
		
		System.out.println(s3);
	}
	
	static void substring(String s1)
	{
		//int mid = s1.length()/2; -- if we have exact half
		
		String firsthalf = s1.substring(0, 3);
		String secondhalf = s1.substring(3);
		
		System.out.println(secondhalf+firsthalf);
	}

}
