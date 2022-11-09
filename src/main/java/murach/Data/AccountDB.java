package murach.Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import murach.Business.Category;
import murach.Business.user;
import murach.Data.Connect.ConnectionPool1;
import murach.Data.Connect.DBUtil;
import java.sql.Timestamp;
public class AccountDB {
    public static user userExist(String user_id, String password) {
        ConnectionPool1 pool = ConnectionPool1.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM \"user\" where user_id =? and password=?";
        try {
            ps = connection.prepareStatement(query);
            ps.setString(1, user_id);
            ps.setString(2, password);
            rs = ps.executeQuery();
            user loginUser = null;
            
            if (rs.next()) {
            	loginUser = new user();
            	loginUser.set_user_id(rs.getString("user_id"));
            	loginUser.set_password(rs.getString("password"));
            	loginUser.set_fullname(rs.getString("fullname"));
            	loginUser.set_email(rs.getString("email"));
            	loginUser.set_phone(rs.getString("phone"));
            	loginUser.set_is_admin(rs.getBoolean("is_admin"));
            	loginUser.set_joined_date(rs.getTimestamp("joined_date"));
            	loginUser.set_last_login((rs.getTimestamp("last_login")));
            	
            }
            return loginUser;
        }
        catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
    
    public static boolean addUser(user registerUser) {
    	ConnectionPool1 pool = ConnectionPool1.getInstance();
    	Connection connection = pool.getConnection();
        PreparedStatement ps = null;
             
        String query = "INSERT INTO user(email,fullname,is_admin,joined_date,last_login,\"password\",phone,user_id)\r\n"
        		+ "VALUES (?,?,?,?,?,?,?,?)";
        try {
        	ps.setString(1, registerUser.get_email());
        	ps.setString(2, registerUser.get_fullname());
        	ps.setBoolean(3, registerUser.get_is_admin());
        	ps.setTimestamp(4, new java.sql.Timestamp(System.currentTimeMillis()));
        	ps.setString(5, null);//last_login ko tạo
        	ps.setString(6, registerUser.get_phone());
        	ps.setString(7, registerUser.get_email());
        	ps.setString(8, registerUser.get_user_id());
        	ps.executeUpdate();
        	return true;
        }
        catch (Exception e) {
			return false;
		}
        finally {
			DBUtil.closePreparedStatement(ps);
			pool.freeConnection(connection);
		}
    }
}
