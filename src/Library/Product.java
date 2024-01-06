package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String ID, name, price, brand;
    Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> productsList = new ArrayList<>();

    public String getID() {
        return "Product ID: " + ID;
    }
    public String getName() {
        return "Product name: " + name;
    }
    public String getPrice() {
        return "Product price: " + price;
    }
    public String getBrand() {
        return "Product brand: " + brand;
    }

    public void setID() {
        System.out.print("Enter product ID: ");
        ID = sc.nextLine();
    }
    public void setName() {
        System.out.print("Enter product name: ");
        name = sc.nextLine();
    }
    public void setPrice() {
        System.out.print("Enter product price: ");
        price = sc.nextLine();

    }
    public void setBrand() {
        System.out.print("Enter product brand: ");
        brand = sc.nextLine();
    }

    // compare
    public boolean compare(String a, String b){
        return a.toLowerCase().contains(b.toLowerCase());
    }

    public boolean cmp(String searchItem){
        return compare (ID, searchItem) || compare(name, searchItem) || compare(price, searchItem) || compare(brand, searchItem);
    }


    public void getProductInfo(){
        System.out.println("Product ID: " + getID());
        System.out.println("Product name: " + getName());
        System.out.println("Product brand: " + getBrand());
        System.out.println("Product price: " + getPrice());
    }

    public void addProductInfo(){
        setID();
        setName();
        setBrand();
        setPrice();
    }

    public void editProduct(){
        boolean found = false;
        System.out.print("Enter product ID you want to edit: ");
        String editID = sc.nextLine();
        for (Product product : productsList){
            if (product.ID.equals(editID)){
                found = true;
                product.addProductInfo();
                break;
            }
            else {
                found = false;
            }
        }
        if (!found) {
            System.out.println("Not found!");
            return;
        }
    }

    public void productInfoTable(){
        System.out.format("%-15s %-20s %-10s %-15s %-20s\n", "ID" , "Name" , "Price" , "Brand" , "Other info");
        System.out.format("%-15s %-20s %-10s %-15s", getID(), getName(), getPrice(), getBrand());
//        System.out.println(" Author: " + Book.getAuthor());
//        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Published Year: " + getPublishedYear());
//        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Genre: " + getGenre());
//        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Language: " + getLanguage());
    }
    
}
