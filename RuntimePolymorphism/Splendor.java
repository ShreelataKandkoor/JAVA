package RuntimePolymorphism;

//Runtime Polymorphism

public class Splendor extends Bike{
	
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Running...safely with 60km");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike b = new Splendor(); //upcasting..
		
		b.run();

	}

}
