import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class MyServer
{

	public static void main(String[] args) 
	{
		try 
		{
			ServerSocket ser = new ServerSocket(5678);
			
			System.out.println("\n SERVER IS WAITING ...");
			Socket client = ser.accept();
			
			DataInputStream dis = new DataInputStream(client.getInputStream());
			DataOutputStream dos = new DataOutputStream(client.getOutputStream());
			
			String fna  = dis.readUTF();
			
			File f1 = new File("src//"+fna);
			
			if (!f1.exists())   // file nathi 
			{
				dos.writeUTF("FILE DOESNT EXISTS :");
			}
			else
			{
				dos.writeUTF("FILE EXISTS :");
				
				/*FileReader fr = new FileReader("src//"+fna);
				BufferedReader br = new BufferedReader(fr);
				
				String line="",data="";
				
				while(line!=null)
					 line=br.readLine();
					
					if(line!=null)
					{
					   data = data+line+"\n";
					}
				
				dos.writeUTF(data);
				
				fr.close();    */
				
				FileInputStream fis = new FileInputStream("src//"+fna);
				int n=0;
				
				while(n!=1)
				{
					n=fis.read();
				
				  
					  fis.close();
					  
				}
			}
			
			
			dis.close();
			dos.close();
			client.close();
			ser.close();
			
				
			
			
			
		}
		catch(Exception e)
		{
			System.out.println("\n FILE ERROR :"+e.getMessage());
		
		}
			
	}

}
