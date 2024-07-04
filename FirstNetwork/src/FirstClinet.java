import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.Socket;
import java.util.Scanner;

public class FirstClinet
{

	public static void main(String[] args)
	{
		
		  try 
		  {
		     Socket server= new Socket("localhost",1234);
		     
			  InetAddress ip = server.getInetAddress();
			  
			  System.out.println("\n CONNECTED SERVER : "+ip.getLocalHost());
			  System.out.println("\n HOST :"+ip.getHostAddress()+" , "+ip.getHostName());
			  
			  DataInputStream dis = new DataInputStream(server.getInputStream());
			  DataOutputStream dos = new DataOutputStream(server.getOutputStream());
			  Scanner scan = new Scanner(System.in);
			  String msg="";
			  
			  while(!msg.equalsIgnoreCase("quit"))
			  {
				   msg = dis.readUTF();
				   System.out.println("\n MSG FROM SERVER : "+msg);
				   
				   System.out.println("\n ENTER MSG FOR SERVER : ");
				   msg=scan.nextLine();
				   dos.writeUTF(msg);

				 
			  }

		
			  
			  
			  dis.close();
			  dos.close();
			  
			 server.close();  
			  
			  
			  
		  }
		catch(Exception e)
		  {
			  System.out.println("\n SERVER ERROR : "+e.getMessage());
		  }


	}

}
