
public class PalindromeExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int r, sum =0,temp;
		
		//It is the number variable to be checked for palindrome
		int n=454;
		
		temp = n;
		
		while(n>0) {
			
			r=n%10; //getting remainder
			
			sum = (sum*10)+r;
			
			n = n/10;
			
			
		}
		
		if(temp == sum) {
			System.out.println("Palindrom number");
		}
		else {
			
			System.out.println("Not Palindrom number");
		}

	}

}
