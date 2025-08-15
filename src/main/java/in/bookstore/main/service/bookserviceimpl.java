package in.bookstore.main.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import in.bookstore.main.entity.Book;
import in.bookstore.main.repository.bookrepository;

@Service
public class bookserviceimpl implements bookservice {
    
	@Autowired
	private bookrepository bookrepository;

	@Override
	public void save(Book b) {
		 bookrepository.save(b);
	}

	@Override
	public List<Book> getallbooks() {
		
		return bookrepository.findAll();
	}

	@Override
	public Book getbookbyId(int id) {
		return bookrepository.findById(id).get();
	}

	@Override
	public void deletebyId(int id) {
		// TODO Auto-generated method stub
		bookrepository.deleteById(id);
	}
	
	
	
	
}
