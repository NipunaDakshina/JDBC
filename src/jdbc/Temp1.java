package jdbc;

import java.sql.*;
public class Temp1 {

	public static void main(String[] args)throws Exception
	{
		String url="jdbc:mysql://localhost:3306/school";
		String uname="root";
		String pass="";
		String query="select * from student";
		
		
		// TODO Auto-generated method stub
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		//rs.next();
		String userData;
		//String name=rs.getString("name");
		//System.out.println(name);
		while(rs.next()) {
			userData=rs.getString(1)+" "+rs.getString(2)+" "+rs.getInt(3);
			System.out.println(userData);
		}
		st.close();
		con.close();
				
		
		

	}

}
