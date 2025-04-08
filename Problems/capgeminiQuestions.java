package Problems;

public class capgeminiQuestions {


	public static String removeAltLetters(String ip ) {

		//		I/p Capgemeni – remove alternative words. O/p = cpeei
		StringBuilder build = new StringBuilder();
		char[] charArray = ip.toCharArray();
		for(int i = 0; i<charArray.length;i+=2) {
			build.append(charArray[i]);

		}

		return build.toString();
	}

	public static void reverseLastThreeDigits(int number ) {
		//		Input: 1234567; Reverse last three number; O/p = 1234765
		StringBuilder build = new StringBuilder();
		int first = number/1000;
		build.append(first);
		int sec = number%1000;//spliting last 3 digits
		int rev = 0,num=sec;
		while(num!=0) {
			rev= rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		build.append(rev);
		String op = build.toString();
		int parseInt = Integer.parseInt(op);
		System.out.println(parseInt);
	}

	public static void removeDuplicate(String ip) {
		//		Input: connectivity
		//		output: oevy
		
		int[] freq = new int[256];
		StringBuilder br = new StringBuilder();
		
		char[] chk = ip.toCharArray();
		
		for(char c: chk)
		{
			freq[c]++;
		}
		
		for(int i = 0; i<chk.length;i++)
		{
			if(freq[chk[i]]==1)
			{
				br.append(chk[i]);
			}
		}	
		System.out.println(br);
	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//		System.out.println(removeAltLetters("capgemeni"));
		//		reverseLastThreeDigits(1234567);
		removeDuplicate("connectivity");
	}

}


