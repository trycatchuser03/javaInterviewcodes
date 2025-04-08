package JavaBasicCodes;

public class ReverseSentence {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String s = "my world is full of happiness";
		String rev = "";
		// char[] temp =s.toCharArray();
		String[] temp = s.split(" ");

		for (int i = temp.length - 1; i >= 0; i--) {
			rev = rev + temp[i] + " ";

		}

//		int i = temp.length-1;
//		while(i>=0){
//			rev = rev+temp[i]+" ";
//			i--;
//		}
		System.out.println(rev);
//		for (String string : temp) {
//			System.out.println(string);
//		}
	}

}
