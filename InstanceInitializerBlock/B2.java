package InstanceInitializerBlock;

public class B2 extends A2{

	public B2(int i) {
		// TODO Auto-generated constructor stub
		
		super();
		System.out.println("Child Class Constrctor is Invoked..."+i);
		
	}

	public B2() {
		// TODO Auto-generated constructor stub
		
        super();
		
		System.out.println("Child class Constructor is Invoked..");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		B2 b2 = new B2();
		
		B2 b3 = new B2(10);

	}

}
