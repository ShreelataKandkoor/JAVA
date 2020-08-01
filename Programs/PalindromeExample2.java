import java.util.Scanner;

public class PalindromeExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String original, reverse = ""; //Object of String class
		
		Scanner in = new Scanner(System.in);
		
		System.out.println("Enter number to check for Palindrome");
		
		original = in.nextLine();
		
		int length = original.length();
		
		for(int i = length-1;i>=0;i--) {
			
		  reverse = reverse + original.charAt(i);
		  
		  if(original.equals(reverse))
			  
			  System.out.println("Enter number is Palindrome");
		 
		  
		  else
			  
			  System.out.println("Enter number is not Palindrome");
		 
		}
		
			
		

	}

}
