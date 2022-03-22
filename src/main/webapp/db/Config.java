package webapp.db;

public final class Config {
    static final String DB_LINK = System.getenv("DB_LINK");
    static final String LOGIN = System.getenv("LOGIN");
    static final String PASSWORD = System.getenv("PASSWORD");


    private Config() {
    }
}
