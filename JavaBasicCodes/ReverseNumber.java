package JavaBasicCodes;

public class ReverseNumber {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int num = 123456789;
		int rev = 0 ;
		
		while(num!= 0) {
			//Logic 1
			rev=rev*10;
			rev=rev+num%10;
			num=num/10;
			
			//Logic 2
//			int rem= num%10;
//			rev = rev*10+rem;
//			num=num/10;
		}
		System.out.println(rev);

	}

}
