import java.net.DatagramPacket;
import java.net.DatagramSocket;
import java.util.Scanner;

public class ReverseServer
{

	public static void main(String[] args)
	{
		try
		{
			DatagramSocket d1 = new DatagramSocket(4321);
			String msg="";
			byte b[] = new byte[1024];
			DatagramPacket packet=null;
			
			Scanner scan = new Scanner(System.in);
			System.out.println("\n ENTER STRING :");
			msg = scan.nextLine();
			
			
			
			
		}
	    catch(Exception e)
		{
	    	System.out.println(" \n SERVER ERROR :"+e.getMessage());
		}

	}

}
