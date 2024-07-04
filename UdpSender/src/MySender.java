import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class MySender 
{

	public static void main(String[] args)
	{
		try
		{
			
			DatagramSocket d2 = new DatagramSocket(4321);
			String msg="";
			byte b[] = new byte[1024];
			DatagramPacket packet = null ;
			   
			Scanner scan = new Scanner(System.in);
			System.out.println("\n ENTER STRING :");
			msg = scan.nextLine();
			
			b = msg.getBytes();
			InetAddress ip = InetAddress.getByName("localhost");  // localhost means your recevier is on the same machine 
			packet = new DatagramPacket(b,b.length,ip,1234);
			d2.send(packet);
			
			packet = new DatagramPacket(b,b.length);
			d2.receive(packet);
			b = packet.getData();
			msg = new String(b);
			System.out.println("\n CONVERTED : "+msg);
			
			
			
			
		}
        catch(Exception e)
		{
        	System.out.println("\n SENDER ERROR :"+e.getMessage());
        	
		}

	}

}
