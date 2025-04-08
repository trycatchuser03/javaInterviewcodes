package trycheck;

public class replaceacharacterwithnumber {

	public static void main(String[] args) {
		
		String s1 ="jayash";
		
		char[] chk = s1.toCharArray();
		int count = 1;
		StringBuilder br = new StringBuilder();
		
		for(char c: chk)
		{
			if(c=='a')
			{
				br.append(count);
				count++;
			}
			else
			{
				br.append(c);
			}
		}
		System.out.println(br.toString());

	}

}
