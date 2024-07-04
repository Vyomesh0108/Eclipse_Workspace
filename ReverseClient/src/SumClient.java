import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class SumClient 
{

	public static void main(String[] args)
	{
		try
		{
			
			Socket soc = new Socket("localhost",235);
			DataInputStream dis = new DataInputStream(soc.getInputStream());
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			
			int a[] = new int[10];
			int i,sum=0;
			Scanner scan = new Scanner(System.in);
			
			for(i=0;i<a.length;i++)
			{
				System.out.print("ENTER NO :");
				a[i] = scan.nextInt();
				dos.writeInt(a[i]);
			}
			
			sum=dis.readInt();
			
			System.out.println("\n SUM ="+sum);
			
			
			
			
			
			dis.close();
			dos.close();
			
			soc.close();
			
		}
		catch(Exception e)
		{
			System.out.println("\n CLIENT ERROR : "+e.getMessage());
		}

	}

}
