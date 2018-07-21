package login;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

import register.ConnectionProvider;

public class LoginDao {

	public static boolean login(String email, String pass) {
		try{  
			Connection con=ConnectionProvider.getCon();  
			Statement ps=con.createStatement();               
			ResultSet rs = ps.executeQuery("select * from student where email='"+email+"' and password='"+pass+"'");
				  
			if(rs.next())
				return true;
			}catch(Exception e){}    
		return false;
	}

}
