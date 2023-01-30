import java.util.HashMap;
import java.util.HashSet;
import java.util.List;

public class BookController {
    BookRepository bookRepository = new BookRepository();
    //@PostMapping
    public void addBooks(Book book){
        bookRepository.addBooks(book);
    }
    //GetMapping
    public Book getBookWithMostPages(){
        return bookRepository.getBookwithMostPages();
    }
    //GetMapping
//    public Author authorwithmostPages(){
//
//    }
}
