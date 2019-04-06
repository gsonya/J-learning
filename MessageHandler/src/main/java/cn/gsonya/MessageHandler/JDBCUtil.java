package cn.gsonya.MessageHandler;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class JDBCUtil {
	public static Connection getConn() {
		String driver="com.mysql.jdbc.Driver";
		String url="jdbc:mysql://localhost:3306/runoob_Student";
		String username="root";
		String password="123456";
		Connection conn=null;
			try {
				Class.forName(driver);
			} catch (ClassNotFoundException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			try {
				conn=(Connection)DriverManager.getConnection(url, username, password);
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
			return conn;
	}

}
