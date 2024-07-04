import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class StringServer
{

	public static void main(String[] args)
	{
		try 
		{
			ServerSocket ser= new ServerSocket(9420);
			
			Socket client = ser.accept();
			

		    DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			
			String rev="";
			String s = dis.readUTF();
			
			for(int i=s.length()-1;i>=0;i--)
			{
				rev=rev+s.charAt(i);
			}
			
			dos.writeUTF(rev);
			
			
			dis.close();
			dos.close();
			
			client.close();
			ser.close();
			
			
		}

		catch(Exception e)
		{
			System.out.println("\n SERVER ERROR :"+e.getMessage());
		
		}
	}

}
