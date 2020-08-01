import java.util.ArrayList;
import java.util.LinkedList;

public class ArrayLinkedList {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>al = new ArrayList<String>();
		
		//creating arraylist
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ravi");
		al.add("Ajay");
		
		
		LinkedList<String>ll = new LinkedList<String>();
		ll.add("James");
		ll.add("Serena");
		ll.add("Swati");
		ll.add("Harsh");
		
		System.out.println("Arraylist"+al);
		
		System.out.println("Linked List"+ll);

	}

}
