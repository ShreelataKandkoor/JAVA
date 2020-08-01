
public class WrapperIntSwitchCaseExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int age = 18;
		switch(age) {
		
		case(16): System.out.println("You are under 18");
		break;
		
		case(18) : System.out.println("You are eligible for vote");
		break;
		
		case(65) : System.out.println("You are senior Citizen");
		break;
		
		default : System.out.println("Please give the valid age");
		break;
		}

	}

}
