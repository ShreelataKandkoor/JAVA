import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedHashSet<Book>set = new LinkedHashSet<Book>();
		
		Book b1 = new Book(101,"Let Us C","Yashwant Kanetkar",8);
		Book b2 = new Book(102,"DataCommunication","Forouzan",5);
		Book b3 = new Book(103,"Operating System","Galvin",2);
		
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		//Travsering hash table
		
		for(Book b:set) {
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
		

	}
	}

}
