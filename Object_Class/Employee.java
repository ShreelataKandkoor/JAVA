package Object_Class;

public class Employee {
	
	//Instance Varibles
	String name;
	int age;
	String designation;
	double salary;

	public Employee(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}

	public void empAge(int i) {
		// TODO Auto-generated method stub
		age = i;
		
	}

	public void empDesignation(String empDesign) {
		// TODO Auto-generated method stub
		designation = empDesign;
	}

	public void empSalary(double empSalary) {
		// TODO Auto-generated method stub
		salary = empSalary;
	}

	public void printEmployee() {
		// TODO Auto-generated method stub
		
		System.out.println("Name :" +name);
		System.out.println("Age :" +age);
		System.out.println("Designation :" +designation);
		System.out.println("Salary :" +salary);
		
	}


}
