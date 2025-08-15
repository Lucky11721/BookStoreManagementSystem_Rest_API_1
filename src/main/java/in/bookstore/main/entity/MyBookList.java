package in.bookstore.main.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table
public class MyBookList {
    @Id
	private int id;
	private String bookname;
	private String author;
	private Double price;
	
	
	public MyBookList(int id, String bookname, String author, Double price) {
		super();
		this.id = id;
		this.bookname = bookname;
		this.author = author;
		this.price = price;
	}
	
	
	public MyBookList() {
		super();
		// TODO Auto-generated constructor stub
	}


	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getBookname() {
		return bookname;
	}
	public void setBookname(String bookname) {
		this.bookname = bookname;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	public Double getPrice() {
		return price;
	}
	public void setPrice(Double price) {
		this.price = price;
	}
	
}
