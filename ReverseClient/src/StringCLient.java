import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class StringCLient
{

	public static void main(String[] args) 
	{
		try 
		{
		    Socket soc = new Socket("localhost",9420);
		    
		    DataInputStream dis = new DataInputStream(soc.getInputStream());
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			
			Scanner scan = new Scanner(System.in);
			
			System.out.print("\n ENTER STRING : ");
			String s = scan.nextLine();
			dos.writeUTF(s);
			
			String rev = dis.readUTF();
			
			System.out.println("\n REVERSE :"+rev);
			
			dis.close();
			dos.close();
			
			soc.close();
			
;
			
		}

		catch(Exception e) 
		{
			 System.out.println("\n SERVER ERROR : "+e.getMessage());
				
		}

	}

}
