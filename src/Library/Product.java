package Library;

import java.util.ArrayList;
import java.util.Scanner;

public class Product {
    private String ID, name, price, brand;
    Scanner sc = new Scanner(System.in);
    public static ArrayList<Product> productsList = new ArrayList<>();

    public String getID() {
        return ID;
    }
    public String getName() {
        return name;
    }
    public String getPrice() {
        return price;
    }
    public String getBrand() {
        return brand;
    }

    public void setID(String ID) {
        this.ID = ID;
    }
    public void setName(String name) {
        this.name = name;
    }
    public void setPrice(String price) {
        this.price = price;
    }
    public void setBrand(String brand) {
        this.brand = brand;
    }

    // so sanh
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
        System.out.print("Enter product ID: ");
        ID=sc.nextLine();
        System.out.print("Enter product name: ");
        name=sc.nextLine();
        System.out.print("Enter product brand: ");
        brand=sc.nextLine();
        System.out.print("Enter product price: ");
        price=sc.nextLine();
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
