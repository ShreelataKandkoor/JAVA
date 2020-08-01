package MethodOverridingException;

//Eaxmple case Subclass Overridden method declares parent exception.
public class TestException2 extends Parent2{
	
	public void msg() throws Exception{
		// TODO Auto-generated method stub
		System.out.println("Child..");
		
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
