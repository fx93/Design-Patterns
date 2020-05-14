import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DBManager {

    private static volatile DBManager dbManager; // = new DBManager();
    public static volatile Connection connection;

    private DBManager(){
        if(dbManager != null){
            throw new RuntimeException("Please use getDbManager method");
        } // to prevent the interference like reflection frameworks
    }

    // don't use synchronize here, it will block whole method - performance hit
    public static DBManager getDbManager() {
        if(dbManager == null){
            synchronized (DBManager.class){ // edge case thread problem - double locking singleton
                if (dbManager == null){
                    dbManager = new DBManager();
                }
            }
        }
        return dbManager;
    }

    public Connection getDBConnection() {
        if(connection == null) {
            synchronized (Connection.class) {
                if(connection==null) {
                    String url ="jdbc:derby:memory:sample;create=true";
                    try {
                        connection = DriverManager.getConnection(url);
                    } catch (SQLException e) {
                        // TODO Auto-generated catch block
                        e.printStackTrace();
                    }
                }
            }
        }
        return connection;
    }

}
