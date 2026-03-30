import java.sql.Connection;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

//        AddMember.addMember();
//        UpdateMember.updateMember();
//        ViewMembers.viewMembers();
//        DeleteMember.deleteMember();
        Scanner sc=new Scanner(System.in);

        while (true) {
            System.out.println("1.Add new member.");
            System.out.println("2.View all members.");
            System.out.println("3.Update member.");
            System.out.println("4.Delete member.");
            System.out.println("5.Exit. ");
            System.out.print("Enter choice: ");
            int choice = sc.nextInt();

//        int choice=2;
            switch (choice) {

                case 1:
                    AddMember.addMember();
                    break;

                case 2:
                    ViewMembers.viewMembers();
                    break;

                case 3:
                    UpdateMember.updateMember();
                    break;

                case 4:
                    DeleteMember.deleteMember();
                    break;

                case 5:
                    System.out.println("Exiting...");
                    System.exit(0);

                default:
                    System.out.println("Invalid choice");
            }
        }

    }
}