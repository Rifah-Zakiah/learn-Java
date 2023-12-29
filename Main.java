import java.util.*;
class Book{
    private String name;
    private String author;
    private int isbn;
    public static ArrayList <Book> book_list = new ArrayList <Book>();
    
    Book(String name, String author, int isbn){
        this.name = name;
        this.author = author;
        this.isbn = isbn;
    }

    void setName(String name){
        this.name = name;
    }
    void setAuthor(String author){
        this.author = author;
    }
    void setIsbn(int isbn){
        this.isbn = isbn;
    }
    String getName(){
        return name;
    }
    String getAuthor(){
        return author;
    }
    int getIsbn(){
        return isbn;
    }
    public static void add2list(Book b){
        book_list.add(b);
    }
    public static void removefromlist(Book b){
        book_list.remove(b);
    }
    public static ArrayList <Book> getBook_List(){
        return book_list;
    }
}
public class Main {
    public static void main(String[] args) {
        Book b1 = new Book("God of Small Things", "Arundhati Roy", 12345);
        Book b2 = new Book("A Certain Hunger", "Summer", 5678);

        Book.add2list(b1);
        Book.add2list(b2);

        ArrayList <Book> books = Book.getBook_List();

        System.out.println("List of books: ");
        for (Book book : books) {
            System.out.println(book.getName()+" "+book.getAuthor()+ " "+book.getIsbn());
        }
        
        System.out.println("After removing book 1:");
        Book.removefromlist(b1);
        for (Book book : books) {
            System.out.println(book.getName()+" "+book.getAuthor()+ " "+book.getIsbn());
        }
    }
}
