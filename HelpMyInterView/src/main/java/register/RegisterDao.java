package register;  

import java.sql.*;  
  
public class RegisterDao {  
  
public static int register(User u){  
int status=0;  
if(ValidateDao.validate(u)) {
try{  
Connection con=ConnectionProvider.getCon();  
PreparedStatement ps=con.prepareStatement("insert into student values(?,?,?,?)");  
ps.setString(1,u.getEmail());  
ps.setString(2,u.getInstitute());  
ps.setString(3,u.getUserid());
ps.setString(4, u.getPass());
              
status=ps.executeUpdate();  
}catch(Exception e){}    
}
return status;
}   
}