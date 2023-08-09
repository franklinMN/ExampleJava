/*Step 2: Create the Borrower interface

Define a Java interface named "Borrower" with the following methods:
borrow(Book book): This method should allow a borrower to borrow a book.
returnBook(Book book): This method should allow a borrower to return a book.

*/


public interface Borrower<B> {
    void borrow(B book);
    void returnBook(B book);
}
