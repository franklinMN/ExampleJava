/*Step 1: Create the Book class

Create a Java class named "Book" with the following attributes: title (String), author (String), and publicationYear (int).
Implement a constructor that takes values for all attributes.
Implement getter and setter methods for all attributes.

*/

public class Books {
    private String title;
    private String author;
    private int publicationYear;

    public Books(String title, String author, int publicationYear) {
        this.title = title;
        this.author = author;
        this.publicationYear = publicationYear;
    }

    // Getters and setters
    public String getTitle() {
        return title;
    }

    public String getAuthor() {
        return author;
    }

    public int getPublicationYear() {
        return publicationYear;
    }
}

