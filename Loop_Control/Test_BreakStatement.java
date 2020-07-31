package Loop_Control;

public class Test_BreakStatement {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int []num = {10,20,30,40,50};
		for(int i : num) {
			
			if(i==30) {
				break;
			}
			
			System.out.println(i);
			
		}

	}

}
