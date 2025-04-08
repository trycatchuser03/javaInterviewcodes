package JavaBasicCodes;

public class AddNumInString {

	public static void main(String[] args) {

		String input = " 032 MS Dhoni 99 R Ashwin";
		int total =0;
		//Using charAt
		//		for(int i=0;i<input.length();i++) {
		//			char charr =input.charAt(i);
		//			if(Character.isDigit(charr)) {
		//				total = total+Character.getNumericValue(charr);
		//			}
		//		}

		//Using toCharArray
		char[] arrays = input.toCharArray();
		for(int i=0; i < input.length();i++ ) {
			if(Character.isDigit(arrays[i])) {
				int value =Character.getNumericValue(arrays[i]);
				total = total+value;
			}
		}
		System.out.println(total);

	}
}








































//		String input = "07 MS Dhoni 99 R Ashwin";
//		input= input.toLowerCase();
//		int num = 0;
//		
//		for (int i=0;i<input.length();i++ ) {
//			char[] array = input.toCharArray();
//			
//		//	boolean digit = Character.isDigit(array[i]);
//			if(Character.isDigit (array[i])){
//				num = num + Character.getNumericValue(array[i]);
//			}
//			
//		}
//		System.out.println(num);
//		
//	}
