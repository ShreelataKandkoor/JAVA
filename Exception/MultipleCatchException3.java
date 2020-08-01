
public class MultipleCatchException3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
try {
			
	String s = null;
	System.out.println(s.length());
	
		}catch(ArithmeticException e){
			
			System.out.println("Arthimetic Exception is Occured");
		}
		catch(ArrayIndexOutOfBoundsException e){
			
			System.out.println("Array Out Of Bound Exception error occurs.");
		}
	catch(Exception e) {
		
		System.out.println("Parent Exception");
	}
	
	System.out.println("rest of the code.");

	}


	

}
