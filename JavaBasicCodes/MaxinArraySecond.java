package JavaBasicCodes;

public class MaxinArraySecond {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int [] arr = {5,6,3,2,7,1,0,9};

		int max = arr[0], secMax = arr[1];
		for(int i = 0; i<arr.length;i++) {
			if(max<arr[i]) {
				max = arr[i];
			}
		}
		for(int j = 0; j<arr.length; j++) {
			if(secMax<arr[j] && arr[j]!=max) {
				secMax = arr[j];

			}
		} 
		System.out.println("Largest number "+max);
		System.out.println("Second Largest number "+secMax);
	}
}
