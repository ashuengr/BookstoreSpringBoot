package com.cg.bookstore.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cg.bookstore.beans.Book;
import com.cg.bookstore.beans.Category;
import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.daoservices.BookDao;
import com.cg.bookstore.daoservices.CategoryDao;
import com.cg.bookstore.daoservices.CustomerDao;
import com.cg.bookstore.exceptions.BookDetailsNotFoundException;
import com.cg.bookstore.exceptions.CategoryNotFoundException;
import com.cg.bookstore.exceptions.CustomerDetailsNotFoundException;
@Component("bookServices")
public class BookstoreServiceImpl implements BookstoreService {
	@Autowired
    private BookDao bookDao;
	@Autowired
    private CategoryDao categoryDao;
	@Autowired
	private CustomerDao customerDao;
	
	@Override
	public Customer acceptCustomerDetails(Customer customer) {
		return customerDao.save(customer);
	}
	@Override
	public Customer editCustomerDetails(Customer customer) {
		return customerDao.save(customer);
	}
	@Override
	public Customer getCustomerDetails(String customerEmailId) throws CustomerDetailsNotFoundException {
		return customerDao.findById(customerEmailId).orElseThrow(()->new CustomerDetailsNotFoundException("Customer details not found for id"+customerEmailId));
	}
	@Override
	public List<Customer> getAllCustomerDetails() {
		return customerDao.findAll();
	}
	@Override
	public boolean removeCustomerDetails(String customerEmailId) throws CustomerDetailsNotFoundException {
		customerDao.delete(getCustomerDetails(customerEmailId));
		return true;
	}

	@Override
	public Book acceptBookDetails(Book book) {
		return bookDao.save(book);
	}
	@Override
	public Category acceptCategoryDetails(Category category) {
		
		return categoryDao.save(category) ;
	}


	@Override
	public Book getBookDetails(long bookId) throws BookDetailsNotFoundException {
		return bookDao.findById(bookId).orElseThrow(()->new BookDetailsNotFoundException("Book details not found for id"+bookId));

	}
	@Override
	public Category getCategoryDetails(String bookCategory) throws CategoryNotFoundException {
		return categoryDao.findById(bookCategory).orElseThrow(()->new CategoryNotFoundException("Category details not found for id"+bookCategory));

	}
	
	
}
