import java.util.ArrayList;
import java.util.List;

public class ListExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>al = new ArrayList<String>();
		al.add("amit");
		al.add("Vijay");
		al.add("Kumar");
		al.add("sachin");
		
		System.out.println("An Element at 2nd posistion:"+al.get(2));
		
		
		for(String s:al) {
			
			System.out.println(s);
		}

	}

}
