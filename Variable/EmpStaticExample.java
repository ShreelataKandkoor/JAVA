package Variable;

public class EmpStaticExample {
	
	//Salary variable is a private static variable
  private static double salary;
  
  //Department is a constant
  public static final String Department = "Development";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		salary = 10000;
		System.out.println(Department +" average salary:"+ salary);

	}

}
