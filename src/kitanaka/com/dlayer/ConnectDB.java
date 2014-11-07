package kitanaka.com.dlayer;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectDB {
	final private static String URL = "jdbc:postgresql://localhost/aikidodb";
	final private static String USER = "postgres";
	final private static String PASSWORD = "yk0930";
	
	public static Connection getConnect() throws SQLException{
		Connection con = DriverManager.getConnection(URL, USER,PASSWORD);
		return con;
	}
	

}
