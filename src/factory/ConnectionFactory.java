package factory;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionFactory {

	private Connection connection;
	private String user;
	private String password;
	private String nomeBanco;

	public ConnectionFactory(String user, String password, String nomeBanco) {
		this.user = user;
		this.password = password;
		this.nomeBanco = nomeBanco;
		this.connection = null;
	}

	/*
	 * GetConnection do Banco Mysql
	 */
	public Connection getConnectionMysql() {

		try {
			connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/+" + nomeBanco, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}

	/*
	 * GetConnection do Banco Postgres
	 */
	public Connection getConnectionPostgres() {

		try {
			connection = DriverManager.getConnection("jdbc:postgres://localhost:5432/" + nomeBanco, user, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		return connection;
	}
	
	/*
	 * Metodo getUser
	 */
	public String getUser() {
		return user;
	}

	/*
	 * Metodo getPassword
	 */
	public String getPassword() {
		return password;
	}

	public String getNomeBanco() {
		return nomeBanco;
	}

}
