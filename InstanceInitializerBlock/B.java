package InstanceInitializerBlock;

//Parent class is invoked first then the Intializer block

import java.lang.reflect.Constructor;

public class B extends A{
	
	B(){
		
		super(); //Super class constructor
		
		System.out.println("Constructor is Invoked..."); //Constructor
	}
	
	
	{
		System.out.println("Intializer is Invoked...");  //Intializer block
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B b = new B();

	}

}
