package com.java.commonmethods;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class DataBaseDriver {
	
	private Connection connect;
	
	private Statement statement;
	
	private ResultSet resultset;
	
	public ResultSet readDatabases( String Customers){
		try {
			Class.forName("com.mysql.jdbc.Driver");
			connect = DriverManager.getConnection("jdbc:mysql://107.170.213.234/itech", "qatester","qatester");
			System.out.println("connected to the server");
			statement = connect.createStatement();
			resultset = statement.executeQuery("Select from " + Customers);
			
			
		} catch (Exception e){
			System.out.println("Something is wrong ");
			e.printStackTrace();
		}
		return resultset;
		}
		
		
	
}
