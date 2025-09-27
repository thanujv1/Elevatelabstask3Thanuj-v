import java.util.ArrayList;

public class Library {
    private ArrayList<Book> books;
    private ArrayList<User> users;

    public Library() {
        books = new ArrayList<>();
        users = new ArrayList<>();
    }

    // Add a new book
    public void addBook(Book book) {
        books.add(book);
        System.out.println("Added: " + book);
    }

    // Register a user
    public void addUser(User user) {
        users.add(user);
        System.out.println("Registered: " + user);
    }

    // Issue a book to user
    public void issueBook(String title, int userId) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && !book.isIssued()) {
                book.issueBook();
                System.out.println("Book '" + title + "' issued to User ID: " + userId);
                return;
            }
        }
        System.out.println("Sorry, book '" + title + "' is not available.");
    }

    // Return a book
    public void returnBook(String title) {
        for (Book book : books) {
            if (book.getTitle().equalsIgnoreCase(title) && book.isIssued()) {
                book.returnBook();
                System.out.println("Book '" + title + "' returned successfully.");
                return;
            }
        }
        System.out.println("This book was not issued or doesn't exist.");
    }

    // Display all books
    public void showBooks() {
        System.out.println("\nLibrary Books:");
        for (Book book : books) {
            System.out.println(" - " + book);
        }
    }
}
