package ng.edu.binghamuni.bookstore.Repository;


import ng.edu.binghamuni.bookstore.Domain.Book;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface BookRepository extends JpaRepository<Book,Integer> {

}

