package com.cg.bookstore.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import com.cg.bookstore.beans.Book;
import com.cg.bookstore.beans.Category;
import com.cg.bookstore.beans.Customer;
import com.cg.bookstore.exceptions.BookDetailsNotFoundException;
import com.cg.bookstore.exceptions.CategoryNotFoundException;
import com.cg.bookstore.exceptions.CustomerDetailsNotFoundException;
import com.cg.bookstore.services.BookstoreService;

@Controller
public class BookstoreController {
@Autowired
BookstoreService bookstoreService;

@RequestMapping(value= {"/acceptCustomerDetails"},method=RequestMethod.POST,
consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public ResponseEntity<String> acceptCustomerDetails(@ModelAttribute Customer customer){
	customer = bookstoreService.acceptCustomerDetails(customer);
return new ResponseEntity<>("Customer details successfully added.\n Customer ID: "+customer.getCustomerEmailId(),HttpStatus.OK);
}
@RequestMapping(value= {"/getCustomerDetails"},method=RequestMethod.GET,
		produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
		public ResponseEntity<Customer> getCustomerDetailsRequestParam(@RequestParam String customerEmailId) throws CustomerDetailsNotFoundException{
			Customer customer = bookstoreService.getCustomerDetails(customerEmailId);
		return new ResponseEntity<Customer>(customer,HttpStatus.OK);
		}
@RequestMapping(value= {"/updateCustomerDetails"},method=RequestMethod.POST,
consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public ResponseEntity<String> updateCustomerDetails(@ModelAttribute Customer customer){
	customer = bookstoreService.acceptCustomerDetails(customer);
return new ResponseEntity<>("Customer details successfully updated.\n Customer ID: "+customer.getCustomerEmailId(),HttpStatus.OK);
}
@RequestMapping(value= {"/getAllCustomerDetails"},method=RequestMethod.GET,
produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
public ResponseEntity<List<Customer>> getCustomerDetailsPathParam(){
return new ResponseEntity<List<Customer>>(bookstoreService.getAllCustomerDetails(),HttpStatus.OK);
}
@RequestMapping(value= {"/removeCustomerDetails"},method=RequestMethod.DELETE,
consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public ResponseEntity<String> removeEmployeeDetails(@RequestParam String customerEmailId) throws CustomerDetailsNotFoundException{
	bookstoreService.removeCustomerDetails(customerEmailId);
return new ResponseEntity<>("customer details removed successfully",HttpStatus.OK);
}
@RequestMapping(value= {"/acceptBookDetails"},method=RequestMethod.POST,
consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public ResponseEntity<String> acceptBookDetails(@ModelAttribute Book book){
	book = bookstoreService.acceptBookDetails(book);
return new ResponseEntity<>("book details successfully added.\n book ID: "+book.getBookId(),HttpStatus.OK);
}
@RequestMapping(value= {"/acceptCategoryDetails"},method=RequestMethod.POST,
consumes=MediaType.APPLICATION_FORM_URLENCODED_VALUE)
public ResponseEntity<String> acceptCategoryDetails(@ModelAttribute Category category){
	category = bookstoreService.acceptCategoryDetails(category);
return new ResponseEntity<>("Category details successfully added.\n Category ID: "+category.getBookCategory(),HttpStatus.OK);
}


@RequestMapping(value= {"/getBookDetails"},method=RequestMethod.GET,
produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
public ResponseEntity<Book> getBookDetailsRequestParam(@RequestParam long bookId) throws BookDetailsNotFoundException{
	Book book = bookstoreService.getBookDetails(bookId);
return new ResponseEntity<Book>(book,HttpStatus.OK);
}
@RequestMapping(value= {"/getCategoryDetails"},method=RequestMethod.GET,
produces=MediaType.APPLICATION_JSON_VALUE, headers="Accept=application/json")
public ResponseEntity<Category> getCategoryDetailsRequestParam(@RequestParam String bookCategory) throws CategoryNotFoundException{
	Category category = bookstoreService.getCategoryDetails(bookCategory);
return new ResponseEntity<Category>(category,HttpStatus.OK);
}
}
