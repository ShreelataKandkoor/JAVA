package ExceptionPropogation;

public class TestExceptionPropogation {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestExceptionPropogation obj = new TestExceptionPropogation();
		obj.p();
		
		System.out.println("normal flow...");

	}

	private void p() {
		// TODO Auto-generated method stub
		
		try {
			
			n();
		}catch(Exception e) {
			
			System.out.println("exception handled..");
		}
		
	}

	private void n() {
		// TODO Auto-generated method stub
		
		m();
		
		
	}

	private void m() {
		// TODO Auto-generated method stub
		
		int data =50/0;
		
	}

}
