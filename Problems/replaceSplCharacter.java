package Problems;

public class replaceSplCharacter {

	public static void main(String[] args) {
//				method2("tomorrow");

		String ip = "tomorrow";
		char op = '$' ;
		int count = 0;
		//		boolean cond = false;
		StringBuilder build = new StringBuilder();
		char[] charArray = ip.toCharArray();
		for(int i = 0; i<charArray.length;i++) {
			//			build.append(charArray[i]);
			if(charArray[i]=='o' || charArray[i]=='O') {
				count++;
				for(int j = 0 ; j < count;j++) {
				build.append(op);	
				}
			}
			else {
				build.append(charArray[i]);
			}
		}
		System.out.print(build);
	}

	// using charArray method replacing O with $
	public static void method2(String s) {
		String op ="";
		char[] charArray = s.toCharArray();
		for(int i = 0; i<charArray.length;i++) {
			if (charArray[i]=='o') {
//				charArray[i]='$';
				op = op +'$';
			}
			else {
				op = op+charArray[i];
			}
		}
		System.out.print(op);
	}


	//	using charAt method repalcing O with $
	public static void method(String s ) {
		char t = '$';
		String temp = "";

		for(int i = 0 ; i<s.length();i++) {
			char charAt = s.charAt(i);
			if(s.charAt(i)=='o' || s.charAt(i)=='O'){
				temp = temp+t;
			}else {
				temp = temp + charAt;
			}
		}
		System.out.print(temp);
	}
}
