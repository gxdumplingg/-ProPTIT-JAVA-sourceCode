package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class LibraryManagement extends Product {
    Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> productsList = new ArrayList<>();

    public void menuItems() {
        System.out.println(
                "|-------------------------|\n" +
                        "|  Menu Items:            |\n" +
                        "|  1. Book.               |\n" +
                        "|  2. Notebook.           |\n" +
                        "|  3. Pen.                |\n" +
                        "|  4. Pencil.             |\n" +
                        "|-------------------------|");
    }

    //adding
    public void addItem(Product newProduct) {
        newProduct.addProductInfo();
        productsList.add(newProduct);
    }


    public void deleteItem() {
        System.out.print("Enter item ID: ");
        String itemID = sc.nextLine();
        boolean found = false;
        for (Product product : productsList) {
            if (product.getID().equals(itemID)) {
                found = true;
                productsList.remove(product);
                break;
            }
        }
        if (!found) {
            System.out.println("Not found!");
            return;
        }
    }


    //updating
    public void updateBook() {
        System.out.print("Enter item ID: ");
        String itemID = sc.nextLine();
        for (Product book : productsList) {
            if (!book.getID().equals(itemID)) {
                System.out.println("Not found!");
                return;
            } else {
                System.out.print("Enter updated ID: ");
            }
            book.setID(sc.nextLine());
            System.out.print("Enter updated title: ");
            book.setName(sc.nextLine());
            System.out.print("Enter updated brand: ");
            book.setBrand(sc.nextLine());
            System.out.print("Enter updated price: ");
            book.setPrice(sc.nextLine());
            System.out.print("Enter updated genre: ");
            ((Book) book).setGenre(sc.nextLine());
            System.out.print("Enter updated author: ");
            ((Book) book).setAuthor(sc.nextLine());
            System.out.print("Enter updated publisher: ");
            ((Book) book).setPublisher(sc.nextLine());
            System.out.print("Enter updated published year: ");
            ((Book) book).setPublishedYear(sc.nextLine());
            System.out.print("Enter updated language: ");
            ((Book) book).setLanguage(sc.nextLine());
            break;
        }
    }


    public void updateNotebook() {
        System.out.print("Enter item ID: ");
        String itemID = sc.nextLine();
        for (Product notebook : productsList) {
            if (!notebook.getID().equals(itemID)) {
                System.out.println("Not found!");
                return;
            } else {
                System.out.print("Enter updated ID: ");
                notebook.setID(sc.nextLine());
                System.out.print("Enter updated title: ");
                notebook.setName(sc.nextLine());
                System.out.print("Enter updated brand: ");
                notebook.setBrand(sc.nextLine());
                System.out.print("Enter updated price: ");
                notebook.setPrice(sc.nextLine());
                System.out.print("Enter updated page number: ");
                ((Notebook) notebook).setPageNumbers(sc.nextLine());
                System.out.print("Enter updated notebook type: ");
                ((Notebook) notebook).setType(sc.nextLine());
                System.out.print("Enter updated cover color: ");
                ((Notebook) notebook).setColor(sc.nextLine());
                System.out.print("Enter updated paper material: ");
                ((Notebook) notebook).setPaperMaterials(sc.nextLine());
                System.out.print("Enter updated size: ");
                ((Notebook) notebook).setSize(sc.nextLine());
                break;
            }
        }
    }

    public void updatePen() {
        System.out.print("Enter item ID: ");
        String itemID = sc.nextLine();
        for (Product pen : productsList) {
            if (!pen.getID().equals(itemID)) {
                System.out.println("Not found!");
                return;
            } else {
                System.out.print("Enter updated ID: ");
                pen.setID(sc.nextLine());
                System.out.print("Enter updated title: ");
                pen.setName(sc.nextLine());
                System.out.print("Enter updated brand: ");
                pen.setBrand(sc.nextLine());
                System.out.print("Enter updated price: ");
                pen.setPrice(sc.nextLine());
                System.out.print("Enter updated pen material: ");
                ((Pen) pen).setPenMaterial(sc.nextLine());
                System.out.print("Enter updated pen color: ");
                ((Pen) pen).setPenColor(sc.nextLine());
                System.out.print("Enter updated ink type: ");
                ((Pen) pen).setPenInkType(sc.nextLine());
                System.out.print("Enter updated pen fineness: ");
                break;
            }
        }
    }

    public void updatePencil() {
        System.out.print("Enter item ID: ");
        String itemID = sc.nextLine();
        for (Product pencil : productsList) {
            if (!pencil.getID().equals(itemID)) {
                System.out.println("Not found!");
                return;
            } else {
                System.out.print("Enter updated ID: ");
                pencil.setID(sc.nextLine());
                System.out.print("Enter updated title: ");
                pencil.setName(sc.nextLine());
                System.out.print("Enter updated brand: ");
                pencil.setBrand(sc.nextLine());
                System.out.print("Enter updated price: ");
                pencil.setPrice(sc.nextLine());
                System.out.print("Enter updated pen material: ");
                ((Pencil) pencil).setPencilMaterial(sc.nextLine());
                System.out.print("Enter updated pen color: ");
                ((Pencil) pencil).setPencilColor(sc.nextLine());
                System.out.print("Enter updated pencil hardness: ");
                ((Pencil) pencil).setPencilHardness(sc.nextLine());
                break;
            }
        }
    }
}

