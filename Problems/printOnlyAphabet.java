package Problems;

public class printOnlyAphabet {

	public static void main(String[] args) {
		space("tharun@123test#i");
		// TODO Auto-generated method stub
		//		inupt : Software @123test# -- print only alphabets
		//		output: Softwaretest
//		String ip = "Software@123test#";
//		String op = "";
//		char[] charArray = ip.toCharArray();
//		for(int i = 0; i<charArray.length;i++) {
//			if(Character.isAlphabetic(charArray[i])) {
//				op = op +charArray[i];
//			}
//
//	}
//		System.out.print(op);
}

	//print only alphabet but with space in between
	
	public static void space(String s ) {
		String op  = "";
		boolean cond = false;
		for(int i = 0; i< s.length();i++) {
			if(s.charAt(i)>='a' && s.charAt(i)<='z') {
				if(cond) {
					op = op + " ";
				}
				op = op + s.charAt(i);
				cond = false;
			}else {
				cond = true;
			}
		}
		System.out.print(op);
	}
}
