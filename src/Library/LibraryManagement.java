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
                System.out.println("Successfully deleted!");
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
                book.addProductInfo();
                System.out.print("Enter updated genre: ");
                ((Book) book).setGenre();
                System.out.print("Enter updated author: ");
                ((Book) book).setAuthor();
                System.out.print("Enter updated publisher: ");
                ((Book) book).setPublisher();
                System.out.print("Enter updated published year: ");
                ((Book) book).setPublishedYear();
                System.out.print("Enter updated language: ");
                ((Book) book).setLanguage();
                break;
            }
        }
    }

    public void editProduct(){
        System.out.print("Enter product ID: ");
        String productID = sc.nextLine();
        for(Product product : productsList){
            if (!product.getID().equals(productID)){
                System.out.println("Not found!");
                return;
            }
            else{
                product.addProductInfo();
                if (product instanceof Book){
                    ((Book) product).setGenre();
                    ((Book) product).setAuthor();
                    ((Book) product).setPublisher();
                    ((Book) product).setPublishedYear();
                    ((Book) product).setLanguage();
                    break;
                }
                else if (product instanceof Notebook){
                    ((Notebook) product).setColor();
                    ((Notebook) product).setPageNumbers();
                    ((Notebook) product).setType();
                    ((Notebook) product).setPaperMaterials();
                    ((Notebook) product).setSize();
                    break;
                }
                else if (product instanceof Pen){
                    ((Pen) product).setPenColor();
                    ((Pen) product).setPenInkType();
                    ((Pen) product).setPenMaterial();
                    ((Pen) product).setPenFineness();
                    break;
                }
                else if (product instanceof Pencil){
                    ((Pencil) product).setPencilColor();
                    ((Pencil) product).setPencilMaterial();
                    ((Pencil) product).setPencilHardness();
                }
            }
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
                notebook.addProductInfo();
                ((Notebook) notebook).setPageNumbers();
                ((Notebook) notebook).setType();
                ((Notebook) notebook).setColor();
                ((Notebook) notebook).setPaperMaterials();
                ((Notebook) notebook).setSize();
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
                pen.addProductInfo();
                ((Pen) pen).setPenMaterial();
                ((Pen) pen).setPenColor();
                ((Pen) pen).setPenInkType();
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
                pencil.addProductInfo();
                ((Pencil) pencil).setPencilMaterial();
                ((Pencil) pencil).setPencilColor();
                ((Pencil) pencil).setPencilHardness();
                break;
            }
        }
    }
}

