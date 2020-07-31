package Object_Class;

public class Puppy {
	
	//Object and Class Programming Example
	
	int puppyAge;

	public Puppy(String name) {
		// TODO Auto-generated constructor stub
		System.out.println("Passed Name is: "+name);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Object of the class
		Puppy myPuppy = new Puppy("tommy");
		
		//Call class method to set puppy's age
		myPuppy.setAge(2);
		
		
		//Call Another class method to get puppy's age
		myPuppy.getAge();
		
		
		//Accessing instance variable 
		System.out.println("Instance Variables values:"+myPuppy.puppyAge);

	}

	private void getAge() {
		// TODO Auto-generated method stub
		System.out.println("Puppy's age is: "+puppyAge);
		
	}

	private void setAge(int age) {
		// TODO Auto-generated method stub
		puppyAge = age;
		
	}

}
