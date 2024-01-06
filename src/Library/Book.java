package Library;

import Library.Product;

public class Book extends Product {

    private String author, genre, publisher, publishedYear, language;

    public void setAuthor(){
        System.out.print("Enter product author: ");
        author = sc.nextLine();
            }
    public void setGenre() {
        System.out.print("Enter product genre: ");
        genre = sc.nextLine();
    }
    public void setPublisher() {
        System.out.print("Enter product publisher: ");
        publisher = sc.nextLine();
    }
    public void setPublishedYear() {
        System.out.print("Enter product published year: ");
        publishedYear = sc.nextLine();
    }
    public void setLanguage() {
        System.out.print("Enter product language: ");
        language = sc.nextLine();
    }


    public String getAuthor() {
        return "Product author: " + author;
    }
    public String getGenre() {
        return "Product genre: " + genre;
    }
    public String getPublisher() {
        return "Product publisher: " + publisher;
    }
    public String getPublishedYear() {
        return "Product published year: " + publishedYear;
    }
    public String getLanguage() {
        return "Product language: " + language;
    }

    @Override
    public void getProductInfo(){
        super.getProductInfo();
        System.out.println(getGenre());
        System.out.println(getAuthor());
        System.out.println(getPublisher());
        System.out.println(getPublishedYear());
        System.out.println(getLanguage());
    }

    @Override
    public void addProductInfo(){
        super.addProductInfo();
        setGenre();
        setAuthor();
        setPublisher();
        setPublishedYear();
        setLanguage();
    }

//    @Override
//    public void editProduct(){
//        super.editProduct();
//        setGenre();
//        setAuthor();
//        setPublisher();
//        setPublishedYear();
//        setLanguage();
//    }
    @Override
    public boolean cmp(String bookInfo){
        return super.cmp(bookInfo) || super.compare(author, bookInfo) || super.compare(genre, bookInfo) ||
                super.compare(publisher, bookInfo) || super.compare(publishedYear, bookInfo) || super.compare(language, bookInfo);
    }

    public void productTable(){
        System.out.format("%-15s %-20s %-10s %-15s", getID(), getName(), getPrice(), getBrand());
        System.out.println(" Author: " + getAuthor());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Published Year: " + getPublishedYear());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Genre: " + getGenre());
        System.out.format("%-15s %-20s %-10s %-15s %-60s\n", "", "", "", "", "Language: " + getLanguage());
    }
}
