import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;

public class MyRecevier 
{

	public static void main(String[] args)
	{
		try
		{
			
		   DatagramSocket d1= new DatagramSocket(1234);
		   String msg="";
		   byte b[] = new byte[1024];
		   DatagramPacket packet = null ;
		   
		   packet = new DatagramPacket(b,b.length);
		   d1.receive(packet);
		   b = packet.getData();
		   msg = new String(b);
		   
		   
		   msg = msg.toUpperCase();
		   b = msg.getBytes();
		   InetAddress ip = InetAddress.getByName("localhost");
		   packet = new DatagramPacket(b,b.length,ip,4321);
		   d1.send(packet);
		   
		   
		}
        catch(Exception e)
		{
        	System.out.println("\n RECEVIER ERROR :"+e.getMessage());
        	
		}
	}

}
