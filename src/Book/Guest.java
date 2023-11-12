package Book;
import java.util.Scanner;
import java.util.*;
public class Guest extends Main{
    public int count = 0;
    public void searchBook(String bookInfo){
        boolean found = false;
        if (books.isEmpty()) System.out.println("Not found!");
        else{
            for (Book searchingBook : books){
                if (searchingBook.getID().contains(bookInfo) ||searchingBook.getTitle().contains(bookInfo) || searchingBook.getAuthor().contains(bookInfo)
                        || searchingBook.getGenre().contains(bookInfo) || searchingBook.getDate().contains((bookInfo))){
                    System.out.println("Book ID: " + searchingBook.getID());
                    System.out.println("Book title: " + searchingBook.getTitle());
                    System.out.println("Book author: " + searchingBook.getAuthor());
                    System.out.println("Book genre: " + searchingBook.getGenre());
                    System.out.println("Book published date: " + searchingBook.getDate());
                    found = true;
                    }
                }
            }
        if (found == false) System.out.println("Not found!");

    }


    public void guestFunctions(Scanner sc){
        while (true){
            System.out.println("   Guest options: ");
            System.out.println("1. Search book.");
            System.out.println("2. View all books.");
            System.out.println("3. Log out.");
            System.out.print("Enter your option: ");
            int option = Integer.parseInt(sc.nextLine());
    //        sc.nextLine();
                switch (option) {
                    case 1:
                        System.out.print("Enter book info: ");
                        String bookInfo = sc.nextLine();
                        searchBook(bookInfo);
                        break;
                    case 2:
                        System.out.print("View all books: ");
                        if (books.isEmpty()){
                            System.out.println("The library is now empty!");
                            break;
                        }
                        else{
                            for(Book book : books){
                                System.out.println("Book ID: " + book.getID());
                                System.out.println("Book title: " + book.getTitle());
                                System.out.println("Book author: " + book.getAuthor());
                                System.out.println("Book genre: " + book.getGenre());
                                System.out.println("Published date: " + book.getDate());
                            }
                            break;
                        }

                    case 3:
                        System.out.println("Log out.");
                        Login.logIn();
                        return;
                    default:
                        System.out.println("Invalid option! Please re-enter!");
                        break;
                    }
            }
        }
}
