package JavaBasicCodes;

public class Overloading_Poly {

	public  int sum (int a,int b) {
		int sum = a+b;
		return sum;

	}

	public static int sum (int a,int b,int c) {
		int sum = a+b+c;
		return sum;

	}
	public static double sum (double a,double b) {
		double sum = a+b;
		return sum;

	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Overloading_Poly s= new Overloading_Poly();
		System.out.println(sum(11.5, 10.0));
		System.out.println(s.sum(11, 21));
		System.out.println(Overloading_Poly.sum(11, 10,10));



	}

}
