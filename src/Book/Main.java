package Book;
import java.util.Scanner;
import java.util.*;
public class Main {
    public ArrayList <Book> books = new ArrayList<>();
    public void displayMenu(){
        System.out.println("1. Add book.");
        System.out.println("2. Remove book.");
        System.out.println("3. Update book.");
        System.out.println("4. Test guests' function.");
        System.out.println("5. Log out.");
    }
    public static void main(String[] args) {
        System.out.println("Welcome to out library!");
        LogIn login = new LogIn();
    }
}
