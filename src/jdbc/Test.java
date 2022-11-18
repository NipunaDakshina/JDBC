package jdbc;

import java.sql.*;
public class Test {

	public static void main(String[] args)throws Exception
	{
		String url="jdbc:mysql://localhost:3306/school";
		String uname="root";
		String pass="";
		String query="select name from student where id='stu003'";
		
		
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		String name=rs.getString("name");
		System.out.println(name);
				
		st.close();
		con.close();
				
		
		

	}

}
