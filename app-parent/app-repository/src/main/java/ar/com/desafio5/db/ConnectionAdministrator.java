package ar.com.desafio5.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class ConnectionAdministrator {
	public static Connection getConnection() {
		String usernameDb = System.getenv("DB_USERNAME");
		String passwordDb = System.getenv("DB_PASSWORD");
		String URL = "jdbc:mysql://127.0.0.1:33070/educacionit-desafio5?serverTimeZone=UTC&useSSL=false";
		String DriverClassName = "com.mysql.cj.jdbc.Driver";
		
		try {
			Class.forName(DriverClassName);
			return DriverManager.getConnection(URL, usernameDb, passwordDb);
		} catch (Exception e) {
			throw new IllegalArgumentException("No se pudo conectar a:" + URL + " - " + DriverClassName);
		}
	}
}
