package ExceptionPropogation;

import java.io.IOException;

public class TestExceptionPropogation2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		TestExceptionPropogation2  obj = new TestExceptionPropogation2();
		
		obj.p();
		
		System.out.println("normal flow...");

	}

	 void p() {
		// TODO Auto-generated method stub
		
		try {
			
			n();
		}catch(Exception e) {
			
			System.out.println("exception handled...");
		}
		
	}

	 void n() {
		// TODO Auto-generated method stub
		
		m();
		
	}

	 void m(){
		// TODO Auto-generated method stub
		
		//throw new java.io.IOException("device error");//checked exception.
		
	}

}
