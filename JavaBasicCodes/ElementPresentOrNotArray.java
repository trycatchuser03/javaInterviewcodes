package JavaBasicCodes;

public class ElementPresentOrNotArray {
	// TODO Auto-generated method stub
	int[] input = {99,91,3,0,8,70,88,9};

	int tofind=00;
	boolean found = false;


	public  void forloop() {

		for(int i=0; i<input.length;i++) {
			if(input[i]==tofind) {
				found= true;
				break;
			}
		}
		if (found) {
			System.out.println("Number is present");
		}
		else {
			System.out.println("Number is not present");
		}
	}
	public void foreachloop() {
		for(int a : input) {
			if(a==tofind) {
				found = true;
				break;
			}
		}
		if (found) {
			System.out.println("Number is present");
		}
		else {
			System.out.println("Number is not present");
		}
	}
	
	
	public static void main(String[] args) {
		ElementPresentOrNotArray present = new ElementPresentOrNotArray();
		present.foreachloop();
		
	}

}
