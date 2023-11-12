package Book;

public class Book {
//    public static int bookNumbers = 0;

    private String id, title, author, genre, date;
    public Book(String id, String title, String author, String genre, String date){
        this.id = id;
        this.title = title;
        this.author = author;
        this.genre = genre;
        this.date = date;
    }

    public void setId(String id) {
        this.id = id;
    }
    public void setTitle(String title){
        this.title = title;
    }
    public void setAuthor(String author){
        this.author = author;
    }
    public void setGenre(String genre) {
        this.genre = genre;
    }
    public void setDate(String date) {
        this.date = date;
    }

    public String getID() {
        return id;
    }
    public String getTitle() {
        return title;
    }
    public String getAuthor() {
        return author;
    }
    public String getGenre() {
        return genre;
    }
    public String getDate() {
        return date;
    }

}
