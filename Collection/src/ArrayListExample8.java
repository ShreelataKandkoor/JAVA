import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListExample8 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		//Creating user-defined class objects
		Student s1 = new Student(101,"Sonoo",23);
		Student s2 = new Student(102,"Ravi",21);
		Student s3 = new Student(103,"Hanumant",25);
		
		//Creating arraylist
		ArrayList<Student>al = new ArrayList<Student>();
		al.add(s1);
		al.add(s2);
		al.add(s3);
		
		//Getting Iterator
		Iterator itr = al.iterator();
		
		//traversing elements of ArrayList Objects
		while(itr.hasNext()) {
			Student st = (Student)itr.next();
			System.out.println(st.id+" "+st.name+" "+st.age);
		}
		
		
		

	}

}
