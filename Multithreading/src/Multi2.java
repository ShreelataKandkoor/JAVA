//Java Thread Example by implementing Runnable Interface..
public class Multi2 implements Runnable{
	
	@Override
	public void run() {
		// TODO Auto-generated method stub
		
		System.out.println("Running...");
		
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Multi2 m1 = new Multi2();
		Thread t1 = new Thread(m1);
		t1.start();

	}



}
