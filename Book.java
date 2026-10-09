public class Book {

    String title;
    String author;
    int year;


    // Parameterless constructor
    public Book() {
        title = "Unknown";
        author = "Unknown";
        year = 0;
    }

    public static void main(String[] args) {

        Book book = new Book();

        System.out.println("Title: " + book.title);
        System.out.println("Author: " + book.author);
        System.out.println("Year: " + book.year);
    }
}