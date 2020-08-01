
public class Multi extends Thread{

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Multi t1 = new Multi();
		t1.start();
		t1.start();//thread cannot be run twice
	}
	
	public void run()
	{
		System.out.println("running...");
	}
}
