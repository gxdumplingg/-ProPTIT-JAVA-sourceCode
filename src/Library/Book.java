package Library;

import Library.Product;

public class Book extends Product {

    private String author, genre, publisher, publishedYear, language;

    public void setAuthor(String author){
        this.author = author;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setPublisher(String publisher) {
        this.publisher = publisher;
    }
    public void setPublishedYear(String date) {
        this.publishedYear = date;
    }
    public void setLanguage(String language) {
        this.language = language;
    }


    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public String getPublisher() {
        return publisher;
    }
    public String getPublishedYear() {
        return publishedYear;
    }
    public String getLanguage() {
        return language;
    }

    @Override
    public void getProductInfo(){
        super.getProductInfo();
        System.out.println("Product genre: " + getGenre());
        System.out.println("Product author: " + getAuthor());
        System.out.println("Product publisher: " + getPublisher());
        System.out.println("Product published year: " + getPublishedYear());
        System.out.println("Product language: " + getLanguage());
    }

    @Override
    public void addProductInfo(){
        super.addProductInfo();
        System.out.print("Enter product genre: ");
        setGenre(sc.nextLine());
        System.out.print("Enter product author: ");
        setAuthor(sc.nextLine());
        System.out.print("Enter product publisher: ");
        setPublisher(sc.nextLine());
        System.out.print("Enter product published year: ");
        setPublishedYear(sc.nextLine());
        System.out.print("Enter product language: ");
        setLanguage(sc.nextLine());
    }
    public boolean compareBook(String bookInfo){
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
