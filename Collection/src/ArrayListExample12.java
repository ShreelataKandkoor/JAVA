import java.util.ArrayList;

public class ArrayListExample12 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Ajay");
		
		System.out.println("Before update:"+al.get(1));
		
		//update an element at specific position
		al.set(1, "Gaurav");
		System.out.println("After update:"+al.get(1));
		

	}

}
