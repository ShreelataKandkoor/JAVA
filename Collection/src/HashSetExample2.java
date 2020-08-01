import java.util.HashSet;
import java.util.Iterator;

public class HashSetExample2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating Hashset and adding elemenst
		HashSet<String>set = new HashSet<String>();
		
		set.add("Ravi");
		set.add("pooja");
		set.add("Ravi");
		set.add("Vijay");
		
		
		//traversinng elements
	   Iterator<String>itr = set.iterator();
	   
	   while(itr.hasNext()) {
		   
		   System.out.println(itr.next());
	   }

	}

}
