
public class SwitchStringExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Declaring String variable
		String levelString = "Expert";
		
		int level = 0;
		//using string in switch expression
		
		switch(levelString) {
		
		//Using String literal in Switch case
		case "Beginner" : level = 1;
		break;
		
		case "Intermediate" : level = 2;
		break;
		
		case "Expert" : level = 3;
		break;
		
		default : level = 0;
		break;
		}
		System.out.println("Your level is:"+level);

	}

}
