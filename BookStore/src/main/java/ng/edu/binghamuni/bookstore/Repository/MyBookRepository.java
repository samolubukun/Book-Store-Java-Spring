package ng.edu.binghamuni.bookstore.Repository;

import ng.edu.binghamuni.bookstore.Domain.MyBookList;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface MyBookRepository extends JpaRepository<MyBookList,Integer> {

}