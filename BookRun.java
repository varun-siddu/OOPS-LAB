//Develop a Java program to create a class Book with members Book ID, Title, Author and price. Use a constructor to initialize the details. 
// Include methods to display book information, overload search() to search by Book ID and title, and create a method that accepts another 
// Book objects and return the costlier Book. Use a static member to maintain the total no. of books created. In the main class create multiple Book objects and demonstrate all the operations.
class Book {
    int bookId;
    String title;
    String author;
    double price;
    static int count = 0;
    Book(int id, String t, String a, double p) {
        bookId = id;
        title = t;
        author = a;
        price = p;
        count++;
    }
    void display() {
        System.out.println("Book ID: " + bookId);
        System.out.println("Title: " + title);
        System.out.println("Author: " + author);
        System.out.println("Price: " + price);
    }
    void search(int id) {
        if (bookId == id)
            System.out.println("Book found: " + title);
        else
            System.out.println("Book not found");
    }
    void search(String t) {
        if (title.equals(t))
            System.out.println("Book found: " + title);
        else
            System.out.println("Book not found");
    }
    Book costlier(Book b) {
        if (price > b.price)
            return this;
        else
            return b;
    }
}
public class BookRun{
    public static void main(String[] args) {
        Book b1 = new Book(101, "Java", "James", 500);
        Book b2 = new Book(102, "Python", "Guido", 700);
        b1.display();
        b2.display();
        b1.search(101);
        b2.search("Python");
        Book b3 = b1.costlier(b2);
        System.out.println("Costlier Book:");
        b3.display();
        System.out.println("Total Books: " + Book.count);
    }
}