public class Book {
    // Attributes (Fields)
    private String title;
    private String author;
    private String ISBN;
    private double price;

    // Default Constructor
    public Book() {
        this.title = "";
        this.author = "";
        this.ISBN = "";
        this.price = 0.0;
    }

    // Parameterized Constructor
    public Book(String title, String author, String ISBN, double price) {
        this.title = title;
        this.author = author;
        this.ISBN = ISBN;
        this.price = price;
    }

    // Method to display book details
    public void displayInfo() {
        System.out.println("Book Details:");
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("ISBN: " + ISBN);
        System.out.println("Price: $" + price);
    }


    // Main Method for Testing
    public static void main(String[] args) {
        // Using Default Constructor
        Book defaultBook = new Book();
        defaultBook.displayInfo();

        // Using Parameterized Constructor
        Book fictionBook = new Book("The Great Gatsby", "F. Scott Fitzgerald", "9780743273565", 10.99);
        fictionBook.displayInfo();

        // Testing the additional method
        fictionBook.applyDiscount(15);
        fictionBook.displayInfo();

        // Another example with parameterized constructor
        Book scienceBook = new Book("A Brief History of Time", "Stephen Hawking", "9780553380163", 18.99);
        scienceBook.displayInfo();
    }
}
