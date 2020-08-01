import java.util.ArrayList;

public class ArrayListExample6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String>list = new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Kumar");
		
		
		System.out.println("Traversing list through forEach()method");
		list.forEach(a->{
			System.out.println(a);
		});

	}

}
