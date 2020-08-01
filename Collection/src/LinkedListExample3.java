import java.util.LinkedList;

public class LinkedListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		LinkedList al = new LinkedList();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Raju");
		al.add("Ajay");
		
		System.out.println("Intial list"+al);
		
		//removving specific element from the list
		al.remove("Vijay");
		
		System.out.println("After removing the elemnt"+al);
		
		//removing the elements on the basis of index
		al.remove(0);
		System.out.println("Removing the element"+al);
		
		
		al.add("Ravi");
		al.add("Vijay");
		
		System.out.println(al);
		
		LinkedList<String>al2 = new LinkedList<String>();
		al2.add("Ravi");
		al2.add("Vijay");
		
		System.out.print(""+al2);
		
        al.addAll(2, al2);
        
        System.out.println(al);
        
        al.removeAll(al2);
        System.out.println(al);
        
        al.clear();
        System.out.println(al);

	}

}
