package Decision_Making;

public class Switch_Test {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		char grade = 'C';
		
		switch(grade) {
		case 'A':
			System.out.println("Excellent!");
			break;
		case 'B':
			System.out.println("Well done");
			break;
		case 'C':
			System.out.println("You Passed");
			break;
			default :
				System.out.println("Invalid grade");
		
		}
		System.out.println("Your grade is "+grade);

	}

}
