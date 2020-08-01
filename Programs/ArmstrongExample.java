
public class ArmstrongExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int c=0,a,temp;
		
		int n =153;
		
		temp = n;
		
		while(n>0) {
			
			a = n%10;
			n=n/10;
			c=c+(a*a*a);
		}
		
		if(temp==c) {
			
				
				System.out.println("Armstrong Number");
			}
			else {
				
				System.out.println("Is not Armstrong Number");
					
					
				
			
		}
		

	}

}
