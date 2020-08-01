import java.util.LinkedList;

public class LinkedlistExample2 {

	public static <E> void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList<String> al = new LinkedList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		System.out.println("Intial list of elements"+al);
		
		//adding an element at the specific position
		al.add(1,"Gaurav");
		
		System.out.println("After invoking the element"+al);
		
		LinkedList<String>al2 = new LinkedList<String>();
		al2.add("Sonoo");
		al2.add("Hanumat");
		
		//adding the second element to first element
		al.addAll(al2);
		
		System.out.println("After adding first element to second"+al);
		
		//adding second element at specific position
		al.addAll(1, al2);
		
		//adding the element at first positon
		al.addFirst("Ashok");
		
		System.out.println("After adding the first element"+al);
		
		//adding the element at last position
		al.addLast("Hasrsh");
		
		System.out.println("After adding last element"+al);

	}

}
