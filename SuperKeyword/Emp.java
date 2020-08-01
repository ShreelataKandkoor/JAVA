package SuperKeyword;

public class Emp extends Person{
	
	float salary;
	
	public Emp(int id, String name, int salary) {
		// TODO Auto-generated constructor stub
		
		super(id,name);
		
		this.salary = salary;
	}

	public void display() {
		// TODO Auto-generated method stub
		
		System.out.println(id+""+name+""+salary);
		
	}

}
