package MethodOverridingException;

public class TestException3 extends Parent3{
	
	public void msg() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Parent");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent2 p = new TestException2();
		try {
			p.msg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
