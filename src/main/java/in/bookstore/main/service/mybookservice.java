package in.bookstore.main.service;


import java.util.List;

import in.bookstore.main.entity.MyBookList;

public interface mybookservice {
   
	
	public void savemybook(MyBookList mb);
	
     public List<MyBookList> getmybooks();
     public void deletebyId(int id);
}
