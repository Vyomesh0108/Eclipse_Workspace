import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.net.InetAddress;
import java.util.Scanner;

public class MyRecevier
{

	public static void main(String[] args) 
	{
		
         try
         {
        	 DatagramSocket ds1 = new DatagramSocket(7809);
        	 String msg="";
        	 byte b[] = new byte[1024];
        	 DatagramPacket packet=null;
        	 Scanner scan = new Scanner(System.in);
        	 
        	 
        	 while(!msg.equals("quit"))
        	 {
        		 
        		 packet = new DatagramPacket(b,b.length);
        		 ds1.receive(packet);
        		 b=packet.getData();
        		 msg = new String(b);
        		 System.out.println("\n MSG FROM SENDER :"+msg);
        		
        		 
        		 System.out.println(" MSG TO SENDER : ");
        		 msg=scan.nextLine();
        		 b = msg.getBytes();
        		 InetAddress ip = InetAddress.getByName("localhost");
        		 packet = new DatagramPacket(b,b.length,ip,5678);
        		 ds1.send(packet);
        		
        		 
        	 }
        	 ds1.close();
        	 
         }
         catch(Exception e)
         {
        	 System.out.println("\n RECEVIER ERROR :"+e.getMessage());
        	 
         }
	}

}
