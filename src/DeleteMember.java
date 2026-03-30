import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class DeleteMember {
    public static void deleteMember() {
        try {
        Connection conn = DBConnection.getConnection();

        String sql = "DELETE from members where id=?";
        PreparedStatement pstmt = conn.prepareStatement(sql);
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter id to delete: ");
        int id = sc.nextInt();

        pstmt.setInt(1, id);
        pstmt.executeUpdate();
        System.out.println("Member updated successfully...");

        }catch (Exception e){
            e.printStackTrace();
        }


    }
}