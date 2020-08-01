//Java Program to demonstrate the use of Continue Statement

public class ContinueWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//while loop
		int i=1;
		
		while(i<=10) {
			
		
			if(i==5) {
				
				//using continue statement
				i++;
			
			continue; //it will skip the rest statement
		}
		
		System.out.println(i);
		i++;
		}

	}

}
