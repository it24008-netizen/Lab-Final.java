class Book {
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

public class BookDemo {
    public static void main(String[] args) {
        Book[] books = new Book[5];
        books[0] = new Book(101, "Java Basics", 450);
        books[1] = new Book(102, "Data Structures", 600);
        books[2] = new Book(103, "Algorithms", 550);
        books[3] = new Book(104, "Database", 400);
        books[4] = new Book(105, "Operating Systems", 700);

        double totalPrice = 0;
        System.out.println("Books with price > 500:");
        for (Book b : books) {
            totalPrice += b.price;
            if (b.price > 500) {
                b.display();
            }
        }

        double avgPrice = totalPrice / books.length;
        System.out.println("Average Price of all books: " + avgPrice);
    }
}
