package RuntimePolymorphism;

//Runtime polymorphism with Data Memeber

public class Honda extends Bike4{
	
	int speedlimit =150;

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Bike4 obj = new Honda();
		
		System.out.println(obj.speedlimit);
		
		

	}

}
