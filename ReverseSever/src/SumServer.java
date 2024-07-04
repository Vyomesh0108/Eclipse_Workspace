import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class SumServer
{

	public static void main(String[] args)
	{
	
		try
		{
			
			ServerSocket ser = new ServerSocket(235);
			
			Socket client = ser.accept();
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			
			int a[]=new int[10];
			int i,s=0;
			
			for(i=0;i<a.length;i++)
			{
				a[i]=dis.readInt();
				s = s+a[i];

			}
			
			dos.writeInt(s);
			
		
			
			
			
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
