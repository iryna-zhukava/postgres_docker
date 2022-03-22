package webapp.db;

import java.sql.*;
import java.util.Properties;

public class Connector {
    private static Connection connect() throws SQLException {
        String url = "jdbc:postgresql://localhost:5432/postgres";
        Properties props = new Properties();
        props.setProperty("user", "postgres");
        props.setProperty("password", "root");
//        props.setProperty("ssl", "true");
        Connection conn = DriverManager.getConnection(url, props);

//        String url = "jdbc:postgresql://localhost/test?user=fred&password=secret&ssl=true";
//        Connection conn = DriverManager.getConnection(url);
        return conn;
    }

    public static void main(String[] args) {
        try {
            Connection connection = connect();
            Statement statement = connection.createStatement();
            ResultSet resultSet = statement.executeQuery("select version()");
            while (resultSet.next()){
                System.out.println(resultSet.getString(1));
            }
        } catch (SQLException e) {


        }
    }
}
