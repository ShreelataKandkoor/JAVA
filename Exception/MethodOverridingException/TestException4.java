package MethodOverridingException;

public class TestException4 extends Parent4{

	public void msg(){
		// TODO Auto-generated method stub
		
		System.out.println("Child..");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent4 p =new TestException4();
		try {
			p.msg();
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
