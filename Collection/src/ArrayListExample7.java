import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample7 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String>list = new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Kumar");
		
		System.out.println("Traversing list through forEachRemainging() method:");
		Iterator<String>itr = list.iterator();
		itr.forEachRemaining(a->{
			
			System.out.println(a);
		});

	}

}
