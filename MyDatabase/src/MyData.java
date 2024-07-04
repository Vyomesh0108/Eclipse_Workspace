import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class MyData
{

	public static void main(String[] args)
	{
		try 
		{
		   Class.forName("com.mysql.jdbc.Driver");
		   
		   System.out.println("\n DRIVER ACTIVATED SUCCESSFULLY");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
		      //DriverManager.getConnection(url,username,password);
		   
		   System.out.println("\n DATABASE CONNECTED SUCCESSFULLY");
			
		   Statement st = con.createStatement();
		   
		   /*st.executeUpdate("insert into mytab values(6,'zinal',18)");*/
		   
		   st.executeUpdate("delete from mytab where sid=5");
		   
		   
		   /*
		   ResultSet rs = st.executeQuery("select * from mytab");
		   
		   while(rs.next())
		   {
			   int id = rs.getInt("sid");
			   String na = rs.getString("sna");
			   int ag = rs.getInt(3);
			   
			   System.out.println("\n ID = "+id+",  NAME = "+na+" ,  AGE = "+ag);
			   
					   
		   }
		   
		   rs.close();*/
		   st.close();
		   con.close();
		   
			
		}
        catch(Exception e)
		{
        	System.out.println("\n ERROR :"+e.getMessage());
		}
	}

}
