package JavaBasicCodes;

public class MaxinArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]ar= {7,9,77,2,0,-9,55,-90,-1090,99};
		
		int max = ar[0];
//		for(int i = 1; i < ar.length; i++)
//		{
//			if (max < ar[i]) {
//				max = ar[i];
//			}
//		}
		
	for(int a : ar) {
		if(max < a) {
			max = a;
		}
	}
		System.out.println(max);
	}
}
		
		
