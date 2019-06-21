package com.cg.bookstore.aspect;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.bookstore.exceptions.BookDetailsNotFoundException;
import com.cg.bookstore.response.CustomeResponse;

@ControllerAdvice
public class BookExceptionAspect {
	@ExceptionHandler(BookDetailsNotFoundException.class)
	  public ResponseEntity<CustomeResponse> handleBookDetailsNotFoundException(Exception e) {
	     
		  CustomeResponse response = new CustomeResponse(e.getMessage(),HttpStatus.EXPECTATION_FAILED.value());
		  return new ResponseEntity<>(response,HttpStatus.EXPECTATION_FAILED);
	  }
}
