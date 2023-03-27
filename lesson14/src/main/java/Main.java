import java.sql.Connection;
import java.sql.DriverManager;

public class Main {
    public static void main(String[] args) {
        Connection c = getConnection();
    }

    public static Connection getConnection() {
        try {
            String dbName = "lesson13";
            String userName = "admin";
            String password = "admin1234";
            String hostname = "database-1.ccfa4kgyvrpw.eu-central-1.rds.amazonaws.com";
            String port = "3306";
            String jdbcUrl = "jdbc:mysql://" + hostname + ":" + port + "/" + dbName +
                    "?user=" + userName + "&password=" + password;
            Connection con = DriverManager.getConnection(jdbcUrl);
            return con;
        } catch (Exception e) {
            System.out.println("Sorky, nepodarilo sa pripojit na databazu");
        }
        return null;
    }
}
