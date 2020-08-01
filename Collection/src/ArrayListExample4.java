import java.util.ArrayList;
import java.util.ListIterator;

public class ArrayListExample4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list = new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Kumar");
		
		System.out.println("Traversing list through list iterator");
		//Here element iterates in reverse order
		ListIterator<String>list1 = list.listIterator(list.size());
		while(list1.hasPrevious()) {
			
			String str = list1.previous();
			System.out.println(str);
		}
		

	}

}
