import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class UpperLowerServer
{

	public static void main(String[] args)
	{
	
		try
		{
			ServerSocket ser = new ServerSocket(108);
			Socket client = ser.accept();
			
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			
			
			
			dis.close();
			dos.close();
			
			client.close();
			ser.close();
			
			
		}
        catch(Exception e)
		{
        	System.out.println("\n SERVER ERROR : "+e.getMessage());
        	
		}
	}

}
