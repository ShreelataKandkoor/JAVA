
public class Example {
	
	//Arithmetic Exception occurs

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			//code that may raise exception
		int data = 100/0;
		

	}catch(ArithmeticException e){
		System.out.println(e);
	}
		//rest code of the program
		System.out.println("rest of the code...");
	}
}
