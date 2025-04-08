package Problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class practice {

	public static Map<Character,Integer> letterCount(String ip ){
		Map<Character,Integer> count = new LinkedHashMap<>();
		for(char c : ip.toCharArray()) {
			if(Character.isLetter(c)) {
				count.put(c, count.getOrDefault(c, 0)+1);
			}
		}
		return count;

	}

	public static void main(String[] args) {
		String ip = "tomorrow";
		Map<Character, Integer> letterCount = letterCount(ip);
		System.out.println("Letter count is : ");
		for(Map.Entry<Character,Integer> entry : letterCount.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}




	}

}
