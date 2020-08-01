
public class FactorialExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int i, fact =1;
		
		int number =4;
		
		fact = factorial(number);
		
		System.out.println("Factorial of "+ number + " is " +fact);

	}

	private static int factorial(int n) {
		// TODO Auto-generated method stub
		
		if(n==0) {
		return 1;
		}
		else {
			return(n*factorial(n-1));
	}
	}

}
