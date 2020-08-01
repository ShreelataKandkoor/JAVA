package MethodOverridingException;

import java.io.IOException;

public class TestExceptionChild extends Parent{
	
	public void msg()throws ArithmeticException{
		
		System.out.println("Child..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Parent p =new TestExceptionChild();
		p.msg();

	}

}
