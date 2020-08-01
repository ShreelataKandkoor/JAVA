import java.io.BufferedReader;
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;

public class MyClient2 {

	public static void main(String[] args) throws Exception, Exception {
		// TODO Auto-generated method stub
		
		Socket s = new Socket("localhost",7777);
		
		DataInputStream din = new DataInputStream(s.getInputStream());
		
		DataOutputStream dout = new DataOutputStream(s.getOutputStream());
		
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		
		String str = "",str2="";
		
		while(!str.equals("stop")) {
			
			str=br.readLine();
			
			dout.writeUTF(str);
			
			dout.flush();
			
			str2 = din.readUTF();
			
			System.out.println("Server says:"+str2);
		}

	}

}
