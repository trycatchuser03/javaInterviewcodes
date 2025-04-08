package Problems;

import java.util.Scanner;

public class Exercise01 {

	public static void uplow(String str) {

		for (char c : str.toCharArray()) {
			if(c>='a' && c<='z') {
				String aa = String.valueOf(c);
				System.out.print(aa.toUpperCase());
			}
			else if(c>='A' && c<='Z') {
				String ab = String.valueOf(c);
				System.out.print(ab.toLowerCase());
			}

		}

	}

	//without using to lower case
	public static void lower(String str) {
		char[] arrays = str.toCharArray();
		for(int i=0;i<str.length();i++) {
			if (str.charAt(i)>=65 && str.charAt(i)<=90) {
				arrays[i]= (char)(arrays[i]+32);
			}
		}
		for(int i=0;i<arrays.length;i++) {
			System.out.print(arrays[i]);
		}
	}

	//without using to upper case
	public static void upper(String str) {
		char[] arrays = str.toCharArray();
		for(int i=0; i < arrays.length;i++) {
			if(arrays[i]>=97 && arrays[i]<=122) {
				arrays[i]= (char)(arrays[i]-32);
			}

		}
		for(char a : arrays) {
			System.out.print(a);
		}
	}


	public static void logic(String str) {
		int capitalletter = 0;
		int smallletter = 0;
		char [] arrays = str.toCharArray();
		for (int i=0; i<str.length();i++) {
			if (arrays[i]>=97 && arrays[i]<=122) {
				smallletter++;
			}
			else if (arrays[i]>='A' && arrays[i]<='Z') {
				capitalletter++;
			}
		}
		if (capitalletter > smallletter) {

			upper(str);
		}
		else {
			lower(str);
			//System.out.println(str.toLowerCase());
		}

	}



	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the input");
		String ip = sc.nextLine();
		//Exercise01.uplow(ip);
		//		logic("My NAME is SHEELA");
		//		upper("My NAME is sheela");

		logic(ip);









	}

}
