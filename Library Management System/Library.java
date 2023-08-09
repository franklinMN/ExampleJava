import java.util.ArrayList;
import java.util.List;
import LibraryManagementSystem.Borrower;

/*

Step 3: Create the Library class

Create a Java class named "Library" that implements the Borrower interface.
Use a generic type parameter for the Library class to allow it to work with different types of books.
Implement a collection (e.g., ArrayList) to store the books in the library.
Implement methods to add a book to the library, remove a book from the library, and display all books in the library.

Step 4: Implement the borrow() and returnBook() methods

In the Library class, implement the borrow() method from the Borrower interface.
This method should check if the book is available in the library and remove it from the collection if it is.
If the book is not available, display an appropriate message.
Implement the returnBook() method from the Borrower interface.
This method should add the returned book back to the library collection.

*/

class Library<T extends Books> implements Borrower {
    private List<T> books;

    public Library() {
        books = new ArrayList<>();
    }

    public void addBook(T book) {
        books.add(book);
    }

    public void removeBook(T book) {
        books.remove(book);
    }

    public void displayBooks() {
        System.out.println("Books in the library:");
        for (T book : books) {
            System.out.println(book.getTitle() + " by " + book.getAuthor() +
                               ", Year: " + book.getPublicationYear());
        }
    }

    @Override
    public void borrow(Books book) {
        if (books.contains(book)) {
            removeBook((T) book);
            System.out.println("Book borrowed: " + book.getTitle());
        } else {
            System.out.println("Book not available for borrowing.");
        }
    }

    @Override
    public void returnBook(Books book) {
        addBook((T) book);
        System.out.println("Book returned: " + book.getTitle());
    }
}