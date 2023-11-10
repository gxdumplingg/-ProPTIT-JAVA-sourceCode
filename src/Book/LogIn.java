package Book;
import java.util.Scanner;
import java.util.*;
// log in xong rui
public class LogIn {
    public int mode;
    public LogIn (){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Admin");
        System.out.println("2. Guest");
        System.out.println("3. END.");
        String username = sc.nextLine();
        if (username.equals("Admin")){
            System.out.println("Enter password: ");
            String password = sc.nextLine();
            if (password.equals(Admin.adminPassword)){
                System.out.println("Successfully logged in!");
                Admin admin = new Admin();
                admin.adminFunctions(sc);
            }
        }
        else if (username.equals("Guest")){
            Guest guest = new Guest();
            guest.guestFunctions(sc);
        }
        else {
            System.out.println("Goodbye!");
            return;
        }
    }
}
