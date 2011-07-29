package msn_flyemirates;
import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    private static Connection con = null;
    public Connection connect() {

        if (con == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver").newInstance();
                con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/MSN_FlyEmirates", "root", "sa");
                if (!con.isClosed()) {
                    System.out.println("Successfully connected to " + "MySQL server using TCP/IP...");
                }

            } catch (Exception e) {
                System.err.println("Exception: " + e.getMessage());
            }
        }
        return con;
    }
}
