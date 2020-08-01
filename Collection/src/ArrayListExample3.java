import java.util.ArrayList;

public class ArrayListExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ArrayList<String>list = new ArrayList<String>();
		list.add("Ravi");
		list.add("Vijay");
		list.add("Ravi");
		list.add("Ajay");
		
		for(String obj:list) {
			
			System.out.println(obj);
		}

	}

}
