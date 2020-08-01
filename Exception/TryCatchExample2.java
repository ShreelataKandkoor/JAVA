
public class TryCatchExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int data =50/0; //may throw Exception
			
			//if exception occurs remaining statement will not execute
			System.out.println("rest of the code...");
			
			}catch(ArithmeticException e){
				
				System.out.println(e);
			}
			
			

	}

}
