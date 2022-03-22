package webapp.db;

import java.sql.*;
import java.util.Properties;

public final class Connector {
    private Properties properties;
    private String url;

    public Connector() {
        url = Config.DB_LINK;
        properties = new Properties();
        properties.setProperty("user", Config.LOGIN);
        properties.setProperty("password", Config.PASSWORD);

    }

    public Connection getConnection() throws SQLException {
        return DriverManager.getConnection(url, properties);
    }

}
