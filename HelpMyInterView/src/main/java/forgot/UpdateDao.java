package forgot;
import java.sql.Connection;
import java.sql.Statement;

import register.ConnectionProvider;

public class UpdateDao {

	public static boolean update(String pass) {
		// TODO Auto-generated method stub
		try{  
			Connection con=ConnectionProvider.getCon();  
			Statement ps=con.createStatement();               
			
			int a = ps.executeUpdate("update student set password='"+pass+"' where email='"+ForgotDao.emai+"';");
				  
			if(a>0)
				return true;
			}catch(Exception e){
				System.out.println(e);
			}    
		return false;
	}

}
