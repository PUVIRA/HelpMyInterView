package forgot;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import register.ConnectionProvider;

public class ForgotDao {
	
	static String emai;

	public static boolean forgot(String email, String userid) {
		// TODO Auto-generated method stub
		emai = email;
			try{  
				Connection con=ConnectionProvider.getCon();  
				Statement ps=con.createStatement();               
				ResultSet rs = ps.executeQuery("select * from student where email='"+email+"' and userid='"+userid+"'");
					  
				if(rs.next())
					return true;
				}catch(Exception e){}    
			return false;
		}
	}
