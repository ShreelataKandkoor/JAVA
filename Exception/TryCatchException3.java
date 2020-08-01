
public class TryCatchException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			int data =50/0; //may throw Exception
			
			//Handling exception using parent class
			}catch(Exception e){
				
				//System.out.println(e);
				
				//Displaying custom exception message
				System.out.println("Can't divide by Zero..");
			}
			
			System.out.println("rest of the code...");


	}

}
