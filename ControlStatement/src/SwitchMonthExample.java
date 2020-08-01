
public class SwitchMonthExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int month = 7;
		
		String monthString ="";
		
		//switch statement
		switch(month) {
		
		//case statement within the switch block
		
		case 1 : monthString = "January";
		break;
		
		case 2 : monthString = "February";
		break;
		
		case 3 : monthString = "March";
		break;
		
		case 4 : monthString = "April";
		break;
		
		case 5 : monthString = "May";
		break;
		
		case 6 : monthString = "June";
		break;
		
		case 7 : monthString = "July";
		break;
		
		case 8 : monthString = "August";
		break;
		
		case 9 : monthString = "September";
		
		case 10 : monthString = "October";
		break;
		
		case 11 : monthString = "November";
		break;
		
		case 12 : monthString = "Decemeber";
		break;
		
		default: System.out.println("Invalid Month");
	
		}
		
		//Printing month of the given number
		System.out.println(monthString);

	}

}
