package jdbc;

import java.sql.*;



public class Temp4 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		StudentDAO dao=new StudentDAO();
		Student s1=dao.getName("stu005");
		System.out.println(s1.name);

		
		
		
		
	}
}

//Data Access Object
/*
class StudentDAO{
	
	public Student getName(String Id) throws ClassNotFoundException, SQLException {
		String url="jdbc:mysql://localhost:3306/school";
		String uname="root";
		String pass="";
		String query="select * from student where id='"+Id+"'";
		Student s=new Student();
		s.id=Id;
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection(url,uname,pass);
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		s.id=rs.getString(1);
		s.name=rs.getString(2);
		s.mobile=rs.getInt(3);
		return s;
		
	}
}
class Student{
	String id;
	String name;
	int mobile;
}
*/