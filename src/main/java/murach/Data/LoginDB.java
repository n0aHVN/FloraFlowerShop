package murach.Data;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import murach.Business.Category;
import murach.Data.Connect.ConnectionPool1;
import murach.Data.Connect.DBUtil;

public class LoginDB {
    public static boolean userExist(String user_id, String password) {
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
            return rs.next();
        }
        catch (SQLException e) {
            System.out.println(e);
            return false;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    }
}
