package Book;
import sun.rmi.runtime.Log;

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
        System.out.print("Enter book title you want to remove: ");
        int ok = 1;
        String removeTitle = sc.nextLine();
        for (Book removeBook : books){
            if (removeBook.getTitle().equals(removeTitle)){
                books.remove(removeBook);
                System.out.println("Successfully delete book!");
                ok = 0;
                break;
            }
        }
        if (ok == 1) System.out.println("Not found!");
    }
    public void updateBook(Scanner sc){
        System.out.print("Enter title of book you want to update:");
        String updatedTitle = sc.nextLine();
        for (Book updatedBook : books){
            if (updatedBook.getTitle().equals(updatedTitle)){
                System.out.print("Enter updated title: ");
                updatedBook.setTitle(sc.nextLine());
                System.out.print("Enter updated author: ");
                updatedBook.setAuthor(sc.nextLine());
                System.out.print("Enter updated genre: ");
                updatedBook.setGenre(sc.nextLine());
                System.out.print("Enter updated published date: ");
                updatedBook.setDate(sc.nextLine());
                break;
            }
            else System.out.println("Not found!");
        }
    }
    public void adminFunctions(Scanner sc){
        while (true){
            System.out.println("Admin Options: ");
            System.out.println("1. Add book.");
            System.out.println("2. Delete book.");
            System.out.println("3. Update book.");
            System.out.println("4. Search book.");
            System.out.println("5. View all books.");
            System.out.println("6. Log out admin account.");
            System.out.println("Enter your option: ");
            int option = sc.nextInt();
            sc.nextLine();
            switch (option){
                case 1:
                    addBook(sc);
                    break;
                case 2:
                    deleteBook(sc);
                    break;
                case 3:
                    updateBook(sc);
                    break;
                case 4:
                    System.out.print("Enter book info: ");
                    String bookInfo = sc.nextLine();
                    super.searchBook(bookInfo);
                    break;
                case 5:
                    if (!books.isEmpty()) {
                        for (int i = 0; i < books.size(); ++i) {
                            System.out.println("Book title: " + books.get(i).getTitle());
                            System.out.println("Book author: " + books.get(i).getAuthor());
                            System.out.println("Book genre: " + books.get(i).getGenre());
                            System.out.println("Published date: " + books.get(i).getDate());
                        }
                    }
                    else System.out.println("The library is now empty!");
                    break;
                case 6:
                    System.out.println("Log out!");
                    LogIn.LogIn();
                    return;
                default:
                    System.out.println("Invalid option! Please re-enter!");
                    break;
            }
        }
    }
}
