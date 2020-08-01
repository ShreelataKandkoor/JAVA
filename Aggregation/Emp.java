package Aggregation;

public class Emp {
	
	int id;
	String name;
	Address address;

	public Emp(int id, String name, Address address) {
		// TODO Auto-generated constructor stub
		
		this.id = id;
		this.name = name;
		this.address = address;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Address address1 =new Address("gzd","UP","India");
		Address address2 = new Address("gno","UP","Inida");
		
		Emp e = new Emp(101,"Varun",address1);
		Emp e2 = new Emp(102,"Arun",address2);
		
		
		e.display();
		e2.display();

	}

	private void display() {
		// TODO Auto-generated method stub
		
		System.out.println(id+""+name);
		System.out.println(address.city+""+address.state+""+address.country);
		
	}

}
