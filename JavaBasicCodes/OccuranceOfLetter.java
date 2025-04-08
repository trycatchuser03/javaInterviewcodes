package JavaBasicCodes;

public class OccuranceOfLetter {
	//Logic 1 with the help of iteration
		public static void occurancewithiteration(String input, char tofind) {
			
		input = input.toLowerCase();
		char[] arrays = input.toCharArray();
		int occurance=0;
		
		for(int i=0; i<input.length();i++) {
			if(arrays[i]==tofind) {
				occurance++;
			}
		}
		System.out.println(occurance);
	}
		
		//Logic 2 
		public static void occurancewithlogic(String input, char tofind) {
			input = input.toUpperCase();
			String find = String.valueOf(tofind).toUpperCase();
					//Character.toString(tofind).toUpperCase();
			int lengthofinput = input.length();
			System.out.println(lengthofinput);
			input = input.replace(find, "");
			int lengthofinputafter = input.length();
			System.out.println(lengthofinputafter);
			int occurance = lengthofinput-lengthofinputafter;
			System.out.println(occurance+" times the letter "+tofind+" is repeated in "+input);
			
			
			
			
		}
		
		
		
		
public  static void main(String[] args) {
//	occurancewithiteration("dollly",'o');
	occurancewithlogic("hollywood",'o');
	
}


}
