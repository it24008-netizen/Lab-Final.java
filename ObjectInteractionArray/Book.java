package ObjectInteractionArray;

public class Book {
    int bookId;
    String title;
    double price;

    public Book(int bookId, String title, double price) {
        this.bookId = bookId;
        this.title = title;
        this.price = price;
    }

    public void display() {
        System.out.println("ID: " + bookId + ", Title: " + title + ", Price: " + price);
    }
}