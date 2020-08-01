
public class TryCatchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int data =50/0; //may throw Exception
		
		}catch(ArithmeticException e){
			
			System.out.println(e);
		}
		
		System.out.println("rest of the code...");

	}

}
