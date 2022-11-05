package murach.Data.Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

//import javax.naming.Context;
//import javax.naming.InitialContext;
//import javax.naming.NamingException;
//import javax.sql.DataSource;

public class ConnectionPool1 {
	
	private static ConnectionPool1 instance = null;
	private Connection connection = getConnection();
	
	private ConnectionPool1(){
		//private constructor
	}
	
	
	public static ConnectionPool1 getInstance(){
		if (instance==null)
			instance = new ConnectionPool1();
		return instance;
	}
	
	public Connection getConnection() {
		try {
			Class.forName("org.postgresql.Driver").newInstance();
		} catch (InstantiationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IllegalAccessException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		String username = "aikzlnpvrofvmj";
		String password = "a7b26f06c32229dd0ffc890c398e78d7ff6cec029605830d833b7d9755353bdc";
		String dbUrl = "jdbc:postgresql://" + "ec2-52-1-17-228.compute-1.amazonaws.com:5432"
				+ "/d7qr0iu7igc22g?sslmode=require";
		
		try {
			return DriverManager.getConnection(dbUrl, username, password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		return connection;
	}
	
    public void freeConnection(Connection c) {
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }

}
