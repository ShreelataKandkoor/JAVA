import java.io.IOException;
import java.net.HttpURLConnection;
import java.net.MalformedURLException;
import java.net.URL;

public class HttpURLConnectionDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		try {
			URL url = new URL("http://www.google.com");
			
			try {
				HttpURLConnection huc = (HttpURLConnection)url.openConnection();
				
				for(int i=1;i<=8;i++) {
					
					System.out.println(huc.getHeaderFieldKey(i)+"="+huc.getHeaderField(i));
				}
				
				huc.disconnect();
				
				
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			
			
		} catch (MalformedURLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
