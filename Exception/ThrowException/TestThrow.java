package ThrowException;

public class TestThrow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	  validate(13);
	  
	  System.out.println("rest of the code..");

	}

	private static void validate(int age) {
		// TODO Auto-generated method stub
		
		if(age<18) {
			
			throw new ArithmeticException("not valid");
			
		}else {
			System.out.println("Welcome to vote.");
		}
		
	}
	
	

}
