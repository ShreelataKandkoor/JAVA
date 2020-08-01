import java.io.FileNotFoundException;
import java.io.PrintWriter;

//handle Checked Exception
public class TryCatchException8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		PrintWriter pw;
		
		try {
			
			pw = new PrintWriter("jtp.txt");//mat throw an exception
			pw.println("saved");		
		}
		//providing the checked exception handler
		catch(FileNotFoundException e) {
			
			System.out.println(e);
		}
		
		System.out.println("File saved successfully.");

	}

}
