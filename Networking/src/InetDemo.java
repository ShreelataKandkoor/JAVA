import java.net.InetAddress;
import java.net.UnknownHostException;

public class InetDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			InetAddress ip = InetAddress.getByName("");
			
			System.out.println("Host Name:"+ip.getHostName());
			
			System.out.println("IP Address:"+ip.getHostAddress());
			
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		

	}

}
