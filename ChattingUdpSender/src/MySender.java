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
        	 DatagramSocket ds2 = new DatagramSocket(5678);
        	 String msg="";
        	 byte b[] = new byte[1024];
        	 DatagramPacket packet=null;
        	 Scanner scan = new Scanner(System.in);
        	 
        	 while(!msg.equals("quit"))
        	 {
        		 System.out.println(" MSG TO RECEVIER : ");
        		 msg=scan.nextLine();
        		 b = msg.getBytes();
        		 InetAddress ip = InetAddress.getByName("localhost");
        		 packet = new DatagramPacket(b,b.length,ip,7890);
        		 ds2.send(packet);
        		 
        		 packet = new DatagramPacket(b,b.length);
        		 ds2.receive(packet);
        		 b=packet.getData();
        		 msg = new String(b);
        		 System.out.println(" MSG FROM RECEVIER :"+msg);
        		 
        		 
        	 }
       	     ds2.close();
       	     
       	 
        }
        catch(Exception e)
        {
       	 System.out.println("\n SENDER ERROR :"+e.getMessage());
       	 
        }

	}

}
