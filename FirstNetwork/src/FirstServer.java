
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.InetAddress;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class FirstServer 
{

	public static void main(String[] args)
	{
		  try 
		  {
			  ServerSocket ser = new ServerSocket(1234);  // created server with port no 1234
			  
			  System.out.println("\n\n SERVER IS WAITING......");
			  
			  Socket client = ser.accept();
			  
			  System.out.println("\n\n WEL-COME CLIENT : ");
			  
			  InetAddress ip = client.getInetAddress();
			  
			  System.out.println("\n CONNECTED CLIENT : ");
			  System.out.println("\n HOST :"+ip.getHostAddress()+" , "+ip.getHostName());
			  
			  DataInputStream dis = new DataInputStream(client.getInputStream());
			  DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			  Scanner scan = new Scanner(System.in);
			  String msg="";
			  
			  while(!msg.equalsIgnoreCase("quit"))
			  {
				   System.out.println("\n ENTER MSG FOR CLIENT : ");
				   msg=scan.nextLine();
				   dos.writeUTF(msg);

				   msg = dis.readUTF();
				   System.out.println("\n MSG FROM CLIENT  : "+msg);
				   
				   
			  }
			
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
