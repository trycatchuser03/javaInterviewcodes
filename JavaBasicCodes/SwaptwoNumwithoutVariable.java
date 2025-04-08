package JavaBasicCodes;

public class SwaptwoNumwithoutVariable {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int a = 10;
		int b =20;
		System.out.println("Before swap>> value of a = "+a +" value of b = "+b );
		//Logic 1
		a=a+b;
		b=a-b;
		a=a-b;
		
		//Logic 2
//		a=a*b;
//		b=a/b;
//		a=a/b;
		System.out.println("After swap>> value of a = "+a +" value of b = "+b );

	}

}
