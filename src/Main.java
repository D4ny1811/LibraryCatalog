import java.util.ArrayList;

public class Main
{
    public static void main(String[] args)
    {
        ArrayList<Book> books = new ArrayList<Book>(); // this is the array list for the books

        Book book1 = new Book("The Hobbit", "J.R.R. Tolkien", 123456789); // these are the books
        Book book2 = new Book("The Fellowship of the Ring", "J.R.R. Tolkien", 1011121314);
        Book book3 = new Book("The Two Towers", "J.R.R. Tolkien", 1516171819);
        Book book4=new Book("Harry Potter","J.K. Rowling",2021222324);

        books.add(book1); // these are the books being added to the array list
        books.add(book2);
        books.add(book3);
        books.add(book4);
        Book.Library library = new Book.Library(books); // this is the library

        library.SearchbyTitle("The Hobbit"); // these are the searches
        library.searchbyAuthor("J.R.R. Tolkien");
        library.searchbyISBN(123456789);
    }

}