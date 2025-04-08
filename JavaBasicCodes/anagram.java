package JavaBasicCodes;

import java.util.Arrays;

public class anagram {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1 = "tharun", str2 = "tarhnu";
		char[] array1 = str1.toCharArray();
		char[] array2 = str2.toCharArray();
		if(str1.length() == str2.length()) {
			Arrays.sort(array1);
			Arrays.sort(array2);
			boolean condition = Arrays.equals(array1, array2);
			if(condition) {
				System.out.println(str1 +" and "+str2 +" is an anagram");
			}else {
				System.out.println(str1 +" and "+str2 +" is not an anagram");
			}
			
		}else {
			System.out.println(str1 +" and "+str2 +" is not an anagram");
		}

	}

}
