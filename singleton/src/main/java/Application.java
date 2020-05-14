import java.sql.Connection;

public class Application {

    public static void main(String[] args) {

        long start;
        long end;

        // DBManager dbManager = new DBManager(); - won't work because private constructor

        DBManager dbManager1 = DBManager.getDbManager();
        System.out.println(dbManager1);

        start = System.currentTimeMillis();
        Connection connection1 = dbManager1.getDBConnection();
        end = System.currentTimeMillis();

        System.out.println("Time duration for first connection" + (start - end));

        DBManager dbManager2 = DBManager.getDbManager();
        System.out.println(dbManager2);

        start = System.currentTimeMillis();
        Connection connection2 = dbManager2.getDBConnection();
        end = System.currentTimeMillis();

        System.out.println("Time duration for second connection" + (start - end));

    }
}
