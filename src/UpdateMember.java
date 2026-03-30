import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class UpdateMember{
    public static void updateMember() {
        try {
            Connection conn = DBConnection.getConnection();

            String sql = "UPDATE members set membership_type=? where id=?";
            PreparedStatement pstmt = conn.prepareStatement(sql);

            Scanner sc = new Scanner(System.in);
            System.out.println("Enter member ID to update: ");
            int id = sc.nextInt();
            sc.nextLine();

            System.out.println("Enter new membership type: ");
            String membership = sc.nextLine();

            pstmt.setString(1, membership);
            pstmt.setInt(2, id);
            pstmt.executeUpdate();
            System.out.println("Member updated successfully...");
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }
}