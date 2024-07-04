import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MyClient
{

	public static void main(String[] args)
	{
		try 
		{
			Socket ser = new Socket("localhost",5678);
			
			DataInputStream dis = new DataInputStream(ser.getInputStream());
			DataOutputStream dos = new DataOutputStream(ser.getOutputStream());
			Scanner scan = new Scanner(System.in);
			String fna="";
			
			System.out.println("\n ENTER FILE NAME : ");
			fna = scan.nextLine();
			
			dos.writeUTF(fna);
			
			String msg = dis.readUTF();
			
			System.out.println("\n\n "+msg);
			
			if(msg.equals("FILE EXISTS"))
			{
				 /*FileWriter fw = new FileWriter("src//"+fna);  //creates new file and open it to write
				
				String data = dis.readUTF();
				
				fw.write(data);
				fw.close(); */
				
				FileOutputStream fos = new FileOutputStream("src//"+fna);
				int n=0;
				
				while(n!=-1)
				{
					n = dis.readInt();
					fos.close();
					
				}
				
				System.out.println("\n 1FILE DOWNLOAD SUCCESSFULLY .....");
				
			}
			
			
			
			dis.close();
			dos.close();
			ser.close();
			
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("\n FILE ERROR :"+e.getMessage());
		
		}

	}

}
