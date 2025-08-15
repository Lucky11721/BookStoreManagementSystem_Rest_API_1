package in.bookstore.main.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import in.bookstore.main.service.mybookservice;

@Controller
public class mybooklistcontroller {
	@Autowired
	private mybookservice mybookservice;
	 
    @RequestMapping("/deleteMyList/{id}")
	public String deletemybook(@PathVariable("id") int id) {
    	mybookservice.deletebyId(id);
		 return "redirect:/my_books";
	}
	
}
