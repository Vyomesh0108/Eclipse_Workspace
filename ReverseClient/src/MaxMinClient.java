import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.Socket;
import java.util.Scanner;

public class MaxMinClient
{

	public static void main(String[] args)
	{
		try 
		{
			Socket soc = new Socket("localhost",9420);
			
			DataInputStream dis = new DataInputStream(soc.getInputStream());
			DataOutputStream dos = new DataOutputStream(soc.getOutputStream());
			
			Scanner scan = new Scanner(System.in);
			
			int a[] = new int[10];
			int i,max = 0 , min=0;
			
			for(i=0;i<a.length;i++)
			{
				System.out.print("\n ENTER NUMBER "+(i+1)+" : ");
				a[i] = scan.nextInt();
			    dos.writeInt(a[i]);
			}
			
			max = dis.readInt();
			min = dis.readInt();
			
			System.out.println("\n MAX :"+max);
			System.out.println("\n MIN :"+min);
			
			dis.close();
			dos.close();
			
			soc.close();
		}

		catch(Exception e)
		{
			System.out.println("\n CLIENT ERROR :"+e.getMessage());
		}

	}

}
