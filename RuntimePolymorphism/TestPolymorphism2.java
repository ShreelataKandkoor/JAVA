package RuntimePolymorphism;

public class TestPolymorphism2 extends Shape{

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Shape s;
		
		s = new Rectangle();
		s.draw();
		
		s = new Circle();
		s.draw();
		
		s = new Triangle();
		s.draw();

	}

}
