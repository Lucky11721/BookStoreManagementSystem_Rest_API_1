package in.bookstore.main.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import in.bookstore.main.entity.MyBookList;

@Repository
public interface mybookrepositry extends JpaRepository<MyBookList, Integer>{
 
}
