import java.util.ArrayList;  // importing the ArryList package from java.util
public class Book { String Title; String Author; int ISBN; // declaring the variables in the book class
    public Book(String title, String author, int isbn) { // this is the constructor for the book class
        this.Title = title;
        this.Author = author;
        this.ISBN = isbn;
    }
    public String getTitle() {return Title;} // these are the getters for the book class
    public String getAuthor() {return Author;} // these are the getters for the book class
    public int getISBN() {return ISBN;} // these are the getters for the book class

    static class Library { public ArrayList<Book> books; //this is a class for the library

        public Library(ArrayList<Book> books) {this.books = books;} //this is the constructor for the library class

        public void addBook(Book book) {
            books.add(book);
        } // this is the method to add a book to the library

        public void SearchbyTitle(String title) {  // this is the method to search for a book by title
            for (Book i : books) {  //for Book in books, if the title is equal to the title of the book, print the book
                if (i.getTitle().equalsIgnoreCase(title)) {
                    System.out.println("Book found!");
                    System.out.println("Title: " + i.getTitle());
                    return;
                }
            }
            System.out.println("Book not found with title: " + title);
        }
        public void searchbyAuthor(String author) // this is the method to search for a book by author
        {
            for (Book j : books)
            {
                if (j.getAuthor().equalsIgnoreCase(author))
                {
                    System.out.println("Book found!");
                    System.out.println(" Author: " + j.getAuthor());
                    return;
                }
            }
            System.out.println("Book not found with author: " + author);
        }
        public void searchbyISBN(int ISBN) // this is the method to search for a book by ISBN
        {
            for (Book k : books)
            {
                if (k.getISBN()==ISBN)
                {
                    System.out.println("Book found!");
                    System.out.println(" ISBN: " + k.getISBN());
                    return;
                }
            }
            System.out.println("Book not found with ISBN: " + ISBN);
        }
    }

}


