import java.util.ArrayList;
import java.util.List;
import java.util.ListIterator;

public class ListIteratorExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		List<String>al = new ArrayList<String>();
		al.add("ravi");
		al.add("vijay");
		al.add("kumar");
		al.add("harsh");
		
		ListIterator<String> itr = al.listIterator();
		
		System.out.println("Traversing element in forward direction");
		while(itr.hasNext()) {
			System.out.println("index: " +itr.nextIndex()+ " value " +itr.next());
		}
		
		
		System.out.println("Traversing element in backward direction");
		
		while(itr.hasPrevious()) {
			System.out.println("index: " +itr.previousIndex()+ " value " +itr.previous());
		}
		

	}

}
