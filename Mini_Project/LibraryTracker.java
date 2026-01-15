import java.util.ArrayList;
import java.util.Scanner;

public class LibraryTracker {
    public static void main(String[] args) {
        ArrayList<Book> library = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);

        // Pre-fill library with some books
        library.add(new Book(101, "Java Programming"));
        library.add(new Book(102, "The subtle Art of Not Giving a Fuck!"));
        library.add(new Book(103, "The Hobbit"));
		library.add(new Book(104, "Rich Dad, Poor Dad"));

        System.out.println("--- Welcome to the Library Tracker ---");

        while (true) {
            System.out.println("\n1. View Books\n2. Check Out\n3. Return\n4. Exit");
            System.out.print("Choose an option: ");

            if (!scanner.hasNextInt()) {
                System.out.println("Please enter a number.");
                scanner.next();
                continue;
            }

            int choice = scanner.nextInt();

            if (choice == 1) {
                // View all books
                for (Book b : library) System.out.println(b);

            } else if (choice == 2 || choice == 3) {
                // Check Out or Return Logic
                System.out.print("Enter Book ID: ");
                int id = scanner.nextInt();
                boolean found = false;

                for (Book b : library) {
                    if (b.getId() == id) {
                        found = true;
                        if (choice == 2) { // Check Out
                            if (b.isAvailable()) {
                                b.setAvailable(false);
                                System.out.println("Success! You took: " + b.getTitle());
                            } else {
                                System.out.println("Sorry, this book is already out.");
                            }
                        } else { // Return
                            b.setAvailable(true);
                            System.out.println("Book returned: " + b.getTitle());
                        }
                    }
                }
                if (!found) System.out.println("Book ID not found.");

            } else if (choice == 4) {
                System.out.println("Goodbye! and Thanks for coming");
                break;
            }
        }
        scanner.close();
    }
}