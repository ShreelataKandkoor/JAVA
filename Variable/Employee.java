package Variable;

//Instance Variable Examples

public class Employee {
	
	public String name;
	public double salary;

	public Employee(String empname) {
		// TODO Auto-generated constructor stub
		name = empname;
	}
	
	private void setSalary(double empSal) {
		// TODO Auto-generated method stub
		salary = empSal;
	}
	
	private void printEmp() {
		// TODO Auto-generated method stub
		System.out.println("name :"+name);
		System.out.println("salary :"+salary);
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Employee empOne = new Employee("Sam");
		empOne.setSalary(10000);
		empOne.printEmp();

	}

	

	

}
