import java.util.ArrayList;

public class ArrayListExample10 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al = new ArrayList<String>();
		System.out.println("Inital list of elements:"+al);
		
		//adding elements to the end of the list
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		System.out.println("After invoking add method"+al);
		
		//adding the element at specific position
		al.add(2,"Gaurav");
		
		System.out.println("After invoking add method"+al);
		
		ArrayList<String>al2 = new ArrayList<String>();
		al2.add("Jhon");
		al2.add("Rahul");
		
		//adding second list eleement to the first list at specific position
		al2.addAll(1, al);
		
		System.out.println("After invoking addAll method:"+al2);
		
		al.remove("Ravi");
		
		System.out.println("After removing the elements"+al2);

	}

}
