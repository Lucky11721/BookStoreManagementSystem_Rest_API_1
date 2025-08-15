package in.bookstore.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.bookstore.main.entity.Book;

@Repository
public interface bookrepository extends JpaRepository<Book, Integer> {

}
