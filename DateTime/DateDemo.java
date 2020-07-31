package DateTime;

import java.util.Date;

public class DateDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Instantiate a Date object
		Date date = new Date();
		
		//display time and date
		String str = String.format("Current Date/Time: %tc", date);
		
		System.out.println(str);
		

	}

}
