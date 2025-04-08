package JavaBasicCodes;

public class ReplaceVowelsWithSplChar {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "Audio Water LemOn";
		char[] given = input.toCharArray();
		
		for (int i = 0; i < given.length; i++) {
			if(given[i] =='A' || input.charAt(i)=='E' || input.charAt(i)=='I' || input.charAt(i)=='O' || input.charAt(i)=='U' ||
					input.charAt(i)=='a' || input.charAt(i)=='e' || input.charAt(i)=='i' || input.charAt(i)=='o' || input.charAt(i)=='u'){
			given[i]='*';
		}

}
		for (char c : given) {
			System.out.print(c);
			
		}
		
//		for (int i = 0; i < given.length; i++)
//		{
//			System.out.print(given[i]);
//			
//		}
		// Logic 2
//		 String replaced = input.replaceAll("[AEIOUaeiou]", "\\$");
//		 System.out.println(replaced);
		 
}
}
