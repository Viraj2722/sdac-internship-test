package RDBMS;

import java.sql.*;

public class Main1 {
	public static void main(String[] args) throws Exception{
			Class.forName("com.mysql.cj.jdbc.Driver");
			
			Connection connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/db25","root","1234");
			
			PreparedStatement preparedStatement = connection.prepareStatement("insert into emp1 values(?,?)");
			preparedStatement.setInt(1, 20);
			preparedStatement.setString(2, "VIRAJ");
			preparedStatement.executeUpdate();
			System.out.println("inserted..");
		
	}
	

}
