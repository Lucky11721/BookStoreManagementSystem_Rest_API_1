package in.bookstore.main.service;

import java.util.List;

import in.bookstore.main.entity.Book;

public interface bookservice  {
   
	public void save(Book b);
	
	public List<Book> getallbooks();
	
	public Book getbookbyId(int id);
	
	public void deletebyId(int id);
	
}
