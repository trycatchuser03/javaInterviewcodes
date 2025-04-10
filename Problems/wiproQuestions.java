package Problems;

import java.util.LinkedHashMap;
import java.util.Map;

public class wiproQuestions {
	//	String str = "123jeyes57test5chk45@gmail.com"; OP: 230  [i.e sum of (123+57+5+45; )]

	public static void addIntInInput(String ip) {
		int total = 0;
		String temp = "";
		char[] arr = ip.toCharArray();
		for(int i = 0; i<arr.length;i++) {
			if(Character.isDigit(arr[i])) {
				temp = temp + arr[i];
			}
			else {
				if(!temp.equals("")) {
					total = total+Integer.parseInt(temp);
					temp = "";
				}
			}
		}
		System.out.println("Sum of numbers in the string: " + total);
	}



	//String str = " hello this is wipro this is hello world"; Op: Print the words with their occurrence.

	public static void wordOccurrence(String ip) {
		String[] arr = ip.split(" ");
		Map<String,Integer> count = new LinkedHashMap<String,Integer>();

		for(String a : arr) {
			if(a.length()>1) {  //condition to avoid multiple space in between
				count.put(a, count.getOrDefault(a, 0)+1);
			}
		}

		System.out.println("Occurrence of each word is : ");

		for(Map.Entry<String, Integer> entry: count.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

	public static void main(String[] args) {
//		wordOccurrence("hello  this is wipro this is hello world");
		addIntInInput("123jeyes57test5chk45@gmail");
		
	}
}
