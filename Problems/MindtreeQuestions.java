package Problems;

public class MindtreeQuestions {

	//	1. ip: automation; 
	//	Take the unique characters and print with count. 
	//	op: u=1,m=1,i=1,n=1

	public static void uniqueCharCount(String ip) {
		int [] freq = new int [255];
		for(char f : ip.toCharArray()) {
			freq[f]++;
		}
		for(char f : ip.toCharArray()) {
			if(freq[f]==1) {
				System.out.print(f+"="+freq[f]+", ");
			}
		}
	}	

	//	1. ip: automation; 
	//	Take the unique characters and print with count. 
	//	op: umin
	public static void uniqueChar(String ip ) {
		char[] arr = ip.toCharArray();
		for(int i = 0; i<arr.length;i++) {
			int count = 0; 
			for(int j = 0 ; j<arr.length;j++) {
				if(arr[i]==arr[j]) {
					count++;
				}
			}
			if(count==1) {
				System.out.print(arr[i]);
			}
		}
	}
	//2. pattern print
	public static void pattern(int ip) {
		int num = 0;
		for(int row = 0; row<ip ; row++) {
			for(int col = 0; col<=row;col++) {
				num = num +1;
				System.out.print(num+" ");
			}
			System.out.println();
		}
	}

	//	3. ip: jeyesh@1234#ps; op: jeyeshps 
	public static void removeSplCharacter(String ip ) {
		char[] arr = ip.toCharArray();
		for(int i = 0; i<arr.length;i++) {
			if(Character.isLetter(arr[i])) {
				System.out.print(arr[i]);
			}
		}

	}

	//	4. ip: Hello world of java; op: print the first letter of each word and print as a string - Hwoj  

	public static void firstLetter(String ip ) {
		String[] split = ip.split(" ");
		for(int i = 0 ; i<split.length;i++) {
			char[] arr =	split[i].toCharArray();
			for(int j = 0; j <=0 ;j++) {
				System.out.print(arr[j]);
			}
		}

	}

	//5. jeyesh@1234# -- sum of the digits (10). once you got the sum multiple with 5 (50)... find the ASCII character which matches this number.
	public static void sumOfDigitsLogic(String ip ) {
		int val = 0;
		char[] arr = ip.toCharArray();
		for(int i = 0 ; i< arr.length;i++) {
			if(Character.isDigit(arr[i])) {
				int num = Character.getNumericValue(arr[i]);
				val = val+num;
			}
		}
		val = val*10;

		System.out.println((char)val);// op : asci value of 100 which is d
	}

	//6.print 1,2,3,4,5 - multiples of 5, 6,7 - multiples of 7, 8,9,10 - multiples of 5, 11,12,13,14 - multiples of 7,....35 - multiples of 5 and 7,..50

	public static void multiplesOf() {
		for(int i = 1; i<=50;i++) {
			//			System.out.println(i);
			if(i%5==0 && i%7==0) {
				System.out.println(i+ " Multiple of 5 and 7");
			}
			else if(i%5==0) {
				System.out.println(i+" Multiple of 5");
			}
			else if (i == 7 ||i == 14 || i == 21 || i == 28 || i == 35 || i == 42 || i == 49) {
				System.out.println(i+ " Multiple of 7");
			}
			else {
				System.out.println(i);
			}

		}
	}

	//	7. ip:String = ("123") Op: sum of digits = 6
	public static void stringAdd(String ip) {
		int sum = 0;
		char[] arr = ip.toCharArray();
		for(int i = 0 ; i<arr.length;i++) {
			int numericValue = Character.getNumericValue(arr[i]);
			sum = sum + numericValue;
		}
		System.out.println(sum);
	}

	public static void main(String[] args) {
		uniqueChar("automation");
		//		pattern(6);
		//		removeSplCharacter("jeyesh@1234#ps");
		//		firstLetter("Hello world of java");
		//		sumOfDigitsLogic("jeyesh@1234#");
		//		multiplesOf();
		//		stringAdd("123");
	}
}