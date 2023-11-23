package Library;
import Library.Login;
import Library.Guest;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Admin extends Guest {
    public static String adminPassword = "admin";

    public void addItemMode(Product newProduct) {
        menuItems();
        System.out.print("Choose item you want to add: ");
        int option = Integer.parseInt((sc.nextLine()));
        switch (option) {
            case 1:
                addItem(new Book());
                System.out.println("Successfully added!");
                break;
            case 2:
                addItem(new Notebook());
                System.out.println("Successfully added!");
                break;
            case 3:
                addItem(new Pen());
                System.out.println("Successfully added!");
                break;
            case 4:
                addItem(new Pencil());
                System.out.println("Successfully added!");
                break;
        }
    }
    public void updateItem() {
        menuItems();
        System.out.print("Choose item you want to update: ");
        int option = Integer.parseInt(sc.nextLine());
        switch (option) {
            case 1:
                updateBook();
                System.out.println("Successfully updated!");
                break;
            case 2:
                updateNotebook();
                System.out.println("Successfully updated!");
                break;
            case 3:
                updatePen();
                System.out.println("Successfully updated!");
                break;
            case 4:
                updatePencil();
                System.out.println("Successfully updated!");
                break;
            default:
                System.out.println("Invalid option! Please re-enter!");
                break;
        }
    }

    public void viewItems(ArrayList<Product> productsList) {
        if (productsList.isEmpty()) {
            System.out.println("Not found!");
            return;
        }
        System.out.println("\n------------------------------ ");
        System.out.println("|          Viewing mode :       |");
        System.out.println("| 1. List                       |");
        System.out.println("| 2. Table                      |");
        System.out.println(" ------------------------------- ");
        System.out.print("Enter view mode: ");
        int viewMode = Integer.parseInt((sc.nextLine()));
        switch (viewMode) {
            case 1:
                super.showList(productsList);
                break;
//            case 2:
//                for (Product product : productsList) {
//                    product.productInfoTable();                       // em chưa hiểu cách vẽ bảng ạ
//                }
//                break;

        }
    }

    public void adminFunctions() {
        while (true) {
            System.out.println("\n------------------------------ ");
            System.out.println("|        Admin functions        |");
            System.out.println("|1. Add item                    |");
            System.out.println("|2. Delete item                 |");
            System.out.println("|3. Update item                 |");
            System.out.println("|4. Search item                 |");
            System.out.println("|5. View all items              |");
            System.out.println("|6. Log out admin account       |");
            System.out.println(" ------------------------------- ");
            System.out.print("Enter your option: ");
            int option = Integer.parseInt(sc.nextLine());
            switch (option) {
                case 1:
                    addItemMode(new Product());
                    break;
                case 2:
                    if (productsList.isEmpty()) {
                        System.out.println("There is no matching item!");
                    }
                    else{
                        deleteItem();
                    }
                    break;
                case 3:
                    if (productsList.isEmpty()) {
                        System.out.println("Cannot update! Try again!");
                    } else {
                        updateItem();
                    }
                    break;
                case 4:
                    System.out.print("Enter item you are looking for: ");
                    String itemInfo = sc.nextLine();
                    super.searchingItem(itemInfo);
                    break;
                case 5:
                    if (productsList.isEmpty()) {
                        System.out.println("The library is now empty!");
                    } else {
                        viewItems(productsList);
                    }
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
