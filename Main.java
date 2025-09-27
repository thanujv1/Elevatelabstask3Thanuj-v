public class Main {
    public static void main(String[] args) {
        Library library = new Library();

        // Add some books
        library.addBook(new Book("The Alchemist", "Paulo Coelho"));
        library.addBook(new Book("1984", "George Orwell"));
        library.addBook(new Book("Clean Code", "Robert C. Martin"));

        // Register users
        library.addUser(new User("Alice", 1));
        library.addUser(new User("Bob", 2));

        // Show all books
        library.showBooks();

        // Issue a book
        library.issueBook("1984", 1);
        library.showBooks();

        // Try issuing the same book again
        library.issueBook("1984", 2);

        // Return a book
        library.returnBook("1984");
        library.showBooks();
    }
}
