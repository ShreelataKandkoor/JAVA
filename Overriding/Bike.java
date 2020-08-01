package Overriding;

//Simple method Overriding method...problem of using it.

public class Bike extends Vehicle{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//creating instance of class
		Bike obj = new Bike();
		obj.run();

	}

	void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Bike is Safely running...");
		
	}

	

}
