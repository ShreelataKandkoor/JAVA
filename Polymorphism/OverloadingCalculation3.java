//MethodOverloading with type promotion in case of ambiguity
public class OverloadingCalculation3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		OverloadingCalculation3 obj = new OverloadingCalculation3();
		//obj.sum(20,20); //causes and ambiguity
	}

	private void sum(int i, long j) {
		// TODO Auto-generated method stub
		
		System.out.println("a method invoked...");
	}
	
	
	private void sum(long i, int j) {
		
		System.out.println(" this method is invoked...");
	}

}
