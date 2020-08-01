import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.net.SocketException;
import java.net.UnknownHostException;

public class DSender {

	public static void main(String[] args) throws Exception {
		// TODO Auto-generated method stub
		
		try {
			DatagramSocket ds = new DatagramSocket();
		} catch (SocketException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String str = "Welcome";
		
		InetAddress ip =InetAddress.getByName("127.0.0.1");
		
		DatagramPacket dp = new DatagramPacket(str.getBytes(),str.length(),ip,3000);

	}

}
