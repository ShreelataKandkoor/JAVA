package RuntimePolymorphism;

public class TestPolymorphism3 extends Animal{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal a;
		
		a = new Dog();
		a.eat();
		
		a = new Cat();
		a.eat();
		
		a = new Lion();
		a.eat();

	}

}
