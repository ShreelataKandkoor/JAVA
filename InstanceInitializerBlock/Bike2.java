package InstanceInitializerBlock;


//Intance Intializer invoked first and Constructor is followed

public class Bike2 {
	
	int speed;
	
	Bike2(){
		
		System.out.println("Constructor is Invoked....");
	}
	
	
	{
		
		System.out.println("Intance initializer is invoked...");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike2 b2 = new Bike2();

	}

}
