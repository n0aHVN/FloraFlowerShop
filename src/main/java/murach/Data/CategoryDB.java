package murach.Data;

import java.sql.*;
import java.util.ArrayList;

import murach.Business.Category;
import murach.Data.Connect.*;


public class CategoryDB {
    public static ArrayList<Category> selectCategories() {
        ConnectionPool1 pool = ConnectionPool1.getInstance();
        Connection connection = pool.getConnection();
        PreparedStatement ps = null;
        ResultSet rs = null;
        
        String query = "SELECT * FROM category";
        try {
            ps = connection.prepareStatement(query);
            rs = ps.executeQuery();
            ArrayList<Category> categories = new ArrayList<Category>();
            while (rs.next())
            {
                Category category = new Category();
                category.setCategory_slug(rs.getString("category_slug"));
                category.setCategory_fullname(rs.getString("category_fullname"));
                categories.add(category);
            }
            return categories;
        } catch (SQLException e) {
            System.out.println(e);
            return null;
        } finally {
            DBUtil.closeResultSet(rs);
            DBUtil.closePreparedStatement(ps);
            pool.freeConnection(connection);
        }
    	
    }  
}
