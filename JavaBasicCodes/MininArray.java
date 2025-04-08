package JavaBasicCodes;

public class MininArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[]ar= {7,9,77,2,0,-9,-555,-99,100,60};
		
		int min = ar[0];
		
//		for(int i= 1;i < ar.length;i++) {
//			if(min > ar[i]) {
//				min = ar[i];
//			}
//			
//		}
		for(int a : ar) {
			if(min > a) {
				min = a;
			}
		}
		System.out.println(min);
		

	}

}
