package JDBC;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentRecord {

	Connection connection;
	Statement statement;
	ResultSet resultSet;
	PreparedStatement pstStatement;

	public StudentRecord() throws ClassNotFoundException, SQLException {
		connection = MyConnection.getMyConnection();
		System.out.println("connection get open");
	}

	/*
	 * public void getStudentno(int rollno) throws SQLException { statement =
	 * connection.createStatement(); pstStatement =
	 * connection.prepareStatement("select * from Student where rollno = " +
	 * rollno); while (resultSet.next()) {
	 * System.out.print(resultSet.getInt("rollno") + "\t");
	 * System.out.print(resultSet.getString("name") + "\t");
	 * System.out.print(resultSet.getString("email_id") + "\t");
	 * System.out.print(resultSet.getString("phone_Number"));
	 * System.out.print(resultSet.getString("dob") + "\t");
	 * System.out.print(resultSet.getString("city") + "\t");
	 * System.out.print(resultSet.getString("percent") + "\t");
	 * System.out.println(); } }
	 * 
	 * public void close() throws SQLException { connection.close(); }
	 */

	public void insertRecord(int rollno, String name, String email_id, String phone_Number, String dob, String city,
			String percent) throws SQLException {
		pstStatement = connection.prepareStatement("insert into student values(?,?,?,?,?,?,?)");
		pstStatement.setInt(1, rollno);
		pstStatement.setString(2, name);
		pstStatement.setString(3, email_id);
		pstStatement.setString(4, phone_Number);
		pstStatement.setString(5, dob);
		pstStatement.setString(6, city);
		pstStatement.setString(7, percent);
		 int n = pstStatement.executeUpdate(); // DML
		System.out.println(n + " record is inserted");
	}

	public static void main(String[] args) throws ClassNotFoundException, SQLException {
		// TODO Auto-generated method stub
		int rollno;
		Scanner sc = new Scanner(System.in);
		rollno = sc.nextInt();
		String name = sc.nextLine();
		String email_id = sc.nextLine();
		String phone_Number = sc.nextLine();
		String dob = sc.nextLine();
		String city = sc.nextLine();
		String percent = sc.nextLine();

		StudentRecord obj = new StudentRecord();
		// obj.getStudentno(rollno);
		// obj.insertRecord(123, "Hulk", "hulk123@gmail.com", "9654782563", "2008-6-9",
		// "NY", 99.63);
		obj.insertRecord(rollno, name, email_id, phone_Number, dob, city, percent);

		/*
		 * Scanner in = new Scanner(System.in); System.out.println("Enter record : ");
		 * String phone_Number = sc.next(); //int rollno = in.nextInt();
		 */
		System.out.println("Student by city name : " +city);
	}

}
