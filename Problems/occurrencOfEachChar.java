package Problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class occurrencOfEachChar {
//	input = "Hello World"
//	Output =
//	Letter count is :
//	h : 1
//	e : 1
//	l : 3
//	o : 2
//	w : 1
//	r : 1
//	d : 1

	
	public static Map<Character, Integer> letterCount(String ip){
		
		Map<Character, Integer> letter = new LinkedHashMap<Character, Integer>();
		
		for(char c : ip.toCharArray()) {
			if(Character.isLetter(c)) {
				letter.put(c, letter.getOrDefault(c, 0)+1);
			}
		}
		return letter;
		
	}
	
	public static void main(String[] args) {
		String ip = "occurrence".toLowerCase();
		
		System.out.println("Letter count is :");
		Map<Character, Integer> letterCount = letterCount(ip);
		
		for(Map.Entry<Character, Integer> entry: letterCount.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

}

