//Simple Inheritance Java programm.

public class Programmer extends Employee{
	
	int bonus = 10000;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Programmer p = new Programmer();
		
		System.out.println(" "+p.salary);
		System.out.println(" "+p.bonus);

	}

}
