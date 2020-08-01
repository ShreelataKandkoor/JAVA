import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating HashSet and adding elements
		HashSet<String>set = new HashSet();
		
		set.add("One");
		set.add("Two");
		set.add("Three");
		set.add("Four");
		
		Iterator<String>i = set.iterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}
	}

}
