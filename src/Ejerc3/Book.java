package Ejerc3;

public class Book {
    private String title;
    private String author;
    private int pages;

    public Book(String title, String author, int pages) {
        this.title = title;
        this.author = author;
        this.pages = pages;
    }

    public String Getinfo(){
        return "Title:"+ this.title +"\n"+ "author" + this.author +"\n"+ "Pages"+ this.pages;
    }
    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", author='" + author + '\'' +
                ", pages='" + pages + '\'' +
                '}';
    }
}
