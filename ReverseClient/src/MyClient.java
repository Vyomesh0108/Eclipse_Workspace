import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClient
{

	public static void main(String[] args)
	{
		try
		{
		   Socket soc= new Socket("localhost",4321);
		   
		   DataInputStream dis = new DataInputStream(soc.getInputStream());
		   DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
		   
		   Scanner scan = new Scanner(System.in);
		   int no;
		   
		   System.out.print(" \n ENTER NO : ");
		   no=scan.nextInt();
		   
		   dos.writeInt(no);
		   
		   no = dis.readInt();
		   
		   
		   System.out.println("\n\n REVERSE = "+no);
		   
		   
		   
		   dis.close();
		   dos.close();
		   soc.close();
				   
				   
			
		}
        catch(Exception e)
        {
        	System.out.print(" CLIENT ERROR : "+e.getMessage());
        }
	}

}
