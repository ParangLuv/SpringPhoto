package com.parangluv.ex00;

import java.sql.Connection;
import java.sql.DriverManager;

import org.junit.Test;

public class MySqlConnectionTest {

	private static final String DRIVER = "com.mysql.jdbc.Driver";
	private static final String URL = "jdbc:mysql://127.0.0.1:3306/book_ex";
	private static final String USER = "root";
	private static final String PW = "rootroot";
	
	@Test
	public void test() {
		try {
			Class.forName(DRIVER);
			Connection conn = DriverManager.getConnection(URL, USER, PW);
			System.out.println(conn.getCatalog());
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			
		}
		
		
	}

}
