import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BookRepository {

    HashSet<Author> authors = new HashSet<>();
    HashMap<Author, List<Book>> booklist = new HashMap<>();
    HashSet<Book> books = new HashSet<>();

    public void addBooks(Book book){
        books.add(book);
        if (booklist.containsKey(book.getAuthor())){
            booklist.get(book.getAuthor()).add(book);
        }
        List<Book> list = new ArrayList<>();
        list.add(book);
        booklist.put(book.getAuthor(),list);
    }
    //GetMapping
    public Book getBookwithMostPages(){
        Book maxpagesbook = null;
        int maxpages = 0;
        for (Book book : books){
            if (book.getPages() > maxpages){
                maxpages = book.getPages();
                maxpagesbook = book;
            }
        }
        return maxpagesbook;
    }
    //GetMapping
//    public Author authorwithmostPages(){
//
//    }

}
