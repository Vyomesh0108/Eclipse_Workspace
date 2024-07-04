import java.io.FileInputStream;
import java.sql.CallableStatement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.sql.Types;
import java.util.Scanner;

class DataOperation
{
	Scanner scan = new Scanner(System.in);
	
	void show()
	{
       try
       {
    	   Class.forName("com.mysql.jdbc.Driver");   //TO ACTIVATE DRIVER
    	   System.out.println("\n DRIVER ACTIVATED");
    	   
    	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
    	   System.out.println("\n DATABASE CONNECTED...");
    	   
    	   Statement st = con.createStatement();
    	   ResultSet rs = st.executeQuery("select * from mytab");
    	   
    	   ResultSetMetaData rsm = rs.getMetaData();
    	   
    	   System.out.println("\n TABLE NAME : "+rsm.getTableName(1));
    	   System.out.println("\n COLUMNS : "+rsm.getColumnCount());
    	   for(int i=1;i<=rsm.getColumnCount();i++)
    	   {
    		   System.out.println(" "+rsm.getColumnName(i)+" , "+rsm.getColumnTypeName(i));
    	   }
    	   
    	   while(rs.next())
    	   {
    		   int id = rs.getInt("sid");  //rs.getInt(1);
    		   String na = rs.getString(2);
    		   int age = rs.getInt(3);
    		   
    		   System.out.print("\n ID = "+id+" , NAME = "+na+" , AGE="+age);
    	   }
    	   
    	   rs.close();
    	   st.close();
    	   con.close();
    	   
       }
       catch(Exception e)
       {
    	   System.out.println("\n READ ERROR :"+e.getMessage());
       }
	}
	
	void insert()
	{
		try
		{
			int id;
			String na;
			int age;
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
			Statement st = con.createStatement();
			
			System.out.print("ENTER ID - NAME - AGE :");
			id=scan.nextInt();
			na = scan.next();
			age = scan.nextInt();
			
			//st.executeUpdate("insert into mytab values(1,'hello',10)");
			
			st.executeUpdate("insert into mytab values("+id+",'"+na+"',"+age+")");
			
			st.close();
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("\n INSERT ERROR :"+e.getMessage());
		}
	}
	
	void delete()
	{
		
		try 
		{
			int id;
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
		   Statement st = con.createStatement();
		   
		   System.out.print(" ENTER ID :");
		   id=scan.nextInt();
		   
		   st.executeUpdate("delete from mytab where sid="+id);
		   
		   st.close();
		   con.close();
		   
		}
		catch(Exception e)
		{
			System.out.println("\n DELETE ERROR :"+e.getMessage());
		}
		
	}
	
	void update()
	{
		try
		{
			int id;
			String na;
			int age;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
			Statement st = con.createStatement();
			
			System.out.print("ENTER ID - NAME-AGE ");
			id=scan.nextInt();
			na=scan.next();
			age=scan.nextInt();
			
			st.executeUpdate("update mytab set sna='"+na+"', sag ="+age+" where sid="+id);
			
			st.close();
			con.close();
			
			
		}
		catch(Exception e)
		{
			System.out.println("\n UPDATE ERROR :"+e.getMessage());
		}
	}
	
	void prepared()
	{
		try
		{
			int id=1;
			String na;
			int age;
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
			//Statement st = con.createStatement();
			PreparedStatement pst = con.prepareStatement("insert into mytab values(?,?,?)");
			
			while(id!=0)
			{
			System.out.print("ENTER ID - NAME - AGE :");
			id=scan.nextInt();
			na = scan.next();
			age = scan.nextInt();
			
			if(id!=0)
			{
				pst.setInt(1, id);
				pst.setString(2, na);
				pst.setInt(3, age);
				
				pst.execute();
			}
			//st.executeUpdate("insert into mytab values(1,'hello',10)");
			
			//st.executeUpdate("insert into mytab values("+id+",'"+na+"',"+age+")");
			}
		    pst.close();
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("\n INSERT ERROR :"+e.getMessage());
		}
	
	}
	
	void preparedelete()
	{
		try 
		{
			int id=1;
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
		   //Statement st = con.createStatement(); 
		   PreparedStatement pst = con.prepareStatement("delete from mytab where sid=?");
		   
		   while(id!=0)
		   {
		   System.out.print(" ENTER ID :");
		   id=scan.nextInt();
		   
		   if(id!=0)
		   {
			   pst.setInt(1, id);
			   
			   pst.execute();
		   }
		  // st.executeUpdate("delete from mytab where sid="+id);
		   
		   }
		   pst.close();
		   con.close();
		   
		}
		catch(Exception e)
		{
			System.out.println("\n DELETE ERROR :"+e.getMessage());
		}
		
	}
	
	void preparedUpdate()
	{
		try
		{
			int id=1;
			String na;
			int age;
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
			//Statement st = con.createStatement();
			PreparedStatement pst = con.prepareStatement("update mytab set sna=(?) , sag=(?) ,where sid=(?)");
			
			while(id!=0)
			{
			  System.out.print("ENTER ID - NAME-AGE ");
			  id=scan.nextInt();
			  na=scan.next();
			  age=scan.nextInt();
			  
			  if(id!=0)
			  {
				  pst.setString(1,na);
				  pst.setInt(2, age);
				  pst.setInt(3, id);
				  
				  pst.execute();
				  
			  }
			
			
			//st.executeUpdate("update mytab set sna='"+na+"', sag ="+age+" where sid="+id);
			}
			pst.close();
			con.close();
			
	   
		}
	
		catch(Exception e)
		{
			System.out.println("\n UPDATE ERROR :"+e.getMessage());
		}
	}
	
	void callableInsert()
	{
		try
		{
			int id=1;
			String na;
			int age;
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
			//Statement st = con.createStatement();
			//PreparedStatement pst = con.prepareStatement("insert into mytab values(?,?,?)");
			
		    CallableStatement cst = con.prepareCall(" { call insQ(?,?,?) } ");
		    
			while(id!=0)
			{
			System.out.print("ENTER ID - NAME - AGE :");
			id=scan.nextInt();
			na = scan.next();
			age = scan.nextInt();
			
			if(id!=0)
			{
				cst.setInt(1, id);
				cst.setString(2, na);
				cst.setInt(3, age);
				
				cst.execute();
			}
			//st.executeUpdate("insert into mytab values(1,'hello',10)");
			
			//st.executeUpdate("insert into mytab values("+id+",'"+na+"',"+age+")");
			}
		    cst.close();
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("\n INSERT ERROR :"+e.getMessage());
		}
	
		
	}
	
	void callableDelete()
	{
		try 
		{
			int id=1;
		   Class.forName("com.mysql.jdbc.Driver");
		   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
		   //Statement st = con.createStatement(); 
		   // PreparedStatement pst = con.prepareStatement("delete from mytab where sid=?");
		   
		   CallableStatement cst = con.prepareCall(" {call delQ(?) }");
		   
		   while(id!=0)
		   {
		   System.out.print(" ENTER ID :");
		   id=scan.nextInt();
		   
		   if(id!=0)
		   {
			   cst.setInt(1, id);
			   
			   cst.execute();
		   }
		  // st.executeUpdate("delete from mytab where sid="+id);
		   
		   }
		   cst.close();
		   con.close();
		   
		}
		catch(Exception e)
		{
			System.out.println("\n DELETE ERROR :"+e.getMessage());
		}
		
	}
	
	void callableOut()
	{
		try
		{
			int id=1;
			String na;
			
			Class.forName("com.mysql.jdbc.Driver");
			Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
			//Statement st = con.createStatement();
			//PreparedStatement pst = con.prepareStatement("insert into mytab values(?,?,?)");
			
		    CallableStatement cst = con.prepareCall(" { call with_out(?,?) } ");
		    
			while(id!=0)
			{
			System.out.print("ENTER ID - NAME - AGE :");
			id=scan.nextInt();
			
			if(id!=0)
			{
				cst.setInt(1, id);
		        cst.registerOutParameter(2, Types.VARCHAR);
				
				cst.execute();
				
				System.out.println("\n NAME = "+cst.getString(2));
			}
			//st.executeUpdate("insert into mytab values(1,'hello',10)");
			
			//st.executeUpdate("insert into mytab values("+id+",'"+na+"',"+age+")");
			}
		    cst.close();
			con.close();
			
		}
		catch(Exception e)
		{
			System.out.println("\n INSERT ERROR :"+e.getMessage());
		}
	
	}
	
	void updatable()
	{
		try
	       {
	    	   Class.forName("com.mysql.jdbc.Driver");   //TO ACTIVATE DRIVER
	    	   System.out.println("\n DRIVER ACTIVATED");
	    	   
	    	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
	    	   System.out.println("\n DATABASE CONNECTED...");
	    	   
	    	   Statement st = con.createStatement(ResultSet.TYPE_SCROLL_SENSITIVE, ResultSet.CONCUR_UPDATABLE);
	    	   
	    	   ResultSet rs = st.executeQuery("select * from stud");
	    	   
	    	   rs.absolute(3);
	    	   rs.updateString("sna","dhruvi");
	    	   rs.updateRow();
	    	  
	    	   rs.close();
	    	   st.close();
	    	   con.close();
	    	   
	       }
	       catch(Exception e)
	       {
	    	   System.out.println("\n READ ERROR :"+e.getMessage());
	       }
	}
	
	void batch()
	{
		try
	       {
	    	   Class.forName("com.mysql.jdbc.Driver");   //TO ACTIVATE DRIVER
	    	   System.out.println("\n DRIVER ACTIVATED");
	    	   
	    	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
	    	   System.out.println("\n DATABASE CONNECTED...");
	    	   
	    	   Statement st = con.createStatement();
	    	   
	    	   st.addBatch("insert into stud values(6,'KIRAN',30)");
	    	   st.addBatch("insert into stud values(7,'NEEL',35)");
	    	   st.addBatch("delete from stud where sid=3");
	    	   
	    	   st.executeBatch();
	    	   
	    	   st.close();
	    	   con.close();
	    	   
	       }
	       catch(Exception e)
	       {
	    	   System.out.println("\n READ ERROR :"+e.getMessage());
	       }
		
		
	}
	
	void uploadImage()
	{
		
		try
		{
			   Class.forName("com.mysql.jdbc.Driver");   //TO ACTIVATE DRIVER
	    	   Connection con = DriverManager.getConnection("jdbc:mysql://localhost/stddb","root","");
	    	   
	    	   PreparedStatement pst = con.prepareStatement("insert into imgtab values(?,?)");
	    	   
	    	   FileInputStream fis = new FileInputStream("src//i1.png");
	    	   
	    	   
	    	   pst.setInt(1, 101);
	    	   pst.setBinaryStream(2, fis);
	    	   pst.execute();
	    	   pst.close();
	    	   con.close();
	    	   
	    	   
			
			
		}
		catch(Exception e)
		{
			System.out.println("\n IMAGE ERROR :"+e.getMessage());
		}
	}
	
}


public class MyDatabase
{

	public static void main(String[] args)
	{
		Scanner scan = new Scanner(System.in);
		int ch=0;
		DataOperation dd = new DataOperation();
		
		while(ch!=14)
		{
			System.out.print("\n\n DATABASE MENU :");
			System.out.print("\n 1. SHOW ");
			System.out.print("\n 2. INSERT ");
			System.out.print("\n 3. DELETE ");
			System.out.print("\n 4. UPDATE ");
			System.out.print("\n 5. PREPARED INSERT ");
			System.out.print("\n 6. PREPARED DELETE ");
			System.out.print("\n 7. PREPARED UPDATE ");
			System.out.print("\n 8. CALLABLE INSERT ");
			System.out.print("\n 9. CALLABLE DELETE ");
			System.out.print("\n 10. CALLABLE OUT ");
			System.out.print("\n 11. UPDATABLE ");
			System.out.print("\n 12. BATCH  ");
			System.out.print("\n 13. UPLOADIMAGE ");
			System.out.print("\n 14. EXIT ");
			System.out.print("\n \n SELECT YOUR OPTION :");
			ch = scan.nextInt();
		    
			switch(ch)
			{
			case 1 : dd.show(); break;
			
			case 2 : dd.insert(); break;
			
			case 3 : dd.delete(); break; 
			
			case 4 : dd.update(); break;
			
			case 5 : dd.prepared(); break;
			
			case 6 : dd.preparedelete(); break;
			
			case 7 : dd.preparedUpdate(); break;
			
			case 8 : dd.callableInsert(); break;
			
			case 9 : dd.callableDelete(); break;
			
			case 10 : dd.callableOut(); break;
			
			case 11 : dd.updatable(); break;
			
			case 12 : dd.batch(); break;
			
			case 13 : dd.uploadImage(); break;
			}
		}

	}

}
