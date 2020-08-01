//Method Overloading with type Promotion
public class OverloadingCalculation1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		OverloadingCalculation1 obj = new OverloadingCalculation1();
		obj.sum(20,20);
		obj.sum(10, 15, 30);
		

	}

	private void sum(int i, int j, int k) {
		// TODO Auto-generated method stub
		
		System.out.println(i+j+k);
		
	}

	private void sum(int a, long b) {
		// TODO Auto-generated method stub
		
		System.out.println(a+b);
		
	}

}
