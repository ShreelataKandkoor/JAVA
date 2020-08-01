package RuntimePolymorphism;
//Multilevel Inheritance in Runtime Polymorphism

public class BabyDog extends Animal2{

	public void eat() {
		// TODO Auto-generated method stub
		
		System.out.println("BabyDog eating...");
		
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Animal2 a1,a2,a3;
		a1 = new Dog2();
		
		a2 = new BabyDog();
		
		a3 = new Animal2();
		
		a1.eat();
		a2.eat();
		a3.eat();

	}

}
