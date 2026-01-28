package ObjectInteractionArray;

public class Main {
    public static void main(String[] args) {
        Book[] books = {
            new Book(1, "Java Basics", 450),
            new Book(2, "OOP Concepts", 550),
            new Book(3, "Data Structures", 600),
            new Book(4, "Algorithms", 700),
            new Book(5, "Networking", 480)
        };

        double total = 0;
        System.out.println("Books with price > 500:");
        for (Book b : books) {
            total += b.price;
            if (b.price > 500) {
                b.display();
            }
        }

        double avg = total / books.length;
        System.out.println("Average Price: " + avg);
    }
}