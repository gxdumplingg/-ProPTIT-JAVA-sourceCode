package Book;
import java.util.Scanner;
import java.util.*;
public class Guest extends Main{
    public void searchBook(String bookInfo){
        if (books.isEmpty()) System.out.println("Not found!");
        else{
            for (Book searchingBook : books){
                if (searchingBook.getTitle().contains(bookInfo) || searchingBook.getAuthor().contains(bookInfo)
                        || searchingBook.getGenre().contains(bookInfo) || searchingBook.getDate().contains((bookInfo))){
                            searchingBook.getBookInfo();
                }
            }
        }
    }
    public void viewBooks (){
        for (Book viewBook : books){
            viewBook.getBookInfo();
        }
    }
    public void guestFunctions(Scanner sc){
        while (true) {
            System.out.println("1. Search book.");
            System.out.println("2. View all books.");
            System.out.println("Enter your option: ");
            int option = sc.nextInt();
            switch (option) {
                case 1:
                    System.out.println("Enter book info: ");
                    String bookInfo = sc.nextLine();
                    this.searchBook(bookInfo);
                    break;
                case 2:
                    System.out.println("View all books: ");
                    this.viewBooks();
                    break;
                default:
                    System.out.println("Invalid option! Please re-enter!");
            }
        }
    }
}
