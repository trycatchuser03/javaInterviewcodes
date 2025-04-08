package JavaBasicCodes;

public class VowelCountInString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "AUDIO aza";
		int vowelscount = 0;
		input =input.toLowerCase();
		char[] arrays = input.toCharArray();
		//int len = input.length();
		for(int i=0; i< input.length(); i++) {
			if(arrays[i]=='a' || arrays[i]=='e' || arrays[i]=='i' || arrays[i]=='o' || arrays[i]=='u' ) {
				vowelscount++;
			}
		}
		
		
		
//		for(int i =0; i < len;i++) {
//			if(input.charAt(i)==('a') || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o'
//					|| input.charAt(i)=='u') {
//				vowelscount++;
//			}
//		}
		System.out.println(vowelscount);

	}

}
