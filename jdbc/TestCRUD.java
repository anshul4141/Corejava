package in.raystec.jdbc;

import java.sql.Statement;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;

public class TestCRUD {

	public static void main(String[] args) throws Exception {
		testselect();
	}

	private static void testselect() throws Exception {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/anshuldb", "root", "sHj@6378#jw");
		Statement stmt = conn.createStatement();
		ResultSet rs = stmt.executeQuery("Select * from employee");
		while (rs.next()) {
			System.out.print("\t" + rs.getString(1));
			System.out.print("\t" + rs.getString(2));
			System.out.print("\t" + rs.getString(3));
			System.out.print("\t" + rs.getString(4));
			System.out.println("\t" + rs.getString(5));
		}
		stmt.close();
		conn.close();
		rs.close();
	}
}
