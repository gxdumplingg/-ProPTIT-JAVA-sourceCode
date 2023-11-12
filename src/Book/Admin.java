package Book;
import sun.rmi.runtime.Log;

import java.util.Scanner;
import java.util.*;
public class Admin extends Guest{
    public static String adminPassword = "admin";

    public void addBook(Scanner sc){
        System.out.print("Enter ID of the book you want to add: ");
        String addID = sc.nextLine();
        System.out.print("Enter book title: ");
        String addTitle = sc.nextLine();
        System.out.print("Enter book author: ");
        String addAuthorName = sc.nextLine();
        System.out.print("Enter book genre: ");
        String addGenre = sc.nextLine();
        System.out.print("Enter published date: ");
        String addPublishedDate = sc.nextLine();
        Book newBook = new Book(addID, addTitle, addAuthorName, addGenre, addPublishedDate);
        books.add(newBook);
    }
    public void deleteBook(Scanner sc){
        System.out.print("Enter book ID you want to remove: ");
        boolean canDelete = false;
        String removeID = sc.nextLine();
        for (Book removeBook : books){
            if (removeBook.getID().equals(removeID)){
                books.remove(removeBook);
                System.out.println("Successfully delete book!");
                canDelete = true;
                break;
            }
        }
        if (canDelete == false) System.out.println("Not found!");
    }
    public void updateBook(Scanner sc){
        System.out.print("Enter ID of book you want to update: " );
        String updatedID = sc.nextLine();
        boolean found = false;
        for (Book updatedBook : books){
            if (updatedBook.getID().equals(updatedID)){
                found = true;
                System.out.print("Enter updated ID: ");
                updatedBook.setId(sc.nextLine());
                System.out.print("Enter updated title: ");
                updatedBook.setTitle(sc.nextLine());
                System.out.print("Enter updated author: ");
                updatedBook.setAuthor(sc.nextLine());
                System.out.print("Enter updated genre: ");
                updatedBook.setGenre(sc.nextLine());
                System.out.print("Enter updated published date: ");
                updatedBook.setDate(sc.nextLine());
                System.out.println();
                break;
            }
        }
        if (found == false) System.out.println("Not found!");
    }
    public void adminFunctions(Scanner sc){
        while (true){
            System.out.println("   Admin Options: ");
            System.out.println("1. Add book.");
            System.out.println("2. Delete book.");
            System.out.println("3. Update book.");
            System.out.println("4. Search book.");
            System.out.println("5. View all books.");
            System.out.println("6. Log out admin account.");
            System.out.print("Enter your option: ");
            int option = Integer.parseInt(sc.nextLine());
//            sc.nextLine();
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
//                        for (int i = 0; i < books.size(); ++i) {
//                            System.out.println("Book title: " + books.get(i).getTitle());
//                            System.out.println("Book author: " + books.get(i).getAuthor());
//                            System.out.println("Book genre: " + books.get(i).getGenre());
//                            System.out.println("Published date: " + books.get(i).getDate());
//                        }
                        for(Book book : books){
                            System.out.println("Book ID: " + book.getID());
                            System.out.println("Book title: " + book.getTitle());
                            System.out.println("Book author: " + book.getAuthor());
                            System.out.println("Book genre: " + book.getGenre());
                            System.out.println("Published date: " + book.getDate());
                        }
                    }
                    else System.out.println("The library is now empty!");
                    break;
                case 6:
                    System.out.println("Log out!");
                    Login.logIn();
                    return;
                default:
                    System.out.println("Invalid option! Please re-enter!");
                    break;
            }
        }
    }
}
