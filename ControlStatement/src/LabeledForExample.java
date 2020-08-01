
public class LabeledForExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//using label for outer and for loop
		
		aa:
			 for(int i=1;i<=3;i++) {
				 
				 bb:
					 for(int j=1;j<=3;j++) {
						 
						 if(i==2 && j==2) {
							// break aa; //breaks outer loop
							 break bb; //breaks inner loop
						 }
						 
						 System.out.println(i+ " "+j);
					 }
			 }

	}

}
