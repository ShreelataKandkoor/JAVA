import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient {

	public static void main(String[] args) throws Exception, IOException {
		// TODO Auto-generated method stub
		
		Socket s = new Socket("localhost",6666);
		
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		
		dout.writeUTF("Hello Server");
		
		dout.flush();
		
		s.close();

	}

}
