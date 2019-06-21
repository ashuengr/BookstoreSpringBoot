package com.cg.bookstore.services;

import java.util.List;

import com.cg.bookstore.beans.Book;
import com.cg.bookstore.beans.Category;
import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.exceptions.BookDetailsNotFoundException;
import com.cg.bookstore.exceptions.CategoryNotFoundException;
import com.cg.bookstore.exceptions.CustomerDetailsNotFoundException;

public interface BookstoreService {
	Customer  acceptCustomerDetails(Customer customer);
    Customer editCustomerDetails(Customer customer);
    List<Customer> getAllCustomerDetails() ;
    boolean removeCustomerDetails(String customerEmailId) throws CustomerDetailsNotFoundException; 
	Book acceptBookDetails(Book book);
    Category acceptCategoryDetails(Category category);
	Customer getCustomerDetails(String customerEmailId) throws CustomerDetailsNotFoundException;
	Book getBookDetails(long bookId) throws BookDetailsNotFoundException;
	Category getCategoryDetails(String bookCategory) throws CategoryNotFoundException;

 

}
