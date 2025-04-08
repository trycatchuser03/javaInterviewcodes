package JavaBasicCodes;

import java.util.Scanner;

public class TrianglePattern {

	public static void numpattern() {
		Scanner sc = new Scanner (System.in);
		System.out.println("Enter no of line: ");
		int limit = sc.nextInt();
		int staringnum= 1;
		int row,column=0;

		for(row=0;row<limit; row++) {
			for(column=0; column<=row; column++) {
				System.out.print(staringnum+" ");
				staringnum +=1;
			}
			System.out.println();
		}
	}

	public static void starpatter() {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter no of lines");
		int line = sc.nextInt();
		for(int row = 0; row < line; row++) {
			for(int column=0;column <= row; column++) {
				System.out.print("# ");
			}
			System.out.println();
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		starpatter();
		starpatter();
		

	}

}

