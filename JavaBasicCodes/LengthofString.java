package JavaBasicCodes;

public class LengthofString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str = "Tharun B";
		System.out.println(str.length());
		
		char []s= str.toCharArray();
		int len=0;
		for (char c : s) {
			len++;
			System.out.print (c);
			
		}
//		System.out.println(" ");
		System.out.println("\nLength of the string is : "+len);

	}

}
