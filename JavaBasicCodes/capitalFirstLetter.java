package JavaBasicCodes;
public class capitalFirstLetter {
	public static void main(String[] args) {
		String value = "sundar  soundar moorthy";
		//Expected: SundarSoundarMoorthy
		System.out.println(logic(value));
		
	  }
	
	public static String logic (String val) {
		String[] split = val.split(" ");
		StringBuilder result = new StringBuilder();
		
		for ( String word : split) {
			if(word.length()>0) {
				result.append(word.substring(0, 1).toUpperCase());//capitalize first letter
				result.append(word.substring(1).toLowerCase()+" ");//Lower case
				
			}
		}
		return result.toString();
	}
	}

