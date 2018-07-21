package register;
import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

public class ValidateDao {
	boolean val;
	public static boolean validate(User u) {
		// TODO Auto-generated method stub
		try{  
			Connection con=ConnectionProvider.getCon();  
			Statement ps=con.createStatement();               
			ResultSet rs = ps.executeQuery("select * from student where email='"+u.getEmail()+"' or userid='"+u.getUserid()+"'");
				  
			if(rs.next())
				return false;
			}catch(Exception e){}    
		return true;
	}

}
