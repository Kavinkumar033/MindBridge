//Create a class Book with default values for title and author. Write a default constructor to initialize these attributes.
package Day2;
class Book
{
    String title;
    String author;
    Book()
    {
        title="the psychology of money";
        author="Morgan Housel";
    }
    void DisplayBookDetails()
    {
        System.out.println("****************************************");
        System.out.println("Book Title : "+title);
        System.out.println("Book Author : "+author);
    }
}
public class DefaultConstructor {
    public static void main(String[] args) {
     Book b1 = new Book();
     b1.DisplayBookDetails();
    }
}
