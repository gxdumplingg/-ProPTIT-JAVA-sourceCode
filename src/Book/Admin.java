package Book;
import java.util.Scanner;
import java.util.*;
public class Admin extends Guest{
    public static final String adminPassword = "admin";

    public void addBook(Scanner sc){
        System.out.println("Enter book title you want to add: ");
        String addTitle = sc.nextLine();
        System.out.println("Enter book author: ");
        String addAuthorName = sc.nextLine();
        System.out.println("Enter book genre: ");
        String addGenre = sc.nextLine();
        System.out.println("Enter published date: ");
        String addPublishedDate = sc.nextLine();
        Book newBook = new Book(addTitle, addAuthorName, addGenre, addPublishedDate);
        books.add(newBook);
    }
    public void deleteBook(Scanner sc){
        System.out.println("Enter book title you want to remove: ");
        String removeTitle = sc.nextLine();
        for (Book removeBook : books){
            if (removeBook.getTitle().equals(removeTitle)){
                books.remove(removeBook);
                System.out.println("Successfully delete book!");
                return;
            }
        }
        System.out.println("Not found!");
    }
    public void updateBook(Scanner sc){
        System.out.println("Enter title of book you want to update:");
        String updatedTitle = sc.nextLine();
        for (Book updatedBook : books){
            if (updatedBook.getTitle().equals(updatedTitle)){
                System.out.println("Enter updated title: ");
                updatedBook.setTitle(sc.nextLine());
                System.out.println("Enter updated author: ");
                updatedBook.setAuthor(sc.nextLine());
                System.out.println("Enter updated genre: ");
                updatedBook.setGenre(sc.nextLine());
                System.out.println("Enter updated published date: ");
                updatedBook.setDate(sc.nextLine());
                break;
            }
            else System.out.println("Not found!");
        }
    }
    public void adminFunctions(Scanner sc){
        while (true){
            System.out.println("1. Add book.");
            System.out.println("2. Delete book.");
            System.out.println("3. Update book.");
            System.out.println("4. Search book.");
            System.out.println("5. View all books.");
            System.out.println("6. Log out admin account.");
            System.out.println("\nEnter your option: ");
            int option = sc.nextInt();
            switch (option){
                case 1:
                    this.addBook(sc);
                    break;
                case 2:
                    deleteBook(sc);
                    break;
                case 3:
                    updateBook(sc);
                    break;
                case 4:
                    System.out.println("Enter book info: ");
                    String bookInfo = sc.nextLine();
                    super.searchBook(bookInfo);
                    break;
                case 5:
                    super.viewBooks();
                    break;
                case 6:
                    System.out.println("Log out!");
                    break;
                default:
                    System.out.println("Invalid option! Please re-enter!");
            }
        }
    }
}
