package TestThrows;

import java.io.IOException;

public class TestThrows {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestThrows obj = new TestThrows();
		obj.p();
		
		System.out.println("Normal flow..");

	}

	void p() {
		// TODO Auto-generated method stub
		
		try {
			
			n();
		}catch(Exception e) {
			
			System.out.println("Exception handled.");
		}
		
	}

	void n() throws Exception{
		// TODO Auto-generated method stub
		m();
		
	}

	private void m() throws IOException {
		// TODO Auto-generated method stub
		throw new IOException("device error");
		
	}

}
