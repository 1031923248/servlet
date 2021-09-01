package com.amane.Dao;

import com.amane.Fruit.Fruit;
import com.amane.util.JDUtil;
import java.sql.*;

public class FruitDao {
    public static Fruit getFruit(int id){
        Fruit fruit = new Fruit();
        String name;
        int price;
        Connection conn = null;
        PreparedStatement ps = null;
        ResultSet rs = null;
        try{
            conn = JDUtil.getConnection();
            String sql = "select * from fruit where id=?";
            ps = conn.prepareStatement(sql);
            ps.setInt(1,id);
            rs = ps.executeQuery();
            if(rs.next()){
                name = rs.getString("name");
                price = rs.getInt("price");
                fruit.setId(id);
                fruit.setName(name);
                fruit.setPrice(price);
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
        if (rs != null) {
            try {
                rs.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (ps != null) {
            try {
                ps.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        if (conn != null) {
            try {
                conn.close();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            }
        }
        return fruit;
    }
}
