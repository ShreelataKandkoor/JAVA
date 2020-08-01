import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.InputStream;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class ArrayListExample9 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String>al = new ArrayList<String>();
		al.add("Ravi");
		al.add("Vijay");
		al.add("Raja");
		
		//Serialization
		try {
			FileOutputStream fos = new FileOutputStream("C://Users//dell//Desktop//file.txt");
			ObjectOutputStream oos = new ObjectOutputStream(fos);
			oos.writeObject(al);
			fos.close();
			oos.close();
			
			//Deserialization
			InputStream fis = new FileInputStream("C://Users//dell//Desktop//file.txt");
			ObjectInputStream ois = new ObjectInputStream(fis);
			ArrayList list =(ArrayList)ois.readObject();
			System.out.println(list);
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
