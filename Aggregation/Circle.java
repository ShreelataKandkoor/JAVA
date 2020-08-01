package Aggregation;

public class Circle {
	
	Operation op; //aggregation
	
	double pi = 3.14;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
        Circle c = new Circle();
        double result = c.area(5);
        System.out.println(result);
		

	}

	public double area(int radius) {
		// TODO Auto-generated method stub
		op = new Operation();
		int rsquare = op.square(radius);
		return pi*rsquare;
	}

}
