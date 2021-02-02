package org.fujitsu.training.codes;

import org.fujitsu.training.codes.exceptions.BookException;

public class Book {
	
	private String name;
	private Author author;
	private Double price;
	private Integer qtyInStock;
	private static int counter;
	
	public Book() {
		// TODO Auto-generated constructor stub
	}
	
	private Book(String name, Author author, Double price, Integer qtyInStock) {
		this.name = name;
		this.author = author;
		this.price = price;
		this.qtyInStock = qtyInStock;
	}
	
	public static Book getInstance() throws BookException, Exception{
		if (counter < 5) {
			counter++;
			return new Book();
		} else {
			throw new BookException();
		}	
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Author getAuthor() {
		return author;
	}

	public void setAuthor(Author author) {
		this.author = author;
	}

	public Double getPrice() {
		return price;
	}

	public void setPrice(Double price) {
		this.price = price;
	}

	public Integer getQtyInStock() {
		return qtyInStock;
	}

	public void setQtyInStock(Integer qtyInStock) {
		this.qtyInStock = qtyInStock;
	}
	
	@Override
	public String toString() {
		String info = new String(this.name + ", " + this.author + ", " + this.price + ", " + this.qtyInStock);
		return info;
	}

}
