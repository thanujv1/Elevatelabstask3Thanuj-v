A mini Library Management System built using Java and Object-Oriented Programming (OOP) principles.
The system manages books and users, allowing features like issuing and returning books.

🛠️ Tools & Requirements

Java JDK 8+

VS Code / IntelliJ / Any IDE

Terminal / Command Prompt

📂 Project Structure
LibraryManagement/
 ├── Book.java      # Book class (title, author, issue status)
 ├── User.java      # User class (user details)
 ├── Library.java   # Library class (manages books & users)
 └── Main.java      # Main entry point (demo)

🚀 Features

Add books to the library

Register users

Issue a book to a user

Return a book

Display all books with status (Available / Issued)

▶️ How to Run

Clone or Download the project folder.

Open a terminal inside the project directory.

Compile all .java files:

javac *.java


Run the program:

java Main

📖 Example Output
Added: The Alchemist by Paulo Coelho [Available]
Added: 1984 by George Orwell [Available]
Added: Clean Code by Robert C. Martin [Available]
Registered: User: Alice (ID: 1)
Registered: User: Bob (ID: 2)

Library Books:
 - The Alchemist by Paulo Coelho [Available]
 - 1984 by George Orwell [Available]
 - Clean Code by Robert C. Martin [Available]

Book '1984' issued to User ID: 1

Library Books:
 - The Alchemist by Paulo Coelho [Available]
 - 1984 by George Orwell [Issued]
 - Clean Code by Robert C. Martin [Available]

Sorry, book '1984' is not available.
Book '1984' returned successfully.

🔮 Future Enhancements

Menu-driven system (interactive user input)

Track which user has borrowed which book

Search books by title/author

Save & load data using files or database

Output:

<img width="1710" height="1107" alt="Screenshot 2025-09-27 at 4 45 47 PM" src="https://github.com/user-attachments/assets/a6a715d4-d6a1-4fd8-9814-ea7dde912e38" />

<img width="1710" height="1107" alt="Screenshot 2025-09-27 at 4 47 11 PM" src="https://github.com/user-attachments/assets/2eef59e3-6369-47ba-822f-597561a5539c" />


