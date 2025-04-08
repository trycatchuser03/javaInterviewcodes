package JavaBasicCodes;

public class RevAltWords {
	//using String Builder
	public static String reverse(String s) {
		StringBuilder str = new StringBuilder();
		str.append(s);
		return str.reverse().toString();
	}
	//using loop
	public static String rev(String s) {
		char[] charArray = s.toCharArray();
		String rev = "";
		for(int i = charArray.length-1;i>=0;i--) {
			rev = rev + charArray[i];
		}
		return rev;
	}

	public static void main(String[] args) {
		String input = "all is well that ends well";
		String[] charArray = input.split(" ");
		for(int i = 0; i<charArray.length;i+=2) {
//			charArray[i] = reverse(charArray[i]);
			charArray[i] = rev(charArray[i]);
		}
		
		for(String op : charArray ) {
			System.out.print(op+" ");
		}
		
//		StringBuffer str = new StringBuffer();
//		for(String op : charArray ) {
//			str.append(op).append(" ");
//		}
//		String result = str.toString().trim();
//		System.out.println(result);
	}

}
