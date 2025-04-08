package JavaBasicCodes;

public class palindromeString {

	public static void main(String[] args) {
		String input="racecar", rev="";
		char[] inputArray = input.toCharArray();
		for(int i = inputArray.length-1; i>=0;i--) {
			rev=rev+inputArray[i];
		}
			System.out.println(rev);
			if(input.equals(rev)) {
				System.out.println("Given String is a Palindrome");
			}
			else {
				System.out.println("Given String is not a Palindrome");
			}
		
	}

}
