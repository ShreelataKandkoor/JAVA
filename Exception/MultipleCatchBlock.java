
public class MultipleCatchBlock {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
		int a[] = new int[5];
		
		System.out.println(a[10]);
      
		}
		catch(ArithmeticException e){
			System.out.println("Arthimetic Exception error occurs.");
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
