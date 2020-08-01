
public class TryCatchException5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int data =50/0;//may throw exception.
		}
		
		//handling exception
		catch(Exception e) {
			
			int data =50/0;//may throw exception
		}
		
		System.out.println("rest of the code..");

	}

}
