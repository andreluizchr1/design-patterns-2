package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private Connection connection;

	public ConnectionFactory() {
		this.connection = null;
	}

	public Connection getConnection() {

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/banco", "root", "12345");
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return connection;
	}

	public Connection getConnection(String user, String password) {

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost/banco", user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}
}
