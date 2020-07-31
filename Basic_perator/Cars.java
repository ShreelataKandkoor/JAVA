package Basic_perator;

public class Cars extends Vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Vehicle a = new Cars();
		boolean result = a instanceof Cars;
		System.out.println(result);

	}

}
