package InstanceInitializerBlock;

public class Bike1 {
	
	int speed;
	
	{
		
		speed = 100; //Instance Initializer block
		
	}
	
	
	Bike1(){
		
		System.out.println("speed"+speed);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike1 b1 = new Bike1();
		Bike1 b2 = new Bike1();

	}

}
