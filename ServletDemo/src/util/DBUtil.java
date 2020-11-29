package util;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBUtil {
    private static final String DRIVER = "com.mysql.jdbc.Driver";
    private static final String DB_URL = "jdbc:mysql://localhost:3306/book";
    private static final String USER = "root";
    private static final String PASSWORD = "yudongyue";

    public static Connection getConnection() throws ClassNotFoundException, SQLException {
        Class.forName(DRIVER);
        return DriverManager.getConnection(DB_URL, USER, PASSWORD);
    }

    public static void closeAll(AutoCloseable... autoCloseables) throws Exception {
        for (AutoCloseable autoCloseable : autoCloseables
        ) {
            autoCloseable.close();
        }
    }
}
