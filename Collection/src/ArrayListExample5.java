import java.util.ArrayList;

public class ArrayListExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
ArrayList<String>list = new ArrayList<String>();
		
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ajay");
		list.add("Kumar");
		
		System.out.println("Traversing list through for loop");
		for(int i=0;i<list.size();i++) {
			
			System.out.println(list.get(i));
		}

	}

}
