import java.util.HashSet;

public class HashsetExample3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		HashSet<String>set = new HashSet<String>();
		set.add("Ravi");
		set.add("Vijay");
		set.add("Arun");
		
		System.out.println("An initial list of elements:"+set);
		
		//Removing specific element from HashSet
		set.remove("Ravi");
		System.out.println("After invoking remove method:"+set);
		
		HashSet<String>set1 = new HashSet<String>();
		set1.add("Ajay");
		set1.add("Gaurav");
		set.addAll(set1);
		
		System.out.println("Updated List:"+set);
		
		set.removeAll(set1);
		System.out.println("After removeIf elements:"+set);
		
		//Removing elements on the basis pof specified conditon
		set.removeIf(str->str.contains("Vijay"));
		
		System.out.println("After applying removeIf condition elements:"+set);
		
		set.clear();
		
		System.out.println("After clear method:"+set);

	}

}
