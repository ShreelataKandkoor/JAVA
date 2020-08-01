
public class ContinueDoWhileExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//declaring variable
		int i=1;
		
		//do while loop;
		
		do {
			
			if(i==5) {
				
				//using continue statement
				i++;
				continue;
			}
			
			System.out.println(i);
			i++;
		}while(i<=10);

	}

}
