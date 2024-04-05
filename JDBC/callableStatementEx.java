package JDBC;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.CallableStatement;

public class callableStatementEx {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	CallableStatement cstmt;
	
	public callableStatementEx() throws ClassNotFoundException, SQLException{ 
	connection = MyConnection.getMyConnection();
	System.out.println("connection get open");
}
	public void callingPocedure(int id, String name,String city, String phoneNo) throws SQLException {
		cstmt= connection.prepareCall("{call insertCustomer(?,?,?,?)}");
		cstmt.setInt(1, id);
		cstmt.setString(2, name);
		cstmt.setString(3, city);
		cstmt.setString(4, phoneNo);
		
		cstmt.execute();
		System.out.println("Executed successfully");
	}
	public void close() throws SQLException {
		connection.close();
	}
	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		 callableStatementEx obj =  new callableStatementEx();
		obj.callingPocedure(106,"Jhonny","Tokyo","9654782365");
		obj.close();
	}

}
