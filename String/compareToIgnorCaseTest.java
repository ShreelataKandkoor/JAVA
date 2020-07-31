package String;

public class compareToIgnorCaseTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str1 = "String are immutable";
		String str2 = new String("String are immutable");
		String str3 = new String("yyyhmj kjkkkjkj jhjhjkjkj hjhjmnmnm");
		
		
		int result = str1.compareToIgnoreCase(str2);
		System.out.println(result);
		
		result = str2.compareToIgnoreCase(str3);
		System.out.println(result);

	}

}
