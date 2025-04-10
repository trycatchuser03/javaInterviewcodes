package Problems;

import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class arrayPracticeCodes {

	public static void addNumArray(int [] ip) {
		int sum = 0 ; 
		for(int i = 0 ; i<ip.length;i++) {
			sum = sum +ip[i];
		}
		System.out.println(sum);
	}

	public static void maxInArray(int [] ip) {
		int max = ip[0];
		for(int i = 0; i<ip.length;i++) {
			if(max<ip[i]) {
				max = ip[i];
			}
		}
		System.out.println("Maximum Number is = "+max);
	}

	public static void minInArray(int [] ip) {
		int min = ip[0];
		for(int a : ip) {
			if(min>a) {
				min = a;
			}
		}
		System.out.println("Minimum Number is = "+min);
	}
	public static void secondMaxInArray(int[] ip) {
		int max = ip[0];
		for(int i = 0; i<ip.length;i++) {
			if(max<ip[i]) {
				max = ip[i];
			}
		}
		System.out.println("Maximum Number is = "+max);

		int secMax = ip[1];		
		for(int j = 0 ; j<ip.length;j++) {
			if(secMax<ip[j] && ip[j]!=max) {
				secMax = ip[j];
			}
		}
		System.out.println("Second Maximum Number is = "+secMax);
	}

	public static void secondMinInArray(int [] ip) {
		int min = ip[0],secMin = ip[1];
		for(int a : ip) {
			if(min>a) {
				min = a ;
			}
		}
		System.out.println("Minimum Number is = "+min);
		for(int b : ip ) {
			if(secMin>b && b!=min) {
				secMin = b;
			}
		}
		System.out.println("Second Minimum Number is = "+secMin);

	}

	public static void reverseArray(int [] ip) {
		int[] arr = new int [ip.length]; 
		for(int i = ip.length-1; i>=0;i--) {
			arr[i]=ip[ip.length-1-i];
		}
		System.out.println(Arrays.toString(arr));
	}

	public static void evenOddInArray(int [] ip ) {
		int even = 0, odd = 0;
		for(int op : ip) {
			if(op%2==0) {
				even++;
			}else {
				odd++;
			}
		}
		System.out.println("Even count : "+even);
		System.out.println("Odd count : "+odd);
	}

	public static void searchArray(int[] ip , int toFind) {
		boolean cond = false;
		for(int i =0 ; i<ip.length;i++) {
			if(ip[i]==toFind) {
				cond = true;
				System.out.println("Index of "+toFind+" is "+i);
				break;
			}
		}
		if(cond) {
			System.out.println("Element is present in the given Array");
		}
		else {
			System.out.println("Element is not present in the given Array");
		}
	}

	public static void freqOfElementInArray(int[] ip) {

		Map <Integer, Integer> count = new HashMap<Integer, Integer>();

		for(int a : ip) {
			count.put(a, count.getOrDefault(a, 0)+1);
		}
		System.out.println("Frequecny of Each Element in the given Array is :");

		for(Map.Entry<Integer, Integer> entry: count.entrySet()) {
			System.out.println(entry.getKey()+" : "+entry.getValue());
		}
	}

	public static void palindrome(int [] ip) {
		boolean cond = true;
		// Loop through half of the array  321123
		for(int i = 0 ; i<ip.length/2;i++) //important line
		{
			if(ip[i] != ip[ip.length-1-i]) {
				cond = false;// not a palindrome
			}
		}
		if(cond) {
			System.out.println("ispalindrome : "+cond);
		}else {
			System.out.println("ispalindrome : "+cond);
		}

	}
	public static void mergeTwoArrays(int [] ip1 , int [] ip2)
	{
		int [] arr = new int [ip1.length+ip2.length];

		for(int i = 0 ; i<ip1.length;i++) {
			arr[i]=ip1[i];
		}
		for(int j = 0 ; j<ip2.length;j++) {
			arr[ip1.length+j] = ip2[j];
		}
		String op = Arrays.toString(arr);
		System.out.println(op);
	}

	public static void removeDupInArray(int[] ip) {
		Set<Integer> dup = new HashSet<>(); //using hashset to remove duplicate values automatically
		for(int a : ip) {
			dup.add(a);
		}
		//		 System.out.println(dup);
		int[] arr = new int [dup.size()];
		int index = 0 ; 
		for(int num : dup) {
			arr[index++]=num;
		}
		System.out.println(Arrays.toString(arr));

	}	

	public static void rotateArray (int [] ip ) {
		int n=2; 

		System.out.println("Original Array is : ");
		System.out.println(Arrays.toString(ip));

		//Logic for Rotation 
		for(int i = 0;i<n;i++) {
			int last = ip[ip.length-1];
			
			for(int j = ip.length-1;j>0;j--) {
				ip[j]=ip[j-1]; // shifting element one by one 
			}
			ip[0]=last;
		}
		System.out.println("Array after right rotation: ");
		System.out.println(Arrays.toString(ip));

	}
	
	public static void main(String[] args) {
		int [] arr =new int [] {6,1,1,2,3,4,5,6,2,2,4,5};
		int [] arr2 = {1, 2, 3, 4, 5};
		freqOfElementInArray(arr);
	}
}
