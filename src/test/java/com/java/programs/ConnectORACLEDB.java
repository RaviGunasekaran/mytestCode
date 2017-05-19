package com.java.programs;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class ConnectORACLEDB {

	public static void main(String[] args) {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			System.out.println("Connecting to the database...");
			Connection connection = DriverManager.getConnection(
					// "jdbc:oracle:thin:@sun64:1521:orcl", "acu3et",
					// "matrix123#"); --- This is example
					"jdbc:oracle:thin:@sun64", "acu3et", "matrix123#");
			// "jdbc:oracle:ori8:@", "acu3et", "matrix123#");--- This is example
			/*
			 * In the above line, username is “scott” and * password is “tiger”.
			 * Thin is the JDBC driver 1521 is the default port number which the
			 * connection is to be established and orcl is the database name.
			 */
			Statement statement = connection.createStatement();
			// ResultSet resultset = statement.executeQuery("select 'Connected'
			// from dual");
			System.out.println(statement);
			ResultSet resultset = statement
					.executeQuery("SELECT UD_LOGINID,UD_ID,UD_PASSWORD FROM AS_USERDTLS WHERE ROWNUM<5");
			System.out.println(resultset);
			// for(int i=5;i<5;i++)
			// {
			// resultset.getRow();//next();
			while (resultset.next()) {
				// resultset.next();
				// System.out.println(resultset.getRow());
				// String s = resultset.getString(1);
				// System.out.println(s);
				String s = resultset.getString("UD_LOGINID");
				String p = resultset.getString("UD_ID");
				String q = resultset.getString("UD_PASSWORD");
				System.out.println(p);
				System.out.println(s);
				System.out.println(q);
			}
			// String s1 = resultset.getString(2);
			// String s2 = resultset.getString(3);
			// }
			statement.close();
			connection.close();
			System.out.println("connection closed");
		} catch (Exception e) {
			System.out.println("The exception raised is:" + e);
		}
	}

}
