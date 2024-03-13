package ng.edu.binghamuni.bookstore.Controller.API;
import ng.edu.binghamuni.bookstore.Domain.Book;
import ng.edu.binghamuni.bookstore.Service.BookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/books")
public class BookAPIController {

    @Autowired
    private BookService service;

    @GetMapping
    public List<Book> getAllBooks() {
        return service.getAllBook();
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable("id") int id) {
        return service.getBookById(id);
    }

    @PostMapping
    public void addBook(@RequestBody Book book) {
        service.save(book);
    }

    @PutMapping("/{id}")
    public void updateBook(@PathVariable("id") int id, @RequestBody Book book) {
        Book existingBook = service.getBookById(id);
        if (existingBook != null) {
            // Update the existing book with the new data
            existingBook.setName(book.getName());
            existingBook.setAuthor(book.getAuthor());
            existingBook.setPrice(book.getPrice());
            service.save(existingBook);
        }
    }

    @DeleteMapping("/{id}")
    public void deleteBook(@PathVariable("id") int id) {
        service.deleteById(id);
    }
}
