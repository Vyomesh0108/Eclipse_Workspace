
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;

public class UpperLowerClient
{

	public static void main(String[] args) 
	{

		try
		{
			Socket soc = new Socket("localhost",108);
			
			DataInputStream dis = new DataInputStream(soc.getInputStream());
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			
			
			
			
			dis.close();
			dos.close();
			
			soc.close();
		}
        catch(Exception e)
		{
        	System.out.println("\n CLIENT ERROR : "+e.getMessage());
        	
		}
		
		
		

	}

}
