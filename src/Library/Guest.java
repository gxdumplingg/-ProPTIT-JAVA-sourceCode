package Library;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Guest extends LibraryManagement {
    Scanner sc = new Scanner(System.in);
    public void showList(ArrayList<Product> productsList) {
        System.out.println("-----------------");
        for (Product product : productsList) {
            product.getProductInfo();
            System.out.println("-------------");
        }
    }

public void searchingItem(String info) {
        boolean found = false;
    if (productsList.isEmpty()) {
        System.out.println("Not found!");
        return;
    }
    for (Product product : productsList) {
        if (product.getID().equals(info) || product.getName().equals(info) || product.getBrand().equals(info)
                || product.getPrice().equals(info)) {
            found = true;
//            System.out.println("Product ID: " + ((Book) product).getID());
//            System.out.println("Product title: " + ((Book) product).getName());
//            System.out.println("Product brand: " + ((Book) product).getBrand());
//            System.out.println("Product price: " + ((Book) product).getPrice());
//            System.out.println("Product author: " + ((Book) product).getAuthor());
//            System.out.println("Product genre: " + ((Book) product).getGenre());
//            System.out.println("Product publisher: " + ((Book) product).getPublisher());
//            System.out.println("Product published year: " + ((Book) product).getPublishedYear());
//            System.out.println("Product language: " + ((Book) product).getLanguage());
            product.getProductInfo();
            break;
        }
    }
//    for (Product product : productsList) {
//        if (((Notebook) product).compareNotebook(info)) {
//            found = true;
////            System.out.println("Product ID: " + product.getID());
////            System.out.println("Product title: " + product.getName());
////            System.out.println("Product brand: " + product.getBrand());
////            System.out.println("Product price: " + product.getPrice());
////            System.out.println("Product page number: " + ((Notebook) product).getPageNumbers());
////            System.out.println("Product type: " + ((Notebook) product).getType());
////            System.out.println("Product color: " + ((Notebook) product).getColor());
////            System.out.println("Product material: " + ((Notebook) product).getPaperMaterials());
////            System.out.println("Product size: " + ((Notebook) product).getSize());
//            ((Notebook)product).getProductInfo();
//            break;
//        }
//    }
//    for (Product product : productsList) {
//        if (((Pen) product).comparePen(info)) {
//            found = true;
////            System.out.println("Product ID: " + product.getID());
////            System.out.println("Product title: " + product.getName());
////            System.out.println("Product brand: " + product.getBrand());
////            System.out.println("Product price: " + product.getPrice());
////            System.out.println("Product color: " + ((Pen) product).getPenColor());
////            System.out.println("Product ink type: " + ((Pen) product).getPenInkType());
////            System.out.println("Product material: " + ((Pen) product).getPenMaterial());
////            System.out.println("Product fineness: " + ((Pen) product).getPenFineness());
//            ((Pen)product).getProductInfo();
//            break;
//        }
//    }
//    for (Product product : productsList) {
//        if (((Pencil) product).comparePencil(info)) {
//            found = true;
////            System.out.println("Product ID: " + product.getID());
////            System.out.println("Product title: " + product.getName());
////            System.out.println("Product brand: " + product.getBrand());
////            System.out.println("Product price: " +  product.getPrice());
////            System.out.println("Product color: " + ((Pencil) product).getPencilColor());
////            System.out.println("Product material: " + ((Pencil) product).getPencilMaterial());
////            System.out.println("Product hardness: " + ((Pencil) product).getPencilHardness());
//            ((Pencil)product).getProductInfo();
//        }
//    }
     if (!found) {
         System.out.println("Not found!");
         return;
     }
}

    public void guestFunctions() {
        while (true) {
            System.out.println("-------------------------------");
            System.out.println("| Guest options               |");
            System.out.println("| 1. Search item              |");
            System.out.println("| 2. View all items           |");
            System.out.println("| 3. Log out                  |");
            System.out.println("-------------------------------");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    System.out.print("Enter item you are looking for: ");
                    String itemInfo = sc.nextLine();
                    searchingItem(itemInfo);
                    break;
                case 2:
                    System.out.println("\n------------------------------ ");
                    System.out.println("|          Viewing mode :       |");
                    System.out.println("| 1. List                       |");
                    System.out.println("| 2. Table                      |");
                    System.out.println(" ------------------------------- ");
                    System.out.print("Enter view mode: ");
                    int viewMode = Integer.parseInt((sc.nextLine()));
                    if (viewMode == 1)
                        showList(productsList);
                    else if (viewMode == 2)
                        for (Product product : productsList) {
                            product.productInfoTable();
                        }
                    break;
                case 3:
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

