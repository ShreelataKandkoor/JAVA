package RuntimePolymorphism;

public class TestPolymorphism {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bank b ;
		
		b = new SBI();
		
		System.out.println("Interest Rate of SBI"+b.getRateOfInterest());
		
        b = new ICICI();
		
		System.out.println("Interest Rate of ICICI"+b.getRateOfInterest());
		
        b = new AXIS();
		
		System.out.println("Interest Rate of AXIS"+b.getRateOfInterest());
		
        

	}

}
