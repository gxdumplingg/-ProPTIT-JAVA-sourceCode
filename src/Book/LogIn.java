package Book;
import java.util.Scanner;
import java.util.*;

public class LogIn {
    public int mode;
    public static void LogIn (){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Admin");
        System.out.println("2. Guest");
        System.out.println("3. END.");
        System.out.println("Enter username: ");
        String username = sc.nextLine();
        while (true) {
            if (username.equals("Admin")) {
                System.out.println("Enter password: ");
                String password = sc.nextLine();
                if (password.equals(Admin.adminPassword)) {
                    System.out.println("Successfully logged in as an admin!");
                    Admin admin = new Admin();
                    admin.adminFunctions(sc);
                }
            }
            else if (username.equals("Guest")) {
                System.out.println("Successfully logged in as a guest!");
                Guest guest = new Guest();
                guest.guestFunctions(sc);
            }
            else {
                System.out.println("Goodbye!");
                return;
            }
        }
    }
}
