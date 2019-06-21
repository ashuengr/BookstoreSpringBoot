package com.cg.bookstore.beans;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;
@Entity
public class Book {
@Id
 private long bookId;
 private String bookTitle;
 @ManyToOne
 private Category bookCategory;
 private double bookPrice;
 private String author;
 private long isbn;
 private Date publishDate;
 private String bookDescription;
public long getBookId() {
	return bookId;
}
public void setBookId(long bookId) {
	this.bookId = bookId;
}
public String getBookTitle() {
	return bookTitle;
}
public void setBookTitle(String bookTitle) {
	this.bookTitle = bookTitle;
}
public Category getBookCategory() {
	return bookCategory;
}
public void setBookCategory(Category bookCategory) {
	this.bookCategory = bookCategory;
}
public double getBookPrice() {
	return bookPrice;
}
public void setBookPrice(double bookPrice) {
	this.bookPrice = bookPrice;
}
public String getAuthor() {
	return author;
}
public void setAuthor(String author) {
	this.author = author;
}
public long getIsbn() {
	return isbn;
}
public void setIsbn(long isbn) {
	this.isbn = isbn;
}
public Date getPublishDate() {
	return publishDate;
}
public void setPublishDate(Date publishDate) {
	this.publishDate = publishDate;
}
public String getBookDescription() {
	return bookDescription;
}
public void setBookDescription(String bookDescription) {
	this.bookDescription = bookDescription;
}
public Book() {
	super();
}
public Book(long bookId, String bookTitle, Category bookCategory, double bookPrice, String author, long isbn,
		Date publishDate, String bookDescription) {
	super();
	this.bookId = bookId;
	this.bookTitle = bookTitle;
	this.bookCategory = bookCategory;
	this.bookPrice = bookPrice;
	this.author = author;
	this.isbn = isbn;
	this.publishDate = publishDate;
	this.bookDescription = bookDescription;
}
@Override
public int hashCode() {
	final int prime = 31;
	int result = 1;
	result = prime * result + ((author == null) ? 0 : author.hashCode());
	result = prime * result + ((bookCategory == null) ? 0 : bookCategory.hashCode());
	result = prime * result + ((bookDescription == null) ? 0 : bookDescription.hashCode());
	result = prime * result + (int) (bookId ^ (bookId >>> 32));
	long temp;
	temp = Double.doubleToLongBits(bookPrice);
	result = prime * result + (int) (temp ^ (temp >>> 32));
	result = prime * result + ((bookTitle == null) ? 0 : bookTitle.hashCode());
	result = prime * result + (int) (isbn ^ (isbn >>> 32));
	result = prime * result + ((publishDate == null) ? 0 : publishDate.hashCode());
	return result;
}
@Override
public boolean equals(Object obj) {
	if (this == obj)
		return true;
	if (obj == null)
		return false;
	if (getClass() != obj.getClass())
		return false;
	Book other = (Book) obj;
	if (author == null) {
		if (other.author != null)
			return false;
	} else if (!author.equals(other.author))
		return false;
	if (bookCategory == null) {
		if (other.bookCategory != null)
			return false;
	} else if (!bookCategory.equals(other.bookCategory))
		return false;
	if (bookDescription == null) {
		if (other.bookDescription != null)
			return false;
	} else if (!bookDescription.equals(other.bookDescription))
		return false;
	if (bookId != other.bookId)
		return false;
	if (Double.doubleToLongBits(bookPrice) != Double.doubleToLongBits(other.bookPrice))
		return false;
	if (bookTitle == null) {
		if (other.bookTitle != null)
			return false;
	} else if (!bookTitle.equals(other.bookTitle))
		return false;
	if (isbn != other.isbn)
		return false;
	if (publishDate == null) {
		if (other.publishDate != null)
			return false;
	} else if (!publishDate.equals(other.publishDate))
		return false;
	return true;
}
@Override
public String toString() {
	return "Book [bookId=" + bookId + ", bookTitle=" + bookTitle + ", bookCategory=" + bookCategory + ", bookPrice="
			+ bookPrice + ", author=" + author + ", isbn=" + isbn + ", publishDate=" + publishDate
			+ ", bookDescription=" + bookDescription + "]";
}
	
}
