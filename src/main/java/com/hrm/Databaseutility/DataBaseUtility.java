package com.hrm.Databaseutility;

import java.sql.Connection;
import java.sql.Driver;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DataBaseUtility {

	Connection con = null;

	public void connectToDB() throws SQLException {

		Driver d = new com.mysql.cj.jdbc.Driver(); 
		DriverManager.registerDriver(d);

		con = DriverManager.getConnection("jdbc:mysql://localhost:3306/studentmanagement", "root", "Scott@");
	}

	public void connectionClose() throws SQLException {
		con.close();
	}

	public void executeSelectQuery(String Query) throws SQLException {
		Statement st = con.createStatement();

		ResultSet rst = st.executeQuery(Query);

		while (rst.next()) {

			System.out.println(
					rst.getString(1) + " " + rst.getString(2) + "  " + rst.getString(3) + "  " + rst.getString(4));
		}
	}

	public int nonSelectQuery(String Query) throws SQLException {
		Statement st = con.createStatement();
		int r = st.executeUpdate(Query);
		return r;
	}

}
