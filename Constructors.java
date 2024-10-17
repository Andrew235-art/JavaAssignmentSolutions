// 8. Book Class with Constructors 

public class Constructors { 
    
    // Encapsulation 
    private String title; 
    private String author; 
    private double price; 
    
    // Constructor with all attributes 
    
    public Book(String title, String author, double price) { 
        this.title = title; 
        this.author = author; 
        this.price = price; 
    } 
    
    // Constructor with title and author only 
    
    public Book(String title, String author) { 
        this(title, author, 0); // Default price to $0 
    } 
    
    public void displayDetails() { 
        System.out.println("Title: " + title + ", Author: " + author + ", Price: $" + price); 
    } 
    
    public static void main(String[] args) { 

        Book book1 = new Book("Java Programming", "John Doe", 29.99); 
        book1.displayDetails(); 
        
        Book book2 = new Book("Python Programming", "Jane Doe"); 
        book2.displayDetails(); 
    } 
}