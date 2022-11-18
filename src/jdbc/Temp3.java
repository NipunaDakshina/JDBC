package jdbc;

import java.sql.*;
public class Temp3 {

	public static void main(String[] args)throws Exception
	{
		String url="jdbc:mysql://localhost:3306/school";
		String uname="root";
		String pass="";
		String userId="stu010";
		String userName="Tharushka";
		int userMobile=4444777;
		
		//String query="insert into student values ('stu007','Rumesh',242451)";
		//String query="insert into student values ('"+userId+"','"+userName+"',"+userMobile+")";
		String query="insert into student values (?,?,?)";

		
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		//Statement st=con.createStatement();
		PreparedStatement st=con.prepareStatement(query);
		st.setString(1,userId);
		st.setString(2,userName);
		st.setInt(3,userMobile);
		//int count=st.executeUpdate(query);
		int count=st.executeUpdate();
		System.out.println(count+" row/s affected!!");
		
	
		st.close();
		con.close();
				
		
		

	}

}


