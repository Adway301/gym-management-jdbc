import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {

    public static Connection getConnection() {
        Connection conn = null;

        try {
            String url = "jdbc:mysql://localhost:3306/gym_management";
            String user = "root";
            String password = "Adway301";

            conn = DriverManager.getConnection(url, user, password);

//            System.out.println("Database Connected Successfully!");

        } catch (Exception e) {
            e.printStackTrace();
        }

        return conn;
    }
}