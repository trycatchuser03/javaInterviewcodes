package JavaBasicCodes;

public class RemoveSpace {
	

	public static void main(String[] args) {
		
		String word = "   hello world!!  hello  ";
		//Logic 1 : Directly by using trim function
		//word = word.trim();
		//Logic 2 : By using strip function 
//		word.stripLeading();
//		word.stripTrailing();
		//word = word.strip();
		System.out.println(word.replaceAll("^[ \t]+|[ \t]+$", "")); //Removes leading and trailing space
		System.out.println(word.replaceAll("^[ \t]+|", "")); //Removes leading space only
		System.out.println(word.replaceAll("[ \t]+$", "")); //Removes trailing space only
//		System.out.println(word.replaceAll("[  ]+", "a"));
		
		
		
		
	}
}
