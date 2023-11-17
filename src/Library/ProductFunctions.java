package Library;
import java.util.ArrayList;
import java.util.Scanner;


public class ProductFunctions {
    public void adding(Scanner sc, ArrayList<Product> list) {
        Product product = new Product();
        System.out.println("-------Adding menu------");
        System.out.println("1. Book.");
        System.out.println("2. Notebook.");
        System.out.println("3. Pencil.");
        System.out.println("4. Pen.");
        System.out.print("Enter name of product you want to add: ");
        int addingProduct = Integer.parseInt(sc.nextLine());
        switch (addingProduct) {
            case 1:
                System.out.print("Enter book ID: ");
                String bookID = sc.nextLine();
                System.out.print("Enter book title: ");
                String bookTitle = sc.nextLine();
                System.out.print("Enter book author: ");
                String bookAuthor = sc.nextLine();
                System.out.print("Enter book genre: ");
                String bookGenre = sc.nextLine();
                System.out.print("Enter book price: ");
                String bookPrice = sc.nextLine();
                System.out.print("Enter book publisher: ");
                String bookPublisher = sc.nextLine();
                System.out.print("Enter book published year: ");
                String bookPublishedYear = sc.nextLine();
                System.out.print("Enter book language: ");
                String bookLanguage = sc.nextLine();
                Book newBook = new Book();
                list.add(newBook);
                break;
            case 2:
                System.out.print("Enter notebook ID: ");
                String notebookID = sc.nextLine();
                System.out.print("Enter notebook title: ");
                String notebookTitle = sc.nextLine();
                System.out.print("Enter notebook price: ");
                String notebookPrice = sc.nextLine();
                System.out.print("Enter notebook brand: ");
                String notebookBrand = sc.nextLine();
                System.out.print("Enter pages number: ");
                String pageNumber = sc.nextLine();
                System.out.print("Enter notebook type: ");
                String notebookType = sc.nextLine();
                System.out.print("Enter notebook color: ");
                String notebookColor = sc.nextLine();
                System.out.print("Enter paper material: ");
                String paperMaterial = sc.nextLine();
                System.out.print("Enter notebook size: ");
                String notebookSize = sc.nextLine();
                Notebook newNotebook = new Notebook();
                list.add(newNotebook);
                break;
        }
    }
}