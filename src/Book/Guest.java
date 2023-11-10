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
                    System.out.println("Book title: " + searchingBook.getTitle());
                    System.out.println("Book author: " + searchingBook.getAuthor());
                    System.out.println("Book genre: " + searchingBook.getGenre());
                    System.out.println("Book published date: " + searchingBook.getDate());
                    }
                }
            }

    }


    public void guestFunctions(Scanner sc){
        while (true){

            System.out.println("Guest options: ");
            System.out.println("1. Search book.");
            System.out.println("2. View all books.");
            System.out.println("3. Log out.");
            System.out.println("Enter your option: ");
            int option = Integer.parseInt(sc.nextLine());
    //        sc.nextLine();
                switch (option) {
                    case 1:
                        System.out.print("Enter book info: ");
                        String bookInfo = sc.nextLine();
                        this.searchBook(bookInfo);
                        break;
                    case 2:
                        System.out.print("View all books: ");
                        for (int i = 0; i<books.size(); ++i){
                                System.out.println("Book title: " + books.get(i).getTitle());
                                System.out.println("Book author: " + books.get(i).getAuthor());
                                System.out.println("Book genre: " + books.get(i).getGenre());
                                System.out.println("Published date: " + books.get(i).getDate());
                            }
                        break;
                    case 3:
                        System.out.println("Log out.");
                        LogIn.LogIn();
                        return;
                    default:
                        System.out.println("Invalid option! Please re-enter!");
                        break;
                    }
            }
        }
}
