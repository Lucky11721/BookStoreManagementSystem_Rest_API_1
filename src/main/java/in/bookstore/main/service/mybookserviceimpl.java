package in.bookstore.main.service;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;


import in.bookstore.main.entity.MyBookList;
import in.bookstore.main.repository.mybookrepositry;

@Service
public class mybookserviceimpl implements mybookservice{
     
	@Autowired
	private mybookrepositry mybookrepo;

	@Override
	public void savemybook(MyBookList mb) {
	    mybookrepo.save(mb);
		
	}

	@Override
	public List<MyBookList> getmybooks() {
		 return mybookrepo.findAll();
	}

	@Override
	public void deletebyId(int id) {
		mybookrepo.deleteById(id);
		
	}

	

	
	
}
