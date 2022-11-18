package jdbc;

import java.sql.*;
public class Temp2 {

	public static void main(String[] args)throws Exception
	{
		String url="jdbc:mysql://localhost:3306/school";
		String uname="root";
		String pass="";
		String userId="stu008";
		String userName="Lahiru";
		int userMobile=77889900;
		
		//String query="insert into student values ('stu007','Rumesh',242451)";
		String query="insert into student values ('"+userId+"','"+userName+"',"+userMobile+")";
		
		
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		int count=st.executeUpdate(query);
		System.out.println(count+" row/s affected!!");
		
	
		st.close();
		con.close();
				
		
		

	}

}

