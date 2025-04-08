package JavaBasicCodes;

public class palindromeNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 3553, rev=0, ognum= num;
		
		while(num!=0) {
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
		}
		System.out.println(rev);
		if(ognum == rev) {
			System.out.println("Given number is a Palindrome");
		}
		else {
			System.out.println("Given number is not a Palindrome");
		}

	}

}
