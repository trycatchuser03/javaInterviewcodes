package JavaBasicCodes;

public class Fibonacci {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int n = 10, firstNum=0,secondNum=1;
		System.out.println("Fibonacci series for "+n+" term is ");
		for(int i =1;i<=n;++i) {
			System.out.print(firstNum+", ");
			
			//Logic
			int nextNum = firstNum + secondNum;
			firstNum = secondNum;
			secondNum = nextNum;
		}

	}

}
