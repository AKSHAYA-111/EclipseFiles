package com.cts.model;

public class Book {
private int isbn;
private String bname;
private String author;
private float cost;
public Book(int isbn, String bname, String author, float cost) {
	super();
	this.isbn = isbn;
	this.bname = bname;
	this.author = author;
	this.cost = cost;
}
@Override
public String toString() {
	return "Book [isbn=" + isbn + ", bname=" + bname + ", author=" + author + ", cost=" + cost + "]";
}

}
