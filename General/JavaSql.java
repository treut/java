//mysql use

import java.sql.*;

public class JavaSql{
	public static void main(String args[]){

		String url="jdbc:mysql://localhost:3306/java";
		String user="java";
		String pass="java";

		try{
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection conn=DriverManager.getConnection(url, user, pass);
			Statement state=conn.createStatement();
			ResultSet res=state.executeQuery("SELECT*FROM cards LIMIT 3");
			
			while(res.next()){
				System.out.println(res.getString(3));
			}

			res.close();
			state.close();
			conn.close();
		}
		catch(Exception e){
			System.out.println("crash: "+e);
		}
	}
}