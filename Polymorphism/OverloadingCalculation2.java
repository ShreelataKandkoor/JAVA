//Method Overloading with type promotion if matching method
public class OverloadingCalculation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingCalculation2 obj = new OverloadingCalculation2();
		obj.sum(20,20);

	}

	private void sum(int i, int j) {
		// TODO Auto-generated method stub
		
		System.out.println("Int arg method is invoked...");
		
	}
	
	private void sum(long i, long j) {
		
		System.out.println("Long arg method is invoked...");
	}

}
