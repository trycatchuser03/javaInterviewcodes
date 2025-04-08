package JavaBasicCodes;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class MissingAlphabets {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String input = "    A   BC d  z E";
		input = input.toLowerCase();
		input = input.replace(" ", "");
		System.out.println(input);
		String [] giveninput = input.split("");
		
		String alphabet = "abcdefghijklmnopqrstuvwxyz";
		String [] givenalphabet = alphabet.split("");
		
		List<String> set1 = new LinkedList<String>();
		for(String s : giveninput) {
			set1.add(s);
		}
		System.out.println(set1);
		List<String> set2 = new LinkedList<String>(Arrays.asList(givenalphabet));
		System.out.println(set2);
		set2.removeAll(set1);
		
		System.out.println(set2);

		
	}

}
