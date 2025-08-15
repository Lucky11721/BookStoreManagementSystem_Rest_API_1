package in.bookstore.main.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import org.springframework.ui.Model;
import in.bookstore.main.entity.Book;
import in.bookstore.main.entity.MyBookList;
import in.bookstore.main.service.bookservice;
import in.bookstore.main.service.mybookservice;

@Controller
public class bookController {

    @Autowired
    private bookservice service;
    
    @Autowired
    private mybookservice mybookservice;

    @GetMapping("/home")
    public String home() {
        return "home";
    }
    
    @GetMapping("/book_register")
    public String registerBook() {
        return "bookRegister";
    }

    @GetMapping("/availabel_books") // consider renaming to /available_books
    public ModelAndView availableBooks() {
        List<Book> list = service.getallbooks();
        ModelAndView mv = new ModelAndView();
        mv.setViewName("availableBooks");
        mv.addObject("book", list);
        return mv;
    }

    @PostMapping("/save")
    public String addbooks(@ModelAttribute Book b) {
        service.save(b);
        return "redirect:/availabel_books";
    }

    @GetMapping("/my_books")
    public String myBooks(Model model) {
        List<MyBookList> list = mybookservice.getmybooks();
        model.addAttribute("myBooks", list);
        return "mybooks";
    }

    @RequestMapping("/mylist/{id}")
    public String getMyList(@PathVariable("id") int id) {
        Book book = service.getbookbyId(id);
        MyBookList mb = new MyBookList(book.getId(), book.getBookname(), book.getAuthor(), book.getPrice());
        mybookservice.savemybook(mb);
        return "redirect:/my_books";
    }

    @RequestMapping("/editbook/{id}")
    public String bookEdit(@PathVariable("id") int id, Model model) {
        Book book = service.getbookbyId(id);
        model.addAttribute("book", book);
        return "bookedit";
    }

    @RequestMapping("/deleteBook/{id}")
    public String deletebook(@PathVariable("id") int id) {
        service.deletebyId(id);
        return "redirect:/availabel_books";
    }
}
