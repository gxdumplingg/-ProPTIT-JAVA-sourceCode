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
        if (product.getID().contains(info) || product.getName().contains(info) || product.getBrand().contains(info)
                || product.getPrice().contains(info) || ((Book)product).getAuthor().contains(info) || ((Book)product).getGenre().contains(info)) {
            found = true;
            product.getProductInfo();
            break;
        }
    }
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

