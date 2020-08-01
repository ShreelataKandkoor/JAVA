
public class FiconacciExample2 {
	
	static int n1=0,n2=1,n3=0;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int count=10;
		
		//prit 0 and 1
		System.out.print(n1+ " "+n2);
		
		//2 because 2 number are already printed
		printFibonacci(count-2);

	}

	static void printFibonacci(int count) {
		// TODO Auto-generated method stub
		
		if(count>0) {
			
			n3 = n1+n2;
			
			n1 = n2;
			
			n2 = n3;
			
			System.out.println(" "+n3);
			
			printFibonacci(count-1);
			
			
		}
		
	}

}
