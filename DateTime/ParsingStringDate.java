package DateTime;

import java.text.SimpleDateFormat;
import java.util.Date;

public class ParsingStringDate {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		SimpleDateFormat ft = new SimpleDateFormat("yyyy-MM-dd");
		String input = args.length == 0 ? "1818-11-11" :args[0];
		
		System.out.println(input+ "Parses as");
		Date t;
		
		try {
			
			t = ft.parse(input);
			System.out.println(t);
			
		}catch(Exception e) {
			
			System.out.println("Unparseable using"+ft);
		}

	}

}
