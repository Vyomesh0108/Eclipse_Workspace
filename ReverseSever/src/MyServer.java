import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer
{

	public static void main(String[] args)
	{
		try
		{
			ServerSocket ser = new ServerSocket(4321);
			
			Socket client = ser.accept();
			
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			
			int n = dis.readInt();
			int r,rev=0;
			
			while(n>=1)
			{
				r=n%10;
				rev = (rev *10) +r;
				n=n/10;		
			}
			
			dos.writeInt(rev);
			
			dis.close();
			dos.close();
			client.close();
			ser.close();
			
			
			
		}
        catch(Exception e)
        {
        	System.out.print(" SERVER ERROR : "+e.getMessage());
        }
	}

}
