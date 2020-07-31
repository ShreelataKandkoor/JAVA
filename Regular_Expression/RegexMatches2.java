package Regular_Expression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches2 {
	
	private static final String REGEX = "\\bcat\\b";
	private static final String INPUT ="cat cat cat cattle cat";

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Pattern p = Pattern.compile(REGEX);
		Matcher m = p.matcher(INPUT);
		int count = 0;
		
		while(m.find()) {
			
			count++;
			System.out.println("Match number "+count);
			System.out.println("start():"+m.start());
			System.out.println("end():"+m.end());
		}

	}

}
