package JavaBasicCodes;



public class ReverseString {
	static String str = "Tharun";
	public static  void usingbuilder() {
		//Logic 1
		StringBuilder build = new StringBuilder();
		build.append(str);
		StringBuilder rev = build.reverse();
		System.out.println("StringBuilder Reverse = " +rev);
	}

	public static void usingbuffer() {
		//Logic 2
		StringBuffer buffer = new StringBuffer();
		buffer.append(str);
		StringBuffer revbuff = buffer.reverse();
		System.out.println("StringBuffer Reverse = " +revbuff);
	}
	public static  void usingownlogic() {
	//Logic 3
		char[] characterarray = str.toCharArray();
		String reverse = "";

		for(int i=characterarray.length-1; i>=0; i--) {
			reverse = reverse+characterarray[i];
		}
		System.out.println("OwnLogic Reverse = " +reverse);
	}
	
	public static  void samp() {
		//Logic 3
		char[] characterarray = str.toCharArray();

		for(int i=characterarray.length-1; i>=0; i--) {
			System.out.print(characterarray[i]);	
			}
		
	}

	
	


	public static void main(String[] args) {
		//RvereseString s = new RvereseString();
//		usingownlogic();
//		usingbuilder();
		usingbuffer();

		samp();
	}
}
