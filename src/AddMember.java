import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class AddMember {
    public static void addMember(){
        try {


            Connection conn = DBConnection.getConnection();
            String sql = "INSERT INTO members(name, age, phone, membership_type) VALUES(?,?,?,?)";

            PreparedStatement pstmt = conn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);

            System.out.println("Enter name: ");
            String name = sc.nextLine();

            System.out.println("Enter age: ");
            int age = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter phone number: ");
            String phone = sc.nextLine();

            System.out.println("Enter membership type: ");
            String membership_type = sc.nextLine();

            pstmt.setString(1, name);
            pstmt.setInt(2, age);
            pstmt.setString(3, phone);
            pstmt.setString(4, membership_type);

            pstmt.executeUpdate();
            System.out.println("Member added Successfully...");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }

}