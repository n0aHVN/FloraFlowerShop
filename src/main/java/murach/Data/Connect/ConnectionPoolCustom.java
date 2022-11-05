package murach.Data.Connect;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class ConnectionPoolCustom {
	
	private static ConnectionPoolCustom instance = null;
	private static String dbUrl = null;
	private static String username = null;
	private static String password = null;
	//private static Connection connection = null;
	
	private ConnectionPoolCustom(){
		dbUrl = DBCustomConfig.dbUrl;
		username = DBCustomConfig.username;
		password = DBCustomConfig.password;
	}
	
	
	public static ConnectionPoolCustom getInstance(){
		if (instance==null) {
			System.out.println("nay moi");
			instance = new ConnectionPoolCustom();
		} else {
			System.out.println("nay cu");
		}
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
		
		try {
			return DriverManager.getConnection(dbUrl,username,password);
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			return null;
		}
	}
	
    public void freeConnection(Connection c) {
        try {
            c.close();
        } catch (SQLException e) {
            System.out.println(e);
        }
    }
}
