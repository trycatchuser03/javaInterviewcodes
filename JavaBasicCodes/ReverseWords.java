package JavaBasicCodes;

public class ReverseWords {
	
	public static  void Reverse (String s) {
		//char[] arrays =s.toCharArray();
		String[] arrays=s.split(" ");
		String rev = "";
		
		for(int i=arrays.length-1; i>=0; i--){
			rev = rev+ arrays[i]+" ";
		}
		System.out.println(rev);

		
	}
	
	public static void main(String[] args) {
		Reverse("Tharun i love u");
	}

}
