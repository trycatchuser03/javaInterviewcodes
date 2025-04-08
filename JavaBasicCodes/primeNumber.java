package JavaBasicCodes;

public class primeNumber {
	
	public static void main (String[] args) {
	int num = 97;
	boolean condition = false;
	
	for(int i=2; i<= num/2; i++) {
		//condition for non prime number
		if(num % i == 0) {
			condition = true;
			break;	
		}
	}
	if(condition) {
		System.out.println(num+" is not prime number");

}
	else {
		System.out.println(num+" is a prime number");
	}
	}
}