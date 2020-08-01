import java.util.HashSet;

public class HashSetExample5 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		HashSet<Studybook>set = new HashSet<Studybook>();
		
		//Creating Books
		Studybook b1 = new Studybook(101,"Let Us C","Yashwant Kanetkar",8);
		Studybook b2 = new Studybook(102,"Data Communication","Forouzan",6);
		Studybook b3 = new Studybook(103,"Operating System","Galvin",2);
		
		//Adding Books to HashSet
		set.add(b1);
		set.add(b2);
		set.add(b3);
		
		//Traversing Hashset
		for(Studybook b:set)
		System.out.println(b.id+" "+b.name+" "+b.author+" "+b.quantity);

	}

}
