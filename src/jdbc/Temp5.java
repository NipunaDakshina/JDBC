package jdbc;

import java.sql.*;



public class Temp5 {
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		
		StudentDAO dao=new StudentDAO();
		//Student s1=dao.getName("stu005");
		//System.out.println(s1.name);
		Student s1=new Student();
		s1.id="stu012";
		s1.name="Nuwan";
		s1.mobile=1213141516;
		dao.Connect();
		dao.addStudent(s1);
				
	}
}

//Data Access Object

class StudentDAO{
	Connection con=null;
	
	
	public void Connect() throws SQLException, ClassNotFoundException{
		String url="jdbc:mysql://localhost:3306/school";
		String uname="root";
		String pass="";
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection(url,uname,pass);
	}
	
	
	public Student getName(String Id) throws SQLException {
		String query="select * from student where id='"+Id+"'";
		Student s=new Student();
		s.id=Id;
		Statement st=con.createStatement();
		ResultSet rs=st.executeQuery(query);
		rs.next();
		s.id=rs.getString(1);
		s.name=rs.getString(2);
		s.mobile=rs.getInt(3);
		return s;	
	}
	
	
	public void addStudent(Student s) throws SQLException {
		String query="insert into student values(?,?,?)";
		PreparedStatement pst=con.prepareStatement(query);
		pst.setString(1,s.id);
		pst.setString(2,s.name);
		pst.setInt(3,s.mobile);
		int count=pst.executeUpdate();
		System.out.println(count+" row/s affected!!");
	}
}
class Student{
	String id;
	String name;
	int mobile;
}

