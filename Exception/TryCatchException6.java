
public class TryCatchException6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			
			int data =50/0;//may throw exception
		}catch(ArrayIndexOutOfBoundsException e) {
			
			System.out.println(e);
		}
		
		System.out.println("rest of the Code");

	}

}
