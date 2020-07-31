package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String line =  "This order was placed for QT3000! ok?";
		String pattern = "(.*)(\\d+)(.*)";
		
		//Create a pattern Object
		Pattern r = Pattern.compile(pattern);
		
		//Now create matchers object
		Matcher m = r.matcher(line);
		
		if(m.find()) {
			
			System.out.println("Found value:"+m.group(0));
			System.out.println("Found value:"+m.group(1));
			System.out.println("Found value:"+m.group(2));
		}else {
			System.out.println("No Match");
		}

	}

}
