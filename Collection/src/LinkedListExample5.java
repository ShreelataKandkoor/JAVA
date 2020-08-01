import java.util.LinkedList;

public class LinkedListExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating list of Books
		LinkedList<Book>list = new LinkedList<Book>();
		
		//Creating Books
		Book b1 = new Book(101,"Let us C","abcd",8);
		Book b2 = new Book(102,"Data Communication","yuyuy",6);
		Book b3 = new Book(103,"Operating System","ewewewer",5);
		
		//adding Books to list
		list.add(b1);
		list.add(b2);
		list.add(b3);

		
		
		//Traversing the list
		for(Book b:list) {
			
			System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);
		}
	}

}
