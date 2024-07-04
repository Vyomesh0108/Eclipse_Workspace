import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.InetAddress;
import java.net.URL;
import java.net.URLConnection;

public class MyNetwork 
{

	public static void main(String[] args) 
	{
	    try
	    {
	    	
	    	InetAddress ip = InetAddress.getLocalHost();
	    	
	    	System.out.println("\n current device : "+ip);
	    	
	    	ip = InetAddress.getByName("www.facebook.com");
	    	System.out.println("\n facebook : "+ip);
	    	
	    	InetAddress ad[] = InetAddress.getAllByName("www.facebook.com");
	    	
	    	for(int i=0;i<ad.length;i++)
	    	{
	    		System.out.println("  "+ad[i]);
	    	}
	    	
	    	URL url = new URL("http://www.google.com/index.html");  //uniform resource locator
	    	
	    	System.out.println("\n PROTOCOL : "+url.getProtocol());
	    	System.out.println(" FILE NAME : "+url.getFile());
	    	System.out.println(" PATH NAME : "+url.getPath());
	    	System.out.println(" HOST : "+url.getHost());
	    	System.out.println(" PORT : "+url.getPort());
	    	
	    	URLConnection urlCon = url.openConnection();
	    	
	    	BufferedReader br = new BufferedReader(new InputStreamReader(urlCon.getInputStream()));
	    	
	    	String line="",data="";
	    	
	    	while(line!=null)
	    	{
	    		line = br.readLine();
	    		     if(line!=null)
	    		     {
	    		    	 System.out.println(line);
	    		     }
	    	}
	    	
	    	br.close();
	  
	    	
	    	
	    	
	    	
	    	
	    }
        catch(Exception e)
	    {
        	System.out.println("\n ERROR  :"+e.getMessage());
	    }
	}

}
