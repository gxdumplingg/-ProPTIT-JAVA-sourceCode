package Book;
import java.util.Scanner;

public class Login {
    public int mode;
    public static void logIn (){
        Scanner sc = new Scanner(System.in);
        System.out.println("1. Admin");
        System.out.println("2. Guest");
        System.out.println("3. END.");
        System.out.print("Enter your log-in option: ");
//        String username = sc.nextLine();
        int option = Integer.parseInt(sc.nextLine());
        switch (option){
            case 1:
                System.out.print("Enter password: ");
                String password = sc.nextLine();
                if (password.equals(Admin.adminPassword)) {
                    System.out.println("Successfully logged in as an admin!");
                    Admin admin = new Admin();
                    admin.adminFunctions(sc);
                    break;
                }
                else {
                    System.out.println("Wrong password!");
                    Login.logIn();
                }

            case 2:
                System.out.println("Successfully logged in as a guest!");
                Guest guest = new Guest();
                guest.guestFunctions(sc);
                break;
            default:
                System.out.println("Goodbye!");
                return;
        }
    }
}
