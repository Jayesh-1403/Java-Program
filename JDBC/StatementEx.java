package JDBC;


import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StatementEx {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	
	public StatementEx() throws ClassNotFoundException, SQLException{ 
	connection = MyConnection.getMyConnection();
	System.out.println("connection get open");
}
	public void getCustomer() throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from Customer");
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("custId")+"\t");
			System.out.print(resultSet.getString("custName")+"\t");
			System.out.print(resultSet.getString("custAddress")+"\t");
			System.out.print(resultSet.getString("phoneNo"));
			System.out.println();
			
		}
	}
	public void getStudentid(int id) throws SQLException {
		statement = connection.createStatement();
		resultSet = statement.executeQuery("select * from Student where id = "+id);
		while (resultSet.next()) {
			System.out.print(resultSet.getInt("id")+"\t");
			System.out.print(resultSet.getString("Name")+"\t");
			System.out.print(resultSet.getString("phone_Number"));
			System.out.println();
			
		}
	}
	public void close() throws SQLException{
		connection.close();
	}
	public static void main(String[] args)throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		StatementEx obj = new StatementEx();
		obj.getCustomer();
		obj.close();
		
		int id;
		Scanner sc = new Scanner(System.in);
		id = sc.nextInt();
		StatementEx obj1 = new StatementEx();
		obj1.getStudentid(id);
		obj1.close();
	}

}
