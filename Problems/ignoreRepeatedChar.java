package Problems;

public class ignoreRepeatedChar {
	//	input: aapppplleeeee
	//	output: aple

	public static void ignoreLogic(String input) {
		StringBuilder build = new StringBuilder();
		char[] charArray = input.toCharArray();
			char temp ='\0';
			for(int i =0; i<charArray.length;i++) {

				if(!(charArray[i]==temp)) {
					build.append(charArray[i]);
					temp = charArray[i];
				}
			}
			System.out.println(build);
		}
	public static void logic2(String input) {
		StringBuilder build = new StringBuilder();
		char temp ='\0';
		for(char c : input.toCharArray()) {
			if(c!=temp) {
				build.append(c);
				temp = c;
			}
		}
		System.out.println(build);
	}
	
	
	
	public static void main(String[] args) {
		logic2("connectivity");	
	}
	}


