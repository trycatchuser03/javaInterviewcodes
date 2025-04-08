package JavaBasicCodes;

import java.util.Scanner;

public class PositionOfAlphabet {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter an Alphabet");
		char alphabet = sc.next().charAt(0);
		int position=0;
		//char letter = Character.toUpperCase(alphabet);
		int asciivalue = alphabet;
		if (asciivalue>=65 && asciivalue<=90) {
			position = asciivalue-64; //logic for upper case
			System.out.println(position);
		}
		else if(asciivalue>=97 && asciivalue<=122) {
			position = asciivalue-96; //logic for lower case 
			System.out.println(position);	
		}

	}

}
