import java.io.DataInputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		ServerSocket ss;
		try {
			ss = new ServerSocket(6666);
			
			Socket s = ss.accept();//establishes connection
			
			DataInputStream dis = new DataInputStream(s.getInputStream());
			
			String str = (String)dis.readUTF();
			
			System.out.println("message="+str);
			
			ss.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		

	}

}
