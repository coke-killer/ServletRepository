package dao;

import bean.User;
import util.DBUtil;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class UserDao {
    public Boolean selectUserByNameAndPassword(String name, String password) throws Exception {
        ResultSet resultSet = null;
        PreparedStatement preparedStatement = null;
        Connection connection = null;
        try {
            connection = DBUtil.getConnection();
            String sql = "select u_id,u_name,u_password from t_user where u_name=? and u_password=?";
            preparedStatement = connection.prepareStatement(sql);
            preparedStatement.setString(1, name);
            preparedStatement.setString(2, password);
            resultSet = preparedStatement.executeQuery();
            while (resultSet.next()) {
                return true;
            }
        } finally {
            DBUtil.closeAll(resultSet, preparedStatement, connection);
        }
        return false;
    }
}

