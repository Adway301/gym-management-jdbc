import java.sql.Connection;
import java.sql.Statement;
import java.sql.ResultSet;

public class ViewMembers {
    public static void viewMembers(){
        try {


            Connection conn=DBConnection.getConnection();
            String sql="SELECT * FROM members";
            Statement stmt=conn.createStatement();
            ResultSet rs=stmt.executeQuery(sql);

            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                int age = rs.getInt("age");
                String phone = rs.getString("phone");
                String membership = rs.getString("membership_type");

                System.out.println(id + " " + name + " " + age + " " + phone + " " + membership);
            }

        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}