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
//    public void viewBooks (){
//        for (Book viewBook : books){
//            viewBook.getBookInfo();
//        }
//    }
    public void guestFunctions(Scanner sc){
//        while (true) {
            System.out.println("Guest options: ");
            System.out.println("1. Search book.");
            System.out.println("2. View all books.");
            System.out.println("Enter your option: ");
            int option = sc.nextInt();
            sc.nextLine();
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
                default:
                    System.out.println("Invalid option! Please re-enter!");
                    break;
            }
//        }
    }
}
