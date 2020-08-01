import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String>al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Harsh");
		
		//Traversing the list of elements in reverse order
		Iterator<String> i = al.descendingIterator();
		
		while(i.hasNext()) {
			
			System.out.println(i.next());
		}

	}

}
